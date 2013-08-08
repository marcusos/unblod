package unblod.ui.dialogs;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import unblod.dataset.model.dataset.SClass;
import org.eclipse.wb.swt.SWTResourceManager;


public class SClassDialog extends TitleAreaDialog{

	SClass sClass = null;
	private Text name;
	private Text uriTxt; 
	
	public SClassDialog(Shell parentShell, SClass namespace) {
		super(parentShell);
		this.sClass = namespace;
	}
	
	 @Override
	  public void create() {
		 
	    super.create();
	    setTitle("Class dialog.");
	    initializeInputs();
	    validateInputs();
	  
	 }

	
	public void validateInputs() {
		Boolean valid = true;
		
		if (name.getText() == null || name.getText().equals("")) {
			setMessage("The name of the class must be specified");
			valid = false;
		}
		
		if(valid){
			if (uriTxt.getText() == null || uriTxt.getText().equals("")) {
				setMessage("The base URI must be specified");
				valid = false;
			}
		}
		
		
		if (!valid) {
			this.getButton(IDialogConstants.OK_ID).setEnabled(false);
		}
		else {
			this.getButton(IDialogConstants.OK_ID).setEnabled(true);
			setMessage(null);
		}
		
	}
	
	public void initializeInputs() {
		
		if (sClass.getName() != null) {
			name.setText(sClass.getName());
		}
		
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setFont(parent.getFont());
		
		Label lblName = new Label(composite, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText("Name");
		
		name = new Text(composite, SWT.BORDER);
		name.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label = new Label(composite, SWT.NONE);
		label.setText("Resource URI");
		label.setFont(SWTResourceManager.getFont("Lucida Grande", 11, SWT.BOLD));
		label.setAlignment(SWT.RIGHT);
		new Label(composite, SWT.NONE);
		
		Label lblUri = new Label(composite, SWT.NONE);
		lblUri.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblUri.setText("Base URI");
		
		uriTxt = new Text(composite, SWT.BORDER);
		uriTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		
		name.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				validateInputs();
			}
		});
		
		uriTxt.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				validateInputs();
			}
		});
		
		return composite;
	}
	
	@Override
	protected void okPressed() {
		
		// populate de object
		this.sClass.setName(name.getText());
		this.sClass.setUri(uriTxt.getText());
		
		super.okPressed();
	}
	
	public SClass getSClass() {
		return sClass;
	}

}
