package unblod.ui.dialogs;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import unblod.dataset.model.dataset.SProperty;
import unblod.util.Util;


public class SPropertyDialog extends TitleAreaDialog{
	SProperty property = null;

	Shell shell;
	private Text nameTxt;

	ComboViewer dataTypeComboViewer;

//	private Text customTxt;
//	Button btnCustom;
	
	public SPropertyDialog(Shell parentShell, SProperty property) {
		super(parentShell);
		
		this.shell = parentShell;
		this.property = property;
		
		System.out.println(property.toString());
	}
	
	 @Override
	  public void create() {
		 
	    super.create();
	    // Set the title
	    setTitle("Property dialog.");
	    // Set the message
	    //setMessage("This is a TitleAreaDialog",  IMessageProvider.INFORMATION);
	    initializeInputs();
	    validateInputs();
	    writePropertyPreview();
	    
	  }

	
	public void validateInputs() {
		Boolean valid = true;
		
		if (nameTxt.getText() == null || nameTxt.getText().equals("")) {
			setMessage("The name must be specified");
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
		
		if (property.getName() != null) {
			nameTxt.setText(property.getName());
		}

		if (property.getDataType() != null) {

			int i=0;
			for (String col : Util.XSD_DATATYPES) {
				if (col.equals(property.getDataType())) {
					dataTypeComboViewer.getCombo().select(i);
					break;
				}
				i++;
			}
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
		
		nameTxt = new Text(composite, SWT.BORDER);
		nameTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
//		Label label = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
//		GridData gd_label = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
//		gd_label.widthHint = 344;
//		label.setLayoutData(gd_label);
		
		Label lblDataType = new Label(composite, SWT.NONE);
		lblDataType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDataType.setText("Data Type");
		
		dataTypeComboViewer = new ComboViewer(composite, SWT.NONE);
		Combo combo_3 = dataTypeComboViewer.getCombo();
		combo_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		
		dataTypeComboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				// TODO Auto-generated method stub
				writePropertyPreview();
			}
		});
		
		dataTypeComboViewer.getCombo().select(0);
		
//		Label label_1 = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
//		GridData gd_label_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
//		gd_label_1.widthHint = 343;
//		label_1.setLayoutData(gd_label_1);
		
//		btnCustom = new Button(composite, SWT.CHECK);
//		btnCustom.setAlignment(SWT.RIGHT);
//		btnCustom.setText("Custom");
//		
//		customTxt = new Text(composite, SWT.BORDER);
//		customTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		// Build the separator line
		//Label titleBarSeparator = new Label(composite, SWT.HORIZONTAL
		//		| SWT.SEPARATOR);
		//titleBarSeparator.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		nameTxt.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				validateInputs();
			}
		});
		
//		customTxt.addModifyListener(new ModifyListener() {
//			
//			@Override
//			public void modifyText(ModifyEvent e) {
//				// TODO Auto-generated method stub
//				validateInputs();
//			}
//		});
//		
//		
//		btnCustom.addSelectionListener(new SelectionAdapter() {
//			
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//				// TODO Auto-generated method stub
//				updateControlsByCustomBtn();
//				validateInputs();
//				
//				super.widgetSelected(e);
//			}
//		});
//		
	
		dataTypeComboViewer.setContentProvider(ArrayContentProvider.getInstance());
		dataTypeComboViewer.setInput(Util.XSD_DATATYPES);
		
		
		nameTxt.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				writePropertyPreview();
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
//		updateControlsByCustomBtn();
		
		return composite;
	}
	
	protected void writePropertyPreview() {
		// TODO Auto-generated method stub
//		IStructuredSelection selection = (IStructuredSelection) colComboViewer.getSelection();
//		String col = (String)selection.getFirstElement();
//		
//		col = "?"+col;
//		
//		selection = (IStructuredSelection) transformationComboViewer.getSelection();
//		String transformation = (String)selection.getFirstElement();
//		
//		selection = (IStructuredSelection) dataTypeComboViewer.getSelection();
//		String dataType = (String)selection.getFirstElement();
//		
//		String propertyName = this.nameTxt.getText();
//		
//		String propertyPreview  = "";
//		
//		if (transformation.equals("none")) {
//			propertyPreview += propertyName + "  <" + col + ">";
//		}
//		else {
//			propertyPreview += propertyName + "  <" + transformation + "("+col+")" + ">" ;
//		}
//		
//		if (!dataType.equals("none")) {
//			propertyPreview += "^^" + dataType;
//		}
//		
//		lblResultPattern.setText(propertyPreview);
		
	}

	public void updateControlsByCustomBtn() {
//		if (btnCustom.getSelection()) {
//			customTxt.setEnabled(true);
//		
//			dataTypeComboViewer.getCombo().setEnabled(false);
//		}
//		else {
//			customTxt.setEnabled(false);
//			
//			dataTypeComboViewer.getCombo().setEnabled(true);
//		}
	}
	
	@Override
	protected void okPressed() {
		
		// populate de object
		/*this.rdfConstruction.setName(nameTxt.getText());
		this.rdfConstruction.setCsvFileURL(urlTxt.getText());*/
		
		this.property.setName(nameTxt.getText());
		

		IStructuredSelection selection = (IStructuredSelection) dataTypeComboViewer.getSelection();
		String dataType= (String)selection.getFirstElement();

		this.property.setDataType(dataType);
		
		super.okPressed();
	}
	
	public SProperty getSProperty() {
		return property;
	}

	public void setSProperty(SProperty property) {
		this.property = property;
	}


}
