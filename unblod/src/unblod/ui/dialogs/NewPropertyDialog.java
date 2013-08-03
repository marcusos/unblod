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
import unblod.dataset.model.dataset.SProperty;


public class NewPropertyDialog extends TitleAreaDialog{

	SProperty sProperty = null;
	private Text name;
	
	public NewPropertyDialog(Shell parentShell, SProperty nameProperty) {
		super(parentShell);
		this.sProperty = nameProperty;
	}
	
	 @Override
	  public void create() {
	    super.create();
	    // Set the title
	    setTitle("Namespace dialog.");
	    // Set the message
	    //setMessage("This is a TitleAreaDialog",  IMessageProvider.INFORMATION);
	    initializeInputs();
	    validateInputs();
	  }

	
	public void validateInputs() {
		Boolean valid = true;
		
		if (name.getText() == null || name.getText().equals("")) {
			setMessage("The name of the property must be specified");
			valid = false;
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
		
		if (sProperty.getName() != null) {
			name.setText(sProperty.getName());
		}
		
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		//layout.marginHeight = 0;
		//layout.marginWidth = 0;
		//layout.verticalSpacing = 0;
		//layout.horizontalSpacing = 0;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setFont(parent.getFont());
		
		Label lblName = new Label(composite, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText("Name");
		
		name = new Text(composite, SWT.BORDER);
		name.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		// Build the separator line
		//Label titleBarSeparator = new Label(composite, SWT.HORIZONTAL
		//		| SWT.SEPARATOR);
		//titleBarSeparator.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		name.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				validateInputs();
			}
		});
		
		return composite;
	}
	
	@Override
	protected void okPressed() {
		
		// populate de object
		this.sProperty.setName(name.getText());
		
		super.okPressed();
	}
	
	public SProperty getSProperty() {
		return sProperty;
	}

	public void setSProperty(SProperty sProperty) {
		this.sProperty = sProperty;
	}

}
