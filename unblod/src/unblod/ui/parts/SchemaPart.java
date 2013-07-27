package unblod.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;

import unbload.ui.utils.SchemaTreeContentProvider;
import unblod.dataset.model.dataset.CsvFile;
import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.model.dataset.SClass;
import unblod.dataset.model.dataset.SProperty;
import unblod.dataset.model.dataset.Schema;
import unblod.dataset.service.DatasetModelService;
import unblod.ui.dialogs.NewClassDialog;

public class SchemaPart {
	
	@Inject private MDirtyable dirty;
	
	private Table table;
	private DatasetModelService datasetModelService;

	private Dataset dataset;
	private Schema schema;
	
	private Shell shell; 
	
	private TreeViewer treeViewer; 
	
	@PostConstruct
	public void createControl(final Shell shell, Composite parent, @Named(IServiceConstants.ACTIVE_SELECTION)Dataset mDataset) {
		
		System.out.println("Entrou createControl");
		
		this.shell = shell; 
		
		SashForm sashForm = new SashForm(parent, SWT.NONE);
		
		Composite composite = new Composite(sashForm, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		treeViewer = new TreeViewer(composite, SWT.BORDER);
		
//		Tree tree = treeViewer.getTree();
		
		Composite composite_controls = new Composite(sashForm, SWT.NONE);
		composite_controls.setLayout(new GridLayout(1, false));
		
		Button btnAddClass = new Button(composite_controls, SWT.NONE);
		btnAddClass.setText("Add Class");
		
		btnAddClass.addSelectionListener(new SelectionAdapter(){
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				createSClass();
				super.widgetSelected(e);
			}
			
		});
		
		Button btnAddProperty = new Button(composite_controls, SWT.NONE);
		btnAddProperty.setText("Add Property");
		
		Button btnEdit = new Button(composite_controls, SWT.NONE);
		btnEdit.setText("Edit");
		
		Button btnRemove = new Button(composite_controls, SWT.NONE);
		btnRemove.setText("Remove");
		sashForm.setWeights(new int[] {1, 1});
		
		this.dataset = mDataset;
		
		datasetModelService =  DatasetModelService.getInstace();
		
		schema = datasetModelService.getSchema(mDataset); 
		
		Schema[] arraySchema = new Schema[1]; 
		arraySchema[0] = schema; 
		
		treeViewer.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element){
				if (element instanceof Schema){
					return "Schema"; 
				}
				if (element instanceof SClass){
					return ((SClass)element).getName(); 
				}
				if (element instanceof SProperty){
					return ((SProperty)element).getName(); 
				}
				return null; 
			}
			
			
		});
		
		treeViewer.setContentProvider(new SchemaTreeContentProvider());
		treeViewer.setInput(arraySchema);
		
	}
	
	private void createSClass(){
		SClass newClass = datasetModelService.getFactory().createSClass(); 
		
		NewClassDialog dialog = new NewClassDialog(shell, 
				newClass);
		
		dialog.create();
		
		if (dialog.open() == Window.OK) {
		  
			SClass sClass = dialog.getSClass();
			schema.getClasses().add(sClass); 
			
			treeViewer.refresh();
			dirty.setDirty(true);
		} 
		
	}
	
	@Persist
	public void save() {
	  // Save changes via ITodoService for example
	  datasetModelService.saveSchema(dataset, schema);
	  // Save was successful
	  System.out.println("Saving data");
	  dirty.setDirty(false);
	} 
}
