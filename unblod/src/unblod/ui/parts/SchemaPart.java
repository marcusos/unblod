package unblod.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.wb.swt.ResourceManager;

import unbload.ui.utils.GUIUtil;
import unbload.ui.utils.SchemaTreeContentProvider;
import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.model.dataset.SClass;
import unblod.dataset.model.dataset.SProperty;
import unblod.dataset.model.dataset.Schema;
import unblod.dataset.service.DatasetModelService;
import unblod.ui.dialogs.SClassDialog;
import unblod.ui.dialogs.SPropertyDialog;

public class SchemaPart {
	
	@Inject private MDirtyable dirty;
	
	private Table table;
	private DatasetModelService datasetModelService;

	private Dataset dataset;
	private Schema schema;
	
	private Shell shell; 
	
	private TreeViewer treeViewer; 
	
	private Button btnAddClass;
	private Button btnAddProperty;
	private Button btnEdit;
	private Button btnRemove;
	
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
		
		btnAddClass = new Button(composite_controls, SWT.NONE);
		btnAddClass.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnAddClass.setImage(ResourceManager.getPluginImage("unblod", "protege-icons/class.add.png"));
		btnAddClass.setText("    Add Class   ");  // length = 16
		
		btnAddClass.addSelectionListener(new SelectionAdapter(){
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				createSClass();
				super.widgetSelected(e);
			}
			
		});
		
		btnAddProperty = new Button(composite_controls, SWT.NONE);
		btnAddProperty.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnAddProperty.setImage(ResourceManager.getPluginImage("unblod", "protege-icons/property.data.add.png"));
		btnAddProperty.setText("  Add Property  ");
		
		btnAddProperty.addSelectionListener(new SelectionAdapter(){
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				createSProperty();
				super.widgetSelected(e);
			}
			
		});
		
		btnEdit = new Button(composite_controls, SWT.NONE);
		btnEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnEdit.setImage(ResourceManager.getPluginImage("unblod", "metro-icons/appbar.edit.reduced.png"));
		btnEdit.setText("         Edit         ");
		
		btnEdit.addSelectionListener(new SelectionAdapter(){
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
				Object firstElement = selection.getFirstElement();
				
				if (firstElement instanceof SClass) {
					SClass sClass = (SClass)firstElement;
					SClassDialog dialog = new SClassDialog(shell, 
							sClass);
					
					dialog.create();
					if (dialog.open() == Window.OK) {
						treeViewer.refresh();
						dirty.setDirty(true);
					}
					
				}
				
				if (firstElement instanceof SProperty) {
					SProperty sProperty = (SProperty)firstElement;
					SPropertyDialog dialog = new SPropertyDialog(shell, 
							sProperty);
					
					dialog.create();
					if (dialog.open() == Window.OK) {
						treeViewer.refresh();
						dirty.setDirty(true);
					}
					
				}
				
				super.widgetSelected(e);
			}
			
		});
		
		btnRemove = new Button(composite_controls, SWT.NONE);
		btnRemove.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnRemove.setText("      Remove    " );
		btnRemove.setImage(ResourceManager.getPluginImage("unblod", "protege-icons/clear.gif"));
		sashForm.setWeights(new int[] {350, 97});
		
		btnRemove.addSelectionListener(new SelectionAdapter(){
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
				Object firstElement = selection.getFirstElement();
				
				if (!MessageDialog.openConfirm(shell, "Remove", "Are you sure you want to " +
						"remove this element?")) {
					
					return;
				}
				
				if (firstElement instanceof SClass) {
					SClass sClass = (SClass)firstElement;
					Schema parent = (Schema)sClass.eContainer();
					
					parent.getClasses().remove(sClass);
					treeViewer.refresh();
					dirty.setDirty(true);
				}
				
				if (firstElement instanceof SProperty) {
					SProperty sProperty = (SProperty)firstElement;
					SClass parent = (SClass)sProperty.eContainer();
					
					parent.getProperties().remove(sProperty); 
					treeViewer.refresh();
					dirty.setDirty(true);
				}
				
				super.widgetSelected(e);
			}
			
		});
		
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
		
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				// TODO Auto-generated method stub
				updateBtnControls();
			}

			
		});
		
		updateBtnControls(); 
		
		treeViewer.setContentProvider(new SchemaTreeContentProvider());
		treeViewer.setInput(arraySchema);
		
		treeViewer.expandAll();
		
	}
	
	private void createSClass(){
		
		SClass newClass = datasetModelService.getFactory().createSClass(); 
		
		SClassDialog dialog = new SClassDialog(shell, 
				newClass);
		
		dialog.create();
		
		if (dialog.open() == Window.OK) {
		  
			SClass sClass = dialog.getSClass();
			schema.getClasses().add(sClass); 
			
			treeViewer.refresh();
			dirty.setDirty(true);
		}
		
		
	}
	
	private void createSProperty(){
		SProperty newProperty = datasetModelService.getFactory().createSProperty(); 
		
		SPropertyDialog dialog = new SPropertyDialog(shell, 
				newProperty);
		
		dialog.create();
		
		ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
		Object firstElement = selection.getFirstElement();
		
		if (!(firstElement instanceof SClass)) {
			return;
		}
		
		SClass sClass = (SClass)firstElement;
		
		if (dialog.open() == Window.OK) {
		  
			SProperty sProperty = dialog.getSProperty();
			sClass.getProperties().add(sProperty); 

			
			treeViewer.refresh();
			dirty.setDirty(true);
			
//			super.widgetSelected(sProperty);
		}
		
	}
	
	private void updateBtnControls() {
		ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
		//Object parent  = selection.getPaths()[0].getParentPath().getLastSegment();
		Object firstElement = selection.getFirstElement();
		
		
		btnAddClass.setEnabled(false);
		btnAddProperty.setEnabled(false);
		btnEdit.setEnabled(false);
		btnRemove.setEnabled(false);
		
		treeViewer.getTree().setMenu(null);
		
		if (firstElement instanceof Schema) {
			btnAddClass.setEnabled(true);
			btnRemove.setEnabled(true);
			btnEdit.setEnabled(true);
		}
		
		if (firstElement instanceof SClass) {
			btnAddProperty.setEnabled(true);
			btnRemove.setEnabled(true);
			btnEdit.setEnabled(true);
		}
		
		if (firstElement instanceof SProperty) {
			btnRemove.setEnabled(true);
			btnEdit.setEnabled(true);
		}
		
		if (firstElement == null) {
			btnRemove.setEnabled(true);
			btnEdit.setEnabled(true);
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
