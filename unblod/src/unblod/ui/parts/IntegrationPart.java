package unblod.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.services.IServiceConstants;
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
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import unbload.ui.utils.IntegrationTreeContentProvider;
import unblod.dataset.model.dataset.ClassIntegration;
import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.model.dataset.ExternalDataset;
import unblod.dataset.model.dataset.Integration;
import unblod.dataset.model.dataset.PropertyIntegration;
import unblod.dataset.model.dataset.SClass;
import unblod.dataset.model.dataset.SProperty;
import unblod.dataset.service.DatasetModelService;
import unblod.ui.dialogs.ExternalDatasetDialog;
import unblod.ui.dialogs.NewPropertyDialog;

public class IntegrationPart {
	
	@Inject private MDirtyable dirty;
	
	private DatasetModelService datasetModelService;

	private Dataset dataset;
	private Integration integration;
	
	private Shell shell; 
	
	private TreeViewer treeViewer; 
	
	
	private Button btnAddClassMapping; 
	private Button btnAddExtDataset; 
	private Button btnAddPropMapping; 
	private Button btnEdit; 
	private Button btnRemove; 
	
	@PostConstruct
	public void createControl(final Shell shell, Composite parent, @Named(IServiceConstants.ACTIVE_SELECTION)Dataset mDataset) {
		
		this.shell = shell; 
		
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
				addExternalDataset();
				super.widgetSelected(e);
			}
			
		});
		
		btnAddClassMapping = new Button(composite_controls, SWT.NONE);
		btnAddClassMapping.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnAddClassMapping.setText("Add Class Mapping");
		
		btnAddClassMapping.addSelectionListener(new SelectionAdapter(){
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				createSProperty();
				super.widgetSelected(e);
			}
			
		});
		
		btnAddPropMapping = new Button(composite_controls, SWT.NONE);
		btnAddPropMapping.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnAddPropMapping.setText("Add Prop Mapping");
		
		btnEdit = new Button(composite_controls, SWT.NONE);
		btnEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnEdit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnEdit.setText("Edit");
		
		btnRemove = new Button(composite_controls, SWT.NONE);
		btnRemove.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnRemove.setText("Remove");
		sashForm.setWeights(new int[] {316, 131});
		
		this.dataset = mDataset;
		
		datasetModelService =  DatasetModelService.getInstace();
		
		integration = datasetModelService.getIntegation(mDataset); 
		
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
					return ((ClassIntegration)element).getClass().getName(); 
				}
				if (element instanceof PropertyIntegration){
					return ((PropertyIntegration)element).getExternalProperty().getName(); 
				}
				return null; 
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
	
	private void addExternalDataset(){
		ExternalDataset extDataset = datasetModelService.getFactory().createExternalDataset(); 
		
		ExternalDatasetDialog dialog = new ExternalDatasetDialog(shell, 
				extDataset);
		
		dialog.create();
		
		if (dialog.open() == Window.OK) {
		  
			ExternalDataset externalDataset = dialog.getExternalDataset();
			integration.getDatasets().add(externalDataset); 
			
			treeViewer.refresh();
			dirty.setDirty(true);
		} 
		
	}
	
	private void createSProperty(){
		SProperty newProperty = datasetModelService.getFactory().createSProperty(); 
		
		NewPropertyDialog dialog = new NewPropertyDialog(shell, 
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
