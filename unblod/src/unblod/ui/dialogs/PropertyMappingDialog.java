package unblod.ui.dialogs;

import java.util.List;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.wb.swt.ResourceManager;

import unbload.ui.utils.FunctionTreeContentProvider;
import unbload.ui.utils.GUIUtil;
import unblod.dataset.model.dataset.ClassIntegration;
import unblod.dataset.model.dataset.ExternalDataset;
import unblod.dataset.model.dataset.Function;
import unblod.dataset.model.dataset.FunctionCategory;
import unblod.dataset.model.dataset.FunctionSet;
import unblod.dataset.model.dataset.Property;
import unblod.dataset.model.dataset.PropertyIntegration;
import unblod.dataset.model.dataset.SClass;
import unblod.dataset.model.dataset.SProperty;
import unblod.dataset.model.dataset.Schema;
import unblod.dataset.service.DatasetModelService;

public class PropertyMappingDialog extends TitleAreaDialog{

	PropertyIntegration propertyIntegration = null;
	ClassIntegration classIntegration = null; 
	
	Combo comboDestinationProperty; 
	Combo comboOriginProperty; 
	
	private Button btnPropertyToProperty; 
	private Button btnFunction; 
	
	private ExternalDataset externalDataset;
//	private Schema schema; 
	private SClass sClass; 
	
	private SProperty [] destinationPropertyArray;
	private Property [] originPropertyArray; 
	
	private TreeViewer treeViewer;
	
	DatasetModelService datasetModelService =  DatasetModelService.getInstace();
	private Text textExpression;
	
	/**
	 * @wbp.parser.constructor
	 */
	public PropertyMappingDialog(Shell parentShell, 
			PropertyIntegration _propertionIntegration, 
			ClassIntegration _classIntegration) {
		super(parentShell);
		this.propertyIntegration = _propertionIntegration;
		externalDataset = 
				(ExternalDataset)this.propertyIntegration.eContainer().eContainer();
		this.classIntegration = _classIntegration; 
		this.sClass = _classIntegration.getSclass(); 
	}
	
	public PropertyMappingDialog(Shell parentShell, 
			PropertyIntegration _propertionIntegration, 
			ExternalDataset _externalDataset,
			ClassIntegration _classIntegration) {
		super(parentShell);
		this.propertyIntegration = _propertionIntegration;
		externalDataset = _externalDataset; 
		this.classIntegration = _classIntegration; 
		this.sClass = _classIntegration.getSclass(); ; 
	}
	
