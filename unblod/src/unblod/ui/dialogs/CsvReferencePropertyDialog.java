package unblod.ui.dialogs;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.model.dataset.ReferenceProperty;
import unblod.util.Util;

import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;

public class CsvReferencePropertyDialog extends TitleAreaDialog{

	ReferenceProperty referenceProperty = null;
	Dataset dataset;

	Shell shell;
	private Text nameTxt;
	private Text customTxt;
	
	Label lblResultPattern;
	
	ComboViewer colComboViewer;
	ComboViewer transformationComboViewer;
	
	Button btnCustom;
	private Text uriTxt;
	
	public CsvReferencePropertyDialog(Shell parentShell, ReferenceProperty property, Dataset dataset) {
		super(parentShell);
		this.shell = parentShell;
		this.referenceProperty = property;
		this.dataset = dataset;
		
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
		else if (btnCustom.getSelection()) {
			if (customTxt.getText() == null || customTxt.getText().equals("")) {
				setMessage("The custom pattern must be specified");
				valid = false;
			}
		}
		else {
			if (uriTxt.getText() == null || uriTxt.getText().equals("")) {
				setMessage("The URI must be specified");
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
		
		uriTxt.setText(dataset.getBaseUri());
		
		if (referenceProperty.getName() != null) {
			nameTxt.setText(referenceProperty.getName());
		}
		
		if (referenceProperty.getCustomPattern() != null) {
			customTxt.setText(referenceProperty.getCustomPattern());
		}
		else {
			if (referenceProperty.getSourceCSVCol() != null) {
				
				int i=0;
				for (String col : Util.CSV_COLUMNS) {
					if (col.equals(referenceProperty.getSourceCSVCol())) {
						colComboViewer.getCombo().select(i);
						break;
					}
					i++;
				}
			}
			if (referenceProperty.getTransformation() != null) {
				
				int i=0;
				for (String col : Util.CSV_TRANSFORMATIONS) {
					if (col.equals(referenceProperty.getTransformation())) {
						transformationComboViewer.getCombo().select(i);
						break;
					}
					i++;
				}
			}
			
			if (referenceProperty.getUri() != null) {
				uriTxt.setText(referenceProperty.getUri());
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
		
		Label label = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gd_label = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_label.widthHint = 344;
		label.setLayoutData(gd_label);
		
		Label lblSourceColumn = new Label(composite, SWT.NONE);
		lblSourceColumn.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSourceColumn.setText("Source Column");
		
		colComboViewer = new ComboViewer(composite, SWT.NONE);
		Combo combo = colComboViewer.getCombo();
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblTransformation = new Label(composite, SWT.NONE);
		lblTransformation.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTransformation.setText("Transformation");
		
		transformationComboViewer = new ComboViewer(composite, SWT.NONE);
		Combo combo_1 = transformationComboViewer.getCombo();
		combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblUri = new Label(composite, SWT.NONE);
		lblUri.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblUri.setText("URI");
		
		uriTxt = new Text(composite, SWT.BORDER);
		uriTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		
		lblResultPattern = new Label(composite, SWT.NONE);
		//gd_lblResultPattern.widthHint = 168;
		lblResultPattern.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		//lblResultPattern.setText("ResultPattern");
		new Label(composite, SWT.NONE);
		
		Label label_1 = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gd_label_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_label_1.widthHint = 343;
		label_1.setLayoutData(gd_label_1);
		
		btnCustom = new Button(composite, SWT.CHECK);
		btnCustom.setAlignment(SWT.RIGHT);
		btnCustom.setText("Custom");
		
		customTxt = new Text(composite, SWT.BORDER);
		customTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
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
		
		uriTxt.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				validateInputs();
			}
		});
		
		customTxt.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				validateInputs();
			}
		});
		
		
		btnCustom.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				updateControlsByCustomBtn();
				validateInputs();
				
				super.widgetSelected(e);
			}
		});
		
		
		colComboViewer.setContentProvider(ArrayContentProvider.getInstance());
		transformationComboViewer.setContentProvider(ArrayContentProvider.getInstance());
		
		colComboViewer.setInput(Util.CSV_COLUMNS);
		transformationComboViewer.setInput(Util.CSV_TRANSFORMATIONS);
		
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
		
		uriTxt.addFocusListener(new FocusListener() {
			
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
		
		colComboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				// TODO Auto-generated method stub
				writePropertyPreview();
			}
		});
		
		transformationComboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				// TODO Auto-generated method stub
				writePropertyPreview();
			}
		});
		
		colComboViewer.getCombo().select(0);
		transformationComboViewer.getCombo().select(0);
		
		updateControlsByCustomBtn();
		
		return composite;
	}
	
	protected void writePropertyPreview() {
		// TODO Auto-generated method stub
		IStructuredSelection selection = (IStructuredSelection) colComboViewer.getSelection();
		String col = (String)selection.getFirstElement();
		
		col = "?"+col;
		
		selection = (IStructuredSelection) transformationComboViewer.getSelection();
		String transformation = (String)selection.getFirstElement();
		
		String uri = this.uriTxt.getText();
		String propertyName = this.nameTxt.getText();
		
		
		String propertyPreview  = "";
		
		if (transformation.equals("none")) {
			propertyPreview += propertyName + "  " + uri + "<" + col + ">";
		}
		else {
			propertyPreview += propertyName + "  " + uri + "<" + transformation + "("+col+")" + ">" ;
		}

		
		lblResultPattern.setText(propertyPreview);
	}

	public void updateControlsByCustomBtn() {
		if (btnCustom.getSelection()) {
			customTxt.setEnabled(true);
			
			colComboViewer.getCombo().setEnabled(false);
			transformationComboViewer.getCombo().setEnabled(false);
			uriTxt.setEnabled(false);
		}
		else {
			customTxt.setEnabled(false);
			
			colComboViewer.getCombo().setEnabled(true);
			transformationComboViewer.getCombo().setEnabled(true);
			uriTxt.setEnabled(true);
		}
	}
	
	@Override
	protected void okPressed() {
		
		// populate de object
		/*this.rdfConstruction.setName(nameTxt.getText());
		this.rdfConstruction.setCsvFileURL(urlTxt.getText());*/
		
		this.referenceProperty.setName(nameTxt.getText());
		
		if (btnCustom.getSelection()){
			this.referenceProperty.setCustomPattern(customTxt.getText());
		}
		else {
			IStructuredSelection selection = (IStructuredSelection) colComboViewer.getSelection();
			String col = (String)selection.getFirstElement();
			
			selection = (IStructuredSelection) transformationComboViewer.getSelection();
			String transformation = (String)selection.getFirstElement();
			
			this.referenceProperty.setSourceCSVCol(col);
			this.referenceProperty.setTransformation(transformation);
			this.referenceProperty.setUri(uriTxt.getText());
			
			this.referenceProperty.setCustomPattern(null);
		}
		
		
		super.okPressed();
	}
	
	public ReferenceProperty getReferenceProperty() {
		return referenceProperty;
	}

	public void setReferenceProperty(ReferenceProperty property) {
		this.referenceProperty = property;
	}

}
