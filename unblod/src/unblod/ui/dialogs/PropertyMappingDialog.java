package unblod.ui.dialogs;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.wb.swt.ResourceManager;

import unbload.ui.utils.FunctionTreeContentProvider;
import unbload.ui.utils.GUIUtil;
import unblod.dataset.model.dataset.ClassIntegration;
import unblod.dataset.model.dataset.Function;
import unblod.dataset.model.dataset.FunctionCategory;
import unblod.dataset.model.dataset.FunctionSet;
import unblod.dataset.model.dataset.PropertyIntegration;
import unblod.dataset.model.dataset.SClass;
import unblod.dataset.model.dataset.SProperty;
import unblod.dataset.model.dataset.Schema;
import unblod.dataset.service.DatasetModelService;

public class PropertyMappingDialog extends TitleAreaDialog{

	PropertyIntegration propertyIntegration = null;
	Combo comboOriginClass; 
	
	DatasetModelService datasetModelService =  DatasetModelService.getInstace();
	
	public PropertyMappingDialog(Shell parentShell, PropertyIntegration _propertionIntegration) {
		super(parentShell);
		this.propertyIntegration = _propertionIntegration;
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
		
		Label lblName = new Label(composite, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText("Destination Property");
		
		comboOriginClass = new Combo(composite, SWT.NONE);
		comboOriginClass.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblUri = new Label(composite, SWT.NONE);
		lblUri.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblUri.setText("Type Mapping");
		
		Button btnClassToClass = new Button(composite, SWT.RADIO);
		btnClassToClass.setText("Property To Property");
		new Label(composite, SWT.NONE);
		
		Button btnSparqlExpression = new Button(composite, SWT.RADIO);
		btnSparqlExpression.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnSparqlExpression.setText("Function");
		new Label(composite, SWT.NONE);
		
		Label label_1 = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblDestinationClass = new Label(composite, SWT.NONE);
		lblDestinationClass.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDestinationClass.setText("Origin Property");
		
		Combo comboDestClass = new Combo(composite, SWT.NONE);
		comboDestClass.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		
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
		
		TreeViewer treeViewer =new TreeViewer(composite_1, SWT.BORDER);
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
		composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));
		sashForm.setWeights(new int[] {137, 150});
		
		return composite;
	}
	
	protected FunctionSet createFunctionSet(){
		
		System.out.println("create function set");
		
		FunctionSet formulaSet = datasetModelService.getFactory().createFunctionSet(); 
		formulaSet.setName("Functions");
		
		FunctionCategory category = datasetModelService.getFactory().createFunctionCategory(); 
		category.setName("String");
		
		Function function = datasetModelService.getFactory().createFunction(); 
		function.setName("STRLEN");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("SUBSTR");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("UCASE");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("LCASE");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("STRSTARTS");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("STRENDS");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("CONTAINS");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("STRBEFORE");
		category.getFunctions().add(function); 
		
		function = datasetModelService.getFactory().createFunction(); 
		function.setName("STRAFTER");
		category.getFunctions().add(function); 
		
		
		formulaSet.getCategories().add(category); 
		
		category = datasetModelService.getFactory().createFunctionCategory(); 
		category.setName("Numerics");
		formulaSet.getCategories().add(category); 

		
		category = datasetModelService.getFactory().createFunctionCategory(); 
		category.setName("Date Time");
		formulaSet.getCategories().add(category); 
		
		category = datasetModelService.getFactory().createFunctionCategory(); 
		category.setName("Hash");
		formulaSet.getCategories().add(category); 
		
		category.setName("rdfTerms");
		formulaSet.getCategories().add(category); 
		
		return formulaSet; 
		
	}
	
	@Override
	protected void okPressed() {
		
		// populate de object
//		this.sClass.setName(name.getText());
		
		super.okPressed();
	}
	
	public PropertyIntegration getSClass() {
		return propertyIntegration;
	}
}