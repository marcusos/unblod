package unblod.ui.dialogs;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import unblod.dataset.model.dataset.NamespaceDefinition;

import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;

public class NamespaceDialog extends TitleAreaDialog{

	NamespaceDefinition namespace = null;

	private Text prefixTxt;
	private Text namespaceTxt;
	
	public NamespaceDialog(Shell parentShell, NamespaceDefinition namespace) {
		super(parentShell);
		this.namespace = namespace;
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
		
		if (prefixTxt.getText() == null || prefixTxt.getText().equals("")) {
			setMessage("The namespace prefix must be specified");
			valid = false;
		}
		else if (namespaceTxt.getText() == null || namespaceTxt.getText().equals("")) {
			setMessage("The namespace URI must be specified");
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
		
		if (namespace.getPrefix() != null) {
			prefixTxt.setText(namespace.getPrefix());
		}
		
		if (namespace.getNamespace() != null) {
			namespaceTxt.setText(namespace.getNamespace());
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
		
		Label lblPrefix = new Label(composite, SWT.NONE);
		lblPrefix.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPrefix.setText("Prefix");
		
		prefixTxt = new Text(composite, SWT.BORDER);
		prefixTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNamespaceUri = new Label(composite, SWT.NONE);
		lblNamespaceUri.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNamespaceUri.setText("Namespace URI");
		
		namespaceTxt = new Text(composite, SWT.BORDER);
		namespaceTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		// Build the separator line
		//Label titleBarSeparator = new Label(composite, SWT.HORIZONTAL
		//		| SWT.SEPARATOR);
		//titleBarSeparator.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		namespaceTxt.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				validateInputs();
			}
		});
		
		prefixTxt.addModifyListener(new ModifyListener() {
			
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
		this.namespace.setNamespace(namespaceTxt.getText());
		this.namespace.setPrefix(prefixTxt.getText());
		
		super.okPressed();
	}
	
	public NamespaceDefinition getNamespace() {
		return namespace;
	}

	public void setNamespace(NamespaceDefinition namespace) {
		this.namespace = namespace;
	}

}
