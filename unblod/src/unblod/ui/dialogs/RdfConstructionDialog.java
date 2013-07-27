package unblod.ui.dialogs;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.model.dataset.RdfConstruction;
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
import org.eclipse.wb.swt.SWTResourceManager;

public class RdfConstructionDialog extends TitleAreaDialog{

	RdfConstruction rdfConstruction = null;
	Dataset dataset = null;
	
	Shell shell;
	private Text nameTxt;
	private Text uriTxt;
	private Text linesTxt;
	private Text customTxt;
	private Text classsTxt;
	
	Label lblResultPattern;
	
	ComboViewer colComboViewer;
	ComboViewer transformationComboViewer;
	
	Button btnCustom;
	
	public RdfConstructionDialog(Shell parentShell, RdfConstruction rdfConstruction, Dataset dataset) {
		super(parentShell);
		this.shell = parentShell;
		this.rdfConstruction = rdfConstruction;
		this.dataset = dataset;
		
	}
	
	 @Override
	  public void create() {
	    super.create();
	    // Set the title
	    setTitle("RDF construction dialog.");
	    // Set the message
	    //setMessage("This is a TitleAreaDialog",  IMessageProvider.INFORMATION);
	    initializeInputs();
	    validateInputs();
	    writeUriPreview();
	  }

	
	public void validateInputs() {
		Boolean valid = true;
		
		if (nameTxt.getText() == null || nameTxt.getText().equals("")) {
			setMessage("The name must be specified");
			valid = false;
		}
		else if (btnCustom.getSelection()) {
			if (customTxt.getText() == null || customTxt.getText().equals("")) {
				setMessage("The custom URI pattern must be specified");
				valid = false;
			}
		}
		else {
			if (uriTxt.getText() == null || uriTxt.getText().equals("")) {
				setMessage("The base resource URI must be specified");
				valid = false;
			}
			else if (classsTxt.getText() == null || classsTxt.getText().equals("")) {
				setMessage("The resource class type must be specified");
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
		
		if (rdfConstruction.getName() != null) {
			nameTxt.setText(rdfConstruction.getName());
		}
		
		linesTxt.setText(rdfConstruction.getLinesOffset() + "");
		
		if (rdfConstruction.getCustomUri() != null) {
			customTxt.setText(rdfConstruction.getCustomUri());
		}
		else {
			if (rdfConstruction.getSourceCsvCol() != null) {
				
				int i=0;
				for (String col : Util.CSV_COLUMNS) {
					if (col.equals(rdfConstruction.getSourceCsvCol())) {
						colComboViewer.getCombo().select(i);
						break;
					}
					i++;
				}
			}
			if (rdfConstruction.getTransformation() != null) {
				
				int i=0;
				for (String transformation : Util.CSV_TRANSFORMATIONS) {
					if (transformation.equals(rdfConstruction.getTransformation())) {
						transformationComboViewer.getCombo().select(i);
						break;
					}
					i++;
				}
			}
			
			if (rdfConstruction.getBaseUri() != null) {
				uriTxt.setText(rdfConstruction.getBaseUri());
			}
			
			if (rdfConstruction.getClassType() != null) {
				classsTxt.setText(rdfConstruction.getClassType());
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
		
		Label lblLinesOffset = new Label(composite, SWT.NONE);
		lblLinesOffset.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblLinesOffset.setText("Lines offset");
		
		linesTxt = new Text(composite, SWT.BORDER);
		linesTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		
		Label label = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gd_label = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_label.widthHint = 344;
		label.setLayoutData(gd_label);
		
		Label lblResource = new Label(composite, SWT.NONE);
		lblResource.setAlignment(SWT.RIGHT);
		lblResource.setFont(SWTResourceManager.getFont("Lucida Grande", 11, SWT.BOLD));
		lblResource.setText("Resource URI");
		new Label(composite, SWT.NONE);
		
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
		lblUri.setText("Base URI");
		
		uriTxt = new Text(composite, SWT.BORDER);
		uriTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Class");
		
		classsTxt = new Text(composite, SWT.BORDER);
		classsTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		
		lblResultPattern = new Label(composite, SWT.NONE);
		GridData gd_lblResultPattern = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		//gd_lblResultPattern.widthHint = 168;
		lblResultPattern.setLayoutData(gd_lblResultPattern);
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
		
		linesTxt.addModifyListener(new ModifyListener() {
			
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
		
		classsTxt.addModifyListener(new ModifyListener() {
			
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
		
		
		nameTxt.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				writeUriPreview();
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
				writeUriPreview();
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		classsTxt.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				writeUriPreview();
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		colComboViewer.setContentProvider(ArrayContentProvider.getInstance());
		transformationComboViewer.setContentProvider(ArrayContentProvider.getInstance());
		
		colComboViewer.setInput(Util.CSV_COLUMNS);
		transformationComboViewer.setInput(Util.CSV_TRANSFORMATIONS);
		
		colComboViewer.getCombo().select(0);
		transformationComboViewer.getCombo().select(0);
		
		colComboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				// TODO Auto-generated method stub
				writeUriPreview();
			}
		});
		
		transformationComboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				// TODO Auto-generated method stub
				writeUriPreview();
			}
		});
		
		updateControlsByCustomBtn();
		
		return composite;
	}
	
	protected void writeUriPreview() {
		// TODO Auto-generated method stub
		IStructuredSelection selection = (IStructuredSelection) colComboViewer.getSelection();
		String col = (String)selection.getFirstElement();
		
		col = "?"+col;
		
		selection = (IStructuredSelection) transformationComboViewer.getSelection();
		String transformation = (String)selection.getFirstElement();
		
		String uriPreview  = "";
		
		if (transformation.equals("none")) {
			uriPreview += uriTxt.getText() + "<" + col + ">";
		}
		else {
			uriPreview += uriTxt.getText() + "<" + transformation + "("+col+")" + ">" ;
		}
		
		if (classsTxt.getText() != null && !classsTxt.getText().equals("")) {
			uriPreview += " a " + classsTxt.getText();
		}
		
		lblResultPattern.setText(uriPreview);
		
	}

	public void updateControlsByCustomBtn() {
		if (btnCustom.getSelection()) {
			customTxt.setEnabled(true);
			
			colComboViewer.getCombo().setEnabled(false);
			transformationComboViewer.getCombo().setEnabled(false);
			uriTxt.setEnabled(false);
			classsTxt.setEnabled(false);
		}
		else {
			customTxt.setEnabled(false);
			
			colComboViewer.getCombo().setEnabled(true);
			transformationComboViewer.getCombo().setEnabled(true);
			uriTxt.setEnabled(true);
			classsTxt.setEnabled(true);
		}
	}
	
	@Override
	protected void okPressed() {
		
		// populate de object
		/*this.rdfConstruction.setName(nameTxt.getText());
		this.rdfConstruction.setCsvFileURL(urlTxt.getText());*/
		
		this.rdfConstruction.setName(nameTxt.getText());
		this.rdfConstruction.setLinesOffset(Integer.parseInt(linesTxt.getText()));
		
		if (btnCustom.getSelection()){
			this.rdfConstruction.setCustomUri(customTxt.getText());
		}
		else {
			IStructuredSelection selection = (IStructuredSelection) colComboViewer.getSelection();
			String col = (String)selection.getFirstElement();
			
			selection = (IStructuredSelection) transformationComboViewer.getSelection();
			String transformation = (String)selection.getFirstElement();
			
			this.rdfConstruction.setSourceCsvCol(col);
			this.rdfConstruction.setTransformation(transformation);
			this.rdfConstruction.setBaseUri(uriTxt.getText());
			this.rdfConstruction.setClassType(classsTxt.getText());
			
			this.rdfConstruction.setCustomUri(null);
		}
		
		
		super.okPressed();
	}
	
	public RdfConstruction getRdfConstruction() {
		return rdfConstruction;
	}

	public void setRdfConstruction(RdfConstruction rdfConstruction) {
		this.rdfConstruction = rdfConstruction;
	}

}
