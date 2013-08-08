package unblod.ui.dialogs;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import unblod.dataset.model.dataset.ClassIntegration;
import unblod.dataset.model.dataset.CsvFile;
import unblod.dataset.model.dataset.CsvToRdfImportation;
import unblod.dataset.model.dataset.ExternalDataset;
import unblod.dataset.model.dataset.RdfConstruction;
import unblod.dataset.model.dataset.SClass;
import unblod.dataset.model.dataset.Schema;
import unblod.dataset.service.DatasetModelService;


public class ClassMappingDialog extends TitleAreaDialog{

	private ClassIntegration classIntegration = null;
	private Text textSparqlExpression;
	private ExternalDataset externalDataset;
	private Schema schema; 
	
	private Combo comboOriginClass; 
	private Combo comboDestinationClass; 
	
	private Button btnClassToClass; 
	private Button btnSparqlExpression; 
	
	private SClass[] destinationClassArray; 
	private RdfConstruction[] originClassArray; 
	
	
	public ClassMappingDialog(Shell parentShell, ClassIntegration _classIntegration, 
			Schema schema) {
		super(parentShell);
		this.classIntegration = _classIntegration;
		externalDataset = (ExternalDataset)this.classIntegration.eContainer(); 
		this.schema = schema; 
	}
	
	public ClassMappingDialog(Shell parentShell, ClassIntegration _classIntegration, 
			ExternalDataset externalDataset, Schema schema) {
		
		super(parentShell);
		this.classIntegration = _classIntegration;
		this.externalDataset = externalDataset; 
		this.schema = schema; 
	
	}
	
	 @Override
	  public void create() {
		 
	    super.create();
	    setTitle("Class mapping dialog.");
	    initializeInputs();
	    validateInputs();
	  
	 }

	
	public void validateInputs() {
		Boolean valid = true;
		
		if (comboDestinationClass.getSelectionIndex() == -1) {
			setMessage("The destination class must be selected");
			valid = false;
		}
		
		if(valid){
			if (btnClassToClass.getSelection() && comboOriginClass.getSelectionIndex() == -1){
				setMessage("The origin class must be selected");
				valid = false; 
			}
		}
		
		if(valid){
			if((btnSparqlExpression.getSelection()) && 
					((textSparqlExpression.getText() == null) || (textSparqlExpression.getText().equals("")) )){
				setMessage("The sparql expression must be selected");
				valid = false; 
			}
		}
		
		if(this.getButton(IDialogConstants.OK_ID) != null){
			if (!valid) {
				this.getButton(IDialogConstants.OK_ID).setEnabled(false);
			}
			else {
				this.getButton(IDialogConstants.OK_ID).setEnabled(true);
				setMessage(null);
			}
		}
		
	}
	
