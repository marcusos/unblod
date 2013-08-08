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
import org.eclipse.wb.swt.ResourceManager;

import unbload.ui.utils.GUIUtil;
import unbload.ui.utils.IntegrationTreeContentProvider;
import unblod.dataset.model.dataset.ClassIntegration;
import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.model.dataset.ExternalDataset;
import unblod.dataset.model.dataset.Integration;
import unblod.dataset.model.dataset.PropertyIntegration;
import unblod.dataset.model.dataset.Schema;
import unblod.dataset.service.DatasetModelService;
import unblod.ui.dialogs.ClassMappingDialog;
import unblod.ui.dialogs.ExternalDatasetDialog;
import unblod.ui.dialogs.PropertyMappingDialog;

public class IntegrationPart {
	
	@Inject private MDirtyable dirty;
	
	private DatasetModelService datasetModelService;

	private Dataset dataset;
	private Integration integration;
	private Schema schema;
	
	private Shell shell; 
	
	private TreeViewer treeViewer; 
	
	
	private Button btnAddClassMapping; 
	private Button btnAddExtDataset; 
	private Button btnAddPropMapping; 
	private Button btnEdit; 
	private Button btnRemove; 
	
	@PostConstruct
	public void createControl(final Shell shell, Composite parent, 
			@Named(IServiceConstants.ACTIVE_SELECTION)Dataset mDataset) {
		
		this.shell = shell; 
		
		this.dataset = mDataset;
		
		datasetModelService =  DatasetModelService.getInstace();
		
		integration = datasetModelService.getIntegation(mDataset); 
		schema = datasetModelService.getSchema(mDataset); 
		
		SashForm sashForm = new SashForm(parent, SWT.NONE);
		
		Composite composite = new Composite(sashForm, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		treeViewer = new TreeViewer(composite, SWT.BORDER);
		
		Composite composite_controls = new Composite(sashForm, SWT.NONE);
		composite_controls.setLayout(new GridLayout(1, false));
		
		btnAddExtDataset = new Button(composite_controls, SWT.NONE);
		btnAddExtDataset.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		btnAddExtDataset.setText("Add External Dataset");
		
		btnAddExtDataset.addSelectionListener(new SelectionAdapter(){
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				createExternalDataset();
				super.widgetSelected(e);
			}
			
		});
		
		btnAddClassMapping = new Button(composite_controls, SWT.NONE);
		btnAddClassMapping.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnAddClassMapping.setText("Add Class Mapping");
		
		btnAddClassMapping.addSelectionListener(new SelectionAdapter(){
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
//				ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
//				ClassIntegration firstElement = (ClassIntegration)selection.getFirstElement();
				
				createClassIntegration();
				
				super.widgetSelected(e);
			}
			
		});
		
		btnAddPropMapping = new Button(composite_controls, SWT.NONE);
		btnAddPropMapping.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnAddPropMapping.setText("Add Prop Mapping");
		