	 @Override
	  public void create() {
		 
	    super.create();
	    setTitle("Property mapping dialog.");
	    initializeInputs();
	    validateInputs();
	  
	 }

	
	public void validateInputs() {
		Boolean valid = true;
		
		
		if (!valid) {
			this.getButton(IDialogConstants.OK_ID).setEnabled(false);
		}
		else {
			this.getButton(IDialogConstants.OK_ID).setEnabled(true);
			setMessage(null);
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
		
		Label lblDestProperty = new Label(composite, SWT.NONE);
		lblDestProperty.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDestProperty.setText("Destination Property");
		
		comboDestinationProperty = new Combo(composite, SWT.NONE);
		comboDestinationProperty.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		comboDestinationProperty.setItems(getDestinationSPropertyList());
		
		Label lblUri = new Label(composite, SWT.NONE);
		lblUri.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblUri.setText("Type Mapping");
		
		btnPropertyToProperty = new Button(composite, SWT.RADIO);
		btnPropertyToProperty.setText("Property To Property");
		new Label(composite, SWT.NONE);
		
		btnFunction = new Button(composite, SWT.RADIO);
		btnFunction.setText("Function");
		new Label(composite, SWT.NONE);
		
		Label label_1 = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblOriginClass = new Label(composite, SWT.NONE);
		lblOriginClass.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblOriginClass.setText("Origin Property");
		
		comboOriginProperty = new Combo(composite, SWT.NONE);
		comboOriginProperty.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		
		comboOriginProperty.setItems(getOriginPropertyList());
		
		Label label = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Function");
		
		SashForm sashForm = new SashForm(composite, SWT.NONE);
		sashForm.setSashWidth(2);
		GridData gd_sashForm = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_sashForm.heightHint = 181;
		sashForm.setLayoutData(gd_sashForm);
		
		Composite composite_1 = new Composite(sashForm, SWT.NONE);
		composite_1.setLayout(new GridLayout(1, false));
		
		treeViewer =new TreeViewer(composite_1, SWT.BORDER);
		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		treeViewer.setContentProvider(new FunctionTreeContentProvider());
		
		FunctionSet formulaSet = createFunctionSet(); 
		FunctionSet[] arrayFunctionSet = new FunctionSet[1]; 
		arrayFunctionSet[0] = formulaSet; 
		
		treeViewer.setInput(arrayFunctionSet);
		
		treeViewer.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element){
				if (element instanceof FunctionSet){
					return "Function"; 
				}
				if (element instanceof FunctionCategory){
					return ((FunctionCategory)element).getName(); 
				}
				if (element instanceof Function){
					return ((Function)element).getName(); 
				}
				return null; 
			}
			
			@Override
			public Image getImage(Object element) {
				
				if (element instanceof Schema) {
					return ResourceManager.getPluginImage("unblod", GUIUtil.icon_CSV_FILE);
				}
				
				if (element instanceof SClass) {
					return ResourceManager.getPluginImage("unblod", GUIUtil.icon_CLASS);
				}
				
				else if (element instanceof SProperty) {
					return ResourceManager.getPluginImage("unblod", GUIUtil.icon_PROPERTY);
				}
				
				return super.getImage(element);
			}
			
		});
		
		treeViewer.expandAll();
		
		Composite composite_2 = new Composite(sashForm, SWT.NONE);
		composite_2.setLayout(new GridLayout(1, false));
		new Label(composite_2, SWT.NONE);
		new Label(composite_2, SWT.NONE);
		new Label(composite_2, SWT.NONE);
		new Label(composite_2, SWT.NONE);
		new Label(composite_2, SWT.NONE);
		new Label(composite_2, SWT.NONE);
		
		Label lblExpression = new Label(composite_2, SWT.NONE);
		lblExpression.setText("Expression:");
		
		textExpression = new Text(composite_2, SWT.BORDER);
		textExpression.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		sashForm.setWeights(new int[] {137, 150});
		
		btnFunction.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				textExpression.setEnabled(true);
				comboOriginProperty.setEnabled(false);
				treeViewer.getTree().setEnabled(true);
				
			}
		});
		
		btnPropertyToProperty.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				textExpression.setEnabled(false);
				treeViewer.getTree().setEnabled(false);
				comboOriginProperty.setEnabled(true);
			}
		});
		
		if(propertyIntegration.getSproperty() != null){

			int index = -1; 
			for(int i = 0 ; i < destinationPropertyArray.length; i++){
				if(propertyIntegration.getSproperty().getName().equals(destinationPropertyArray[i].getName())){
					index = i; 
				}
			}
			
			if(index!= -1){
				comboDestinationProperty.select(index);
			}
		}
		
		if(propertyIntegration.getExternalProperty() != null){
			int index = -1; 
			for(int i = 0 ; i < originPropertyArray.length; i++){
				if(propertyIntegration.getExternalProperty().getName().equals(originPropertyArray[i].getName())){
					index = i; 
				}
			}
			
			if(index!= -1){
				comboOriginProperty.select(index);
				btnPropertyToProperty.setSelection(true);
				
				textExpression.setEnabled(false);
				comboOriginProperty.setEnabled(true);
				treeViewer.getTree().setEnabled(false);
			}
		}
		
		if(propertyIntegration.getExpression() != null){
			textExpression.setText(propertyIntegration.getExpression());
			btnFunction.setSelection(true);
			
			textExpression.setEnabled(true);
			comboOriginProperty.setEnabled(false);
			treeViewer.getTree().setEnabled(true);
		}
		
		return composite;
	}
	
	protected FunctionSet createFunctionSet(){
		
		FunctionSet formulaSet = datasetModelService.getFactory().createFunctionSet(); 
		formulaSet.setName("Functions");
		
		//######################################################################
		//                         STRING
		//######################################################################
		
		FunctionCategory category = datasetModelService.getFactory().createFunctionCategory(); 
		category.setName("String");
		
		Function function = datasetModelService.getFactory().createFunction(); 
		function.setName("STRLEN");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("CONCAT");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("SPLIT");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("REPLACE");
		category.getFunctions().add(function); 
		
//		function = datasetModelService.getFactory().createFunction(); 
//		function.setName("SUBSTR");
//		category.getFunctions().add(function); 
//		
//		function = datasetModelService.getFactory().createFunction(); 
//		function.setName("UCASE");
//		category.getFunctions().add(function); 
//		
//		function = datasetModelService.getFactory().createFunction(); 
//		function.setName("LCASE");
//		category.getFunctions().add(function); 
//		
//		function = datasetModelService.getFactory().createFunction(); 
//		function.setName("STRSTARTS");
//		category.getFunctions().add(function); 
//		
//		function = datasetModelService.getFactory().createFunction(); 
//		function.setName("STRENDS");
//		category.getFunctions().add(function); 
//		
//		function = datasetModelService.getFactory().createFunction(); 
//		function.setName("CONTAINS");
//		category.getFunctions().add(function); 
//		
//		function = datasetModelService.getFactory().createFunction(); 
//		function.setName("STRBEFORE");
//		category.getFunctions().add(function); 
//		
//		function = datasetModelService.getFactory().createFunction(); 
//		function.setName("STRAFTER");
//		category.getFunctions().add(function); 
		
		
		formulaSet.getCategories().add(category); 
		
		
		//######################################################################
		//                         NUMERICS
		//######################################################################
		
		category = datasetModelService.getFactory().createFunctionCategory(); 
		category.setName("Numerics");
		formulaSet.getCategories().add(category); 

		function = datasetModelService.getFactory().createFunction(); 
		function.setName("ADD");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("SUBTRACT");
		category.getFunctions().add(function); 
		
		
		//######################################################################
		//                         DATE TIME
		//######################################################################
		
		category = datasetModelService.getFactory().createFunctionCategory(); 
		category.setName("Date Time");
		formulaSet.getCategories().add(category); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("NOW");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("TIMEZONE");
		category.getFunctions().add(function); 
		
		//######################################################################
		//                         HASH
		//######################################################################
		
		
		category = datasetModelService.getFactory().createFunctionCategory(); 
		category.setName("Hash");
		formulaSet.getCategories().add(category); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("MD5");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("SHA1");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("SHA256");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("SHA384");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("SHA512");
		category.getFunctions().add(function); 
		
		//######################################################################
		//                         RDF TERMS
		//######################################################################
		
		
		category.setName("rdfTerms");
		formulaSet.getCategories().add(category); 
		
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("ISIRI");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("ISBLANK");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("ISLITERAL");
		category.getFunctions().add(function); 
		
		return formulaSet; 
		
	}
	
	private String[] getDestinationSPropertyList() {
		
		List<SProperty> sPropertyList = sClass.getProperties(); 
		String[] itemsDestPropertyCombo = new String[sPropertyList.size()];
		destinationPropertyArray = new SProperty[sPropertyList.size()]; 
		
		int i = 0; 
		for(SProperty sProperty: sPropertyList){
			itemsDestPropertyCombo[i] = sProperty.getName();
			destinationPropertyArray[i] = sProperty; 
			i++; 
		}
		return itemsDestPropertyCombo;
		
	}
	
	private String[] getOriginPropertyList() {
		
		List<Property> sPropertyList = classIntegration.getExternalClass().getProperties(); 
		String[] itemsOriginPropertyCombo = new String[sPropertyList.size()];
		originPropertyArray = new Property[sPropertyList.size()]; 
		
		int i = 0; 
		for(Property sProperty: sPropertyList){
			itemsOriginPropertyCombo[i] = sProperty.getName();
			originPropertyArray[i] = sProperty; 
			i++; 
		}
		return itemsOriginPropertyCombo;
		
	}
	
	@Override
	protected void okPressed() {
		
		this.propertyIntegration.setSproperty(destinationPropertyArray[comboDestinationProperty.getSelectionIndex()]);
		
		if (btnPropertyToProperty.getSelection()){
			this.propertyIntegration.setExternalProperty(originPropertyArray[comboOriginProperty.getSelectionIndex()]);
			this.propertyIntegration.setExpression(null);; 
		}else{
			this.propertyIntegration.setExternalProperty(null);
			this.propertyIntegration.setExpression(textExpression.getText());; 
		}
		
		super.okPressed();
	}
	
	public PropertyIntegration getSClass() {
		return propertyIntegration;
	}
}