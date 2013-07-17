package unblod.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Composite;

import unbload.ui.utils.CsvImportationTreeContentProvider;
import unblod.dataset.model.dataset.CsvFile;
import unblod.dataset.model.dataset.CsvToRdfImportation;
import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.model.dataset.Property;
import unblod.dataset.model.dataset.RdfConstruction;
import unblod.dataset.model.dataset.ReferenceProperty;
import unblod.dataset.service.DatasetModelService;
import unblod.ui.dialogs.CsvFileDialog;
import unblod.ui.dialogs.RdfConstructionDialog;

import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class CsvImportationPart {
	
	//@Inject IEclipseContext context;
	private Dataset dataset;
	private DatasetModelService datasetModelService;
	private CsvToRdfImportation csvToRdfImportation;
	
	@Inject private MDirtyable dirty;
	
	//Controls
	Button btnRemove;
	Button btnAddCsvFile;
	Button btnAddRdfConstruction;
	Button btnAddProperty;
	Button btnAddReferenceProperty;
	TreeViewer treeViewer;
	
	@PostConstruct
	public void createControl(final Shell shell,
			Composite parent, @Named(IServiceConstants.ACTIVE_SELECTION)Dataset mDataset) {
		
		datasetModelService = DatasetModelService.getInstace();
		this.dataset = mDataset;
		
		this.csvToRdfImportation = datasetModelService.getCsvImportation(dataset);
		
		SashForm sashForm = new SashForm(parent, SWT.NONE);
		
		Composite compositeTree = new Composite(sashForm, SWT.NONE);
		compositeTree.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		treeViewer = new TreeViewer(compositeTree, SWT.BORDER);
		Tree tree = treeViewer.getTree();
		
		Composite compositeControls = new Composite(sashForm, SWT.NONE);
		compositeControls.setLayout(new GridLayout(1, false));
		
		btnAddCsvFile = new Button(compositeControls, SWT.NONE);
		btnAddCsvFile.setText("Add CSV file");
		
		btnAddRdfConstruction = new Button(compositeControls, SWT.NONE);
		btnAddRdfConstruction.setText("Add RDF construction");
		
		btnAddProperty = new Button(compositeControls, SWT.NONE);
		btnAddProperty.setText("Add Property");
		
		btnAddReferenceProperty = new Button(compositeControls, SWT.NONE);
		btnAddReferenceProperty.setText("Add Reference Property");
		
		btnRemove = new Button(compositeControls, SWT.NONE);
		btnRemove.setText("Remove...");
		sashForm.setWeights(new int[] {1, 1});
		
		treeViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				CsvToRdfImportation csvToRdfImportation = null;
				CsvFile csvFile = null;
				//RdfConstruction rdfConstruction = null;
				//Property property = null;
				//ReferenceProperty referenceProperty = null;
				
				
				// TODO Auto-generated method stub
				if (element instanceof CsvToRdfImportation) {
					csvToRdfImportation = (CsvToRdfImportation)element;
					return "CSV importation";
				}
				
				if (element instanceof CsvFile) {
					csvFile = (CsvFile)element;
					return "CSV file - " +  csvFile.getName();
				}
				
				return super.getText(element);
			}
			
			@Override
			public Image getImage(Object element) {
				// TODO Auto-generated method stub
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
		
		btnAddCsvFile.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				CsvFileDialog dialog = new CsvFileDialog(shell, 
						datasetModelService.getFactory().createCsvFile());
				
				dialog.create();
				if (dialog.open() == Window.OK) {
				  
					CsvFile csvFile = dialog.getCsvFile();
					csvToRdfImportation.getFromFiles().add(csvFile);
					treeViewer.refresh();
					dirty.setDirty(true);
				} 
				
				/*if (propertySelected < -1) {
					btn.setEnabled(true);
					MessageDialog.openWarning(shell, "No propety selected", "Select a property to be edited");
				}*/
				super.widgetSelected(e);
			}
		});
		
		
		btnRemove.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
				//Object parent  = selection.getPaths()[0].getParentPath().getLastSegment();
				Object firstElement = selection.getFirstElement();
				
				if (!MessageDialog.openConfirm(shell, "Remove", "Are you sure you want to " +
						"remove this element?")) {
					
					return;
				}
				
				if (firstElement instanceof CsvFile) {
					CsvFile csvFile = (CsvFile)firstElement;
					CsvToRdfImportation parent = (CsvToRdfImportation)csvFile.eContainer();
					
					parent.getFromFiles().remove(csvFile);
					treeViewer.refresh();
					dirty.setDirty(true);
				}
				
				if (firstElement instanceof RdfConstruction) {
					RdfConstruction rdfConstruction = (RdfConstruction)firstElement;
					CsvFile parent = (CsvFile)rdfConstruction.eContainer();
					
					parent.getRdfConstructions().remove(rdfConstruction);
					treeViewer.refresh();
					dirty.setDirty(true);
				}
				
				if (firstElement instanceof Property) {
					Property property = (Property)firstElement;
					RdfConstruction parent = (RdfConstruction)property.eContainer();
					
					parent.getProperties().remove(property);
					treeViewer.refresh();
					dirty.setDirty(true);
				}
				
				if (firstElement instanceof Property) {
					ReferenceProperty referenceProperty = (ReferenceProperty)firstElement;
					RdfConstruction parent = (RdfConstruction)referenceProperty.eContainer();
					
					parent.getReferenceProperties().remove(referenceProperty);
					treeViewer.refresh();
					dirty.setDirty(true);
				}
				
				super.widgetSelected(e);
			}
			
		});
		
		
		btnAddRdfConstruction.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				RdfConstructionDialog dialog = new RdfConstructionDialog(shell, 
						datasetModelService.getFactory().createRdfConstruction());
				
				ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
				Object firstElement = selection.getFirstElement();
				
				CsvFile csvFile = (CsvFile)firstElement;
				
				if (!(firstElement instanceof CsvFile)) {
					return;
				}
				
				dialog.create();
				if (dialog.open() == Window.OK) {
				  
					RdfConstruction rdfConstruction = dialog.getRdfConstruction();
					csvFile.getRdfConstructions().add(rdfConstruction);
					
					treeViewer.refresh();
					dirty.setDirty(true);
				} 
				
				/*if (propertySelected < -1) {
					btn.setEnabled(true);
					MessageDialog.openWarning(shell, "No propety selected", "Select a property to be edited");
				}*/
				super.widgetSelected(e);
			}
			
		});
		
		treeViewer.setContentProvider(new CsvImportationTreeContentProvider());
		treeViewer.setInput(new CsvToRdfImportation[]{csvToRdfImportation});
		//System.out.println("CsvImportationPart: " + dataset.getName());
		
		updateBtnControls();
	}
	
	private void updateBtnControls() {
		ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
		//Object parent  = selection.getPaths()[0].getParentPath().getLastSegment();
		Object firstElement = selection.getFirstElement();
		
		btnAddRdfConstruction.setEnabled(false);
		btnAddProperty.setEnabled(false);
		btnAddReferenceProperty.setEnabled(false);
		btnRemove.setEnabled(true);
		
		if (firstElement instanceof CsvToRdfImportation) {
			btnAddCsvFile.setEnabled(true);
			btnRemove.setEnabled(false);
		}
		else if (firstElement instanceof CsvFile) {
			btnAddRdfConstruction.setEnabled(true);
			btnRemove.setEnabled(true);
		}
		else if (firstElement instanceof RdfConstruction) {
			btnAddProperty.setEnabled(true);
			btnAddReferenceProperty.setEnabled(true);
			btnRemove.setEnabled(true);
		}
		else if (firstElement instanceof Property) {
			btnRemove.setEnabled(true);
		}
		else if (firstElement instanceof ReferenceProperty) {
			btnRemove.setEnabled(true);
		}
		
		if (firstElement == null) {
			btnRemove.setEnabled(true);
		}
	}
	
	@Persist
	public void save() {
	  // Save changes via ITodoService for example
	  datasetModelService.saveCsvToRdfImportation(dataset, this.csvToRdfImportation);
	  // Save was successful
	  System.out.println("Saving data (csv importation)");
	  dirty.setDirty(false);
	} 
}