		btnAddPropMapping.addSelectionListener(new SelectionAdapter(){
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				createPropertyIntegration();
				super.widgetSelected(e);
			}
			
		});
		
		btnEdit = new Button(composite_controls, SWT.NONE);
		btnEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnEdit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		
		btnEdit.setText("Edit");
		
		btnEdit.addSelectionListener(new SelectionAdapter(){
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
				Object firstElement = selection.getFirstElement();
				
				if (firstElement instanceof ExternalDataset) {
					ExternalDataset externalDataset = (ExternalDataset)firstElement;
					ExternalDatasetDialog dialog = new ExternalDatasetDialog(shell, 
							externalDataset, integration);
					
					dialog.create();
					if (dialog.open() == Window.OK) {
						treeViewer.refresh();
						dirty.setDirty(true);
					}
					
				}
				
				if (firstElement instanceof ClassIntegration) {
					
					ClassIntegration classIntegration = (ClassIntegration)firstElement;
					ClassMappingDialog dialog = new ClassMappingDialog(shell, 
							classIntegration, schema);
					
					dialog.create();
					
					if (dialog.open() == Window.OK) {
						treeViewer.refresh();
						dirty.setDirty(true);
					}
					
				}
				
				if (firstElement instanceof PropertyIntegration) {
					PropertyIntegration classIntegration = (PropertyIntegration)firstElement;
					PropertyMappingDialog dialog = new PropertyMappingDialog(shell, 
							classIntegration);
					
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
		btnRemove.setText("Remove");
		sashForm.setWeights(new int[] {316, 131});
		
		btnRemove.addSelectionListener(new SelectionAdapter(){
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
				Object firstElement = selection.getFirstElement();
				
				if (!MessageDialog.openConfirm(shell, "Remove", "Are you sure you want to " +
						"remove this element?")) {
					
					return;
				}
				
				if (firstElement instanceof ExternalDataset) {
					ExternalDataset externalDataset = (ExternalDataset)firstElement;
					Integration parent = (Integration)externalDataset.eContainer();
					
					parent.getDatasets().remove(externalDataset);
				}
				
				if (firstElement instanceof ClassIntegration) {
					ClassIntegration sClass = (ClassIntegration)firstElement;
					ExternalDataset parent = (ExternalDataset)sClass.eContainer();
					
					parent.getClasses().remove(sClass);
				}
				
				if (firstElement instanceof PropertyIntegration) {
					PropertyIntegration sProperty = (PropertyIntegration)firstElement;
					ClassIntegration parent = (ClassIntegration)sProperty.eContainer();
					
					parent.getProperties().remove(sProperty);
				}
				

				treeViewer.refresh();
				dirty.setDirty(true);
				super.widgetSelected(e);
			}
			
		});
		
		Integration[] arrayIntegration = new Integration[1]; 
		arrayIntegration[0] = integration; 
		
		treeViewer.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element){
				if (element instanceof Integration){
					return "Integration"; 
				}
				if (element instanceof ExternalDataset){
					return ((ExternalDataset)element).getDataset().getName(); 
				}
				if (element instanceof ClassIntegration){
					ClassIntegration classIntegration = ((ClassIntegration)element); 
					if ((classIntegration.getExternalClass()!=null) &&
					   (classIntegration.getSclass() != null)){
						String string = "" + classIntegration.getExternalClass().getName() + " -> "
								+ classIntegration.getSclass().getName();
						return string; 
					} else{
						return classIntegration.toString(); 
					}
					
				}
				if (element instanceof PropertyIntegration){
					return ((PropertyIntegration)element).getExternalProperty().getName(); 
				}
				return null; 
			}
			
			@Override
			public Image getImage(Object element) {
				
				if (element instanceof ExternalDataset) {
					return ResourceManager.getPluginImage("unblod", GUIUtil.icon_CSV_FILE);
				}
				
				if (element instanceof ClassIntegration) {
					return ResourceManager.getPluginImage("unblod", GUIUtil.icon_CLASS);
				}
				
				else if (element instanceof PropertyIntegration) {
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
		
		treeViewer.setContentProvider(new IntegrationTreeContentProvider());
		treeViewer.setInput(arrayIntegration);
		
		updateBtnControls();
		treeViewer.expandAll();
		
	}
	
	private void createExternalDataset(){
		ExternalDataset extDataset = datasetModelService.getFactory().createExternalDataset(); 
		
		ExternalDatasetDialog dialog = new ExternalDatasetDialog(shell, 
				extDataset, integration);
		
		dialog.create();
		
		if (dialog.open() == Window.OK) {
		  
			ExternalDataset externalDataset = dialog.getExternalDataset();
			integration.getDatasets().add(externalDataset); 
			
			treeViewer.refresh();
			dirty.setDirty(true);
		} 
		
	}
	
	private void createClassIntegration(){
		ClassIntegration classIntegration = datasetModelService.getFactory().createClassIntegration(); 
		
		ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
		Object firstElement = selection.getFirstElement();
		
		ExternalDataset externalDataset = (ExternalDataset)firstElement;
		
		Integration integration = (Integration)externalDataset.eContainer(); 
		
		ClassMappingDialog dialog = new ClassMappingDialog(shell, 
				classIntegration, externalDataset, schema);
		
		dialog.create();
	
		
		if (dialog.open() == Window.OK) {
		  
			ClassIntegration classIntegration2 = dialog.getSClass();
			externalDataset.getClasses().add(classIntegration2); 

			treeViewer.refresh();
			dirty.setDirty(true);
			
//			super.widgetSelected(sProperty);
		}
		
	}
	
	private void createPropertyIntegration(){
		PropertyIntegration propertyIntegration = datasetModelService.getFactory().createPropertyIntegration(); 
		
		PropertyMappingDialog dialog = new PropertyMappingDialog(shell, 
				propertyIntegration);
		
		dialog.create();
		
		ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
		Object firstElement = selection.getFirstElement();
		
		if (dialog.open() == Window.OK) {
		  
			PropertyIntegration prop = dialog.getSClass();
//			externalDataset.getClasses().add(classIntegration2); 

			treeViewer.refresh();
			dirty.setDirty(true);
			
//			super.widgetSelected(sProperty);
		}
		
	}
	
	private void updateBtnControls() {
		ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
		//Object parent  = selection.getPaths()[0].getParentPath().getLastSegment();
		Object firstElement = selection.getFirstElement();
		
		
		btnAddClassMapping.setEnabled(false);
		btnAddExtDataset.setEnabled(false);
		btnAddPropMapping.setEnabled(false);
		btnEdit.setEnabled(false);
		btnRemove.setEnabled(false);
		
		treeViewer.getTree().setMenu(null);
		
		if (firstElement instanceof Integration) {
			btnAddExtDataset.setEnabled(true);
			btnRemove.setEnabled(true);
			btnEdit.setEnabled(true);
		}
		
		if (firstElement instanceof ExternalDataset) {
			btnAddClassMapping.setEnabled(true);
			btnRemove.setEnabled(true);
			btnEdit.setEnabled(true);
		}
		
		if (firstElement instanceof ClassIntegration) {
			btnAddPropMapping.setEnabled(true);
			btnRemove.setEnabled(true);
			btnEdit.setEnabled(true);
		}
		
		if (firstElement instanceof PropertyIntegration) {
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
	  datasetModelService.saveIntegration(dataset, integration);
	  // Save was successful
	  System.out.println("Saving data");
	  dirty.setDirty(false);
	} 
}