	public void initializeInputs() {
		
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
		lblName.setText("Destination Class");
		
		comboDestinationClass = new Combo(composite, SWT.NONE);
		comboDestinationClass.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		comboDestinationClass.setItems(getDestinationSClassList());
		
		comboDestinationClass.addModifyListener(new ModifyListener(){

			@Override
			public void modifyText(ModifyEvent e) {
				validateInputs(); 
			}
			
		});
		
		Label lblUri = new Label(composite, SWT.NONE);
		lblUri.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblUri.setText("Type Mapping");
		
		btnClassToClass = new Button(composite, SWT.RADIO);
		btnClassToClass.setText("Class To Class");
		new Label(composite, SWT.NONE);

		
		btnSparqlExpression = new Button(composite, SWT.RADIO);
		btnSparqlExpression.setText("Sparql Expression");
		new Label(composite, SWT.NONE);
		
		Label label_1 = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblDestinationClass = new Label(composite, SWT.NONE);
		lblDestinationClass.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDestinationClass.setText("Origin Class");
		
		comboOriginClass = new Combo(composite, SWT.NONE);
		comboOriginClass.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		
		comboOriginClass.setItems(getOriginClasses());
		
		comboOriginClass.addModifyListener(new ModifyListener(){

			@Override
			public void modifyText(ModifyEvent e) {
				validateInputs(); 
			}
			
		});
		
		Label label = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblSparqlExpression = new Label(composite, SWT.NONE);
		lblSparqlExpression.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSparqlExpression.setText("Sparql Expression");
		
		textSparqlExpression = new Text(composite, SWT.BORDER);
		textSparqlExpression.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		textSparqlExpression.addModifyListener(new ModifyListener(){

			@Override
			public void modifyText(ModifyEvent e) {
				validateInputs(); 
			}
			
		});
		
		btnClassToClass.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				textSparqlExpression.setEnabled(false);
				comboOriginClass.setEnabled(true);
				validateInputs(); 
			}
		});
		
		btnSparqlExpression.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				comboOriginClass.setEnabled(false);
				textSparqlExpression.setEnabled(true);
				validateInputs(); 
			}
		});
		
		if(classIntegration.getSclass() != null){

			int index = -1; 
			for(int i = 0 ; i < destinationClassArray.length; i++){
				if(classIntegration.getSclass().getName().equals(destinationClassArray[i].getName())){
					index = i; 
				}
			}
			
			if(index!= -1){
				comboDestinationClass.select(index);
			}
		}
		
		if(classIntegration.getExternalClass() != null){
			int index = -1; 
			for(int i = 0 ; i < originClassArray.length; i++){
				if(classIntegration.getExternalClass().getName().equals(originClassArray[i].getName())){
					index = i; 
				}
			}
			
			if(index!= -1){
				comboOriginClass.select(index);
				btnClassToClass.setSelection(true);
				textSparqlExpression.setEnabled(false);
				comboOriginClass.setEnabled(true);
				
			}
		}
		
		if(classIntegration.getExpression() != null){
			textSparqlExpression.setText(classIntegration.getExpression());
			btnSparqlExpression.setSelection(true);
			textSparqlExpression.setEnabled(true);
			comboOriginClass.setEnabled(false);
		}
		
		return composite;
	}

	private String[] getOriginClasses() {
		
		DatasetModelService datasetModelService =  DatasetModelService.getInstace();
		
		CsvToRdfImportation cvsImportation = datasetModelService.getCsvImportation(externalDataset.getDataset()); 
		
		List<CsvFile> listCsvFiles = cvsImportation.getFromFiles(); 
		List<String> classes = new ArrayList<String>(); 
		
		List<RdfConstruction> listRdfConstruction = new ArrayList<RdfConstruction>(); 
		for(CsvFile file: listCsvFiles){
			for(RdfConstruction rdfConstruction : file.getRdfConstructions()){
				classes.add(rdfConstruction.getName()); 
				listRdfConstruction.add(rdfConstruction); 
			}
		}
		
		originClassArray = listRdfConstruction.toArray(new RdfConstruction[listRdfConstruction.size()]); 
		
		String[] originClassItens = classes.toArray(new String[classes.size()]);
		return originClassItens;
	}

	private String[] getDestinationSClassList() {
		
		List<SClass> sClassList = schema.getClasses(); 
		String[] itemsDestClassCombo = new String[sClassList.size()];
		destinationClassArray = new SClass[sClassList.size()]; 
		
		int i = 0; 
		for(SClass sClass: sClassList){
			itemsDestClassCombo[i] = sClass.getName();
			destinationClassArray[i] = sClass; 
			i++; 
		}
		return itemsDestClassCombo;
		
	}
	
	@Override
	protected void okPressed() {
		
		this.classIntegration.setSclass(destinationClassArray[comboDestinationClass.getSelectionIndex()]);
		
		if (btnClassToClass.getSelection()){
			this.classIntegration.setExternalClass(originClassArray[comboOriginClass.getSelectionIndex()]);
			this.classIntegration.setExpression(null); 
		}
		
		if(btnSparqlExpression.getSelection()){
			this.classIntegration.setExpression(textSparqlExpression.getText());
			this.classIntegration.setExternalClass(null); 
		}
		
		super.okPressed();
	}
	
	public ClassIntegration getSClass() {
		return classIntegration;
	}

}

