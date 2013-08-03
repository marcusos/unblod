package unblod.ui.parts;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
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
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.wb.swt.ResourceManager;

import unbload.ui.utils.CsvImportationTreeContentProvider;
import unbload.ui.utils.GUIUtil;
import unblod.dataset.model.dataset.CsvFile;
import unblod.dataset.model.dataset.CsvToRdfImportation;
import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.model.dataset.Property;
import unblod.dataset.model.dataset.RdfConstruction;
import unblod.dataset.model.dataset.ReferenceProperty;
import unblod.dataset.service.DatasetModelService;
import unblod.tarql.service.TarqlQueryGenerator;
import unblod.tarql.service.TarqlService;
import unblod.ui.dialogs.CsvFileDialog;
import unblod.ui.dialogs.CsvPropertyDialog;
import unblod.ui.dialogs.CsvReferencePropertyDialog;
import unblod.ui.dialogs.RdfConstructionDialog;

public class CsvImportationPart {
	
	//@Inject IEclipseContext context;
	private Dataset dataset;
	private DatasetModelService datasetModelService;
	private CsvToRdfImportation csvToRdfImportation;
	
	@Inject private ESelectionService selectionService;
	@Inject private EPartService partService;
	@Inject private MApplication application;
	@Inject private EModelService modelService;
	
	@Inject private MDirtyable dirty;
	
	//Controls
	Button btnRemove;
	Button btnAddCsvFile;
	Button btnAddRdfConstruction;
	Button btnAddProperty;
	Button btnAddReferenceProperty;
	TreeViewer treeViewer;
	private Button btnEdit;
	
	//Menus
	Menu csvFileMenu;
	Menu csvToRdfMenu;
	
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
		
		
		csvFileMenu = new Menu(tree);
		MenuItem mntmCsvViewer = new MenuItem(csvFileMenu, SWT.NONE);
		mntmCsvViewer.setText("CSV viewer");
		
		csvToRdfMenu = new Menu(tree);
		MenuItem mntmCodePreview = new MenuItem(csvToRdfMenu, SWT.NONE);
		mntmCodePreview.setText("code");
		
		MenuItem mntmRdfPreview = new MenuItem(csvToRdfMenu, SWT.NONE);
		mntmRdfPreview.setText("RDF previewer");
		
		mntmCsvViewer.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				openCsvViewerPart();
				super.widgetSelected(e);
			}
		});
		
		mntmRdfPreview.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				openRdfTurtleViewerPart();
				super.widgetSelected(e);
			}
		});
		
		mntmCodePreview.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				openCodePreview();
				super.widgetSelected(e);
			}
		});
		
		//mntmCsvViewer.
		
		Composite compositeControls = new Composite(sashForm, SWT.NONE);
		compositeControls.setLayout(new GridLayout(1, false));
		
		btnAddCsvFile = new Button(compositeControls, SWT.NONE);
		btnAddCsvFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnAddCsvFile.setImage(ResourceManager.getPluginImage("unblod", "protege-icons/form.add.gif"));
		btnAddCsvFile.setText("Add CSV file");
		
		btnAddRdfConstruction = new Button(compositeControls, SWT.NONE);
		btnAddRdfConstruction.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnAddRdfConstruction.setImage(ResourceManager.getPluginImage("unblod", "protege-icons/individual.add.png"));
		btnAddRdfConstruction.setText("Add RDF construction");
		
		btnAddProperty = new Button(compositeControls, SWT.NONE);
		btnAddProperty.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnAddProperty.setImage(ResourceManager.getPluginImage("unblod", "protege-icons/property.data.add.png"));
		btnAddProperty.setText("Add Property");
		
		btnAddReferenceProperty = new Button(compositeControls, SWT.NONE);
		btnAddReferenceProperty.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnAddReferenceProperty.setImage(ResourceManager.getPluginImage("unblod", "protege-icons/property.object.add.png"));
		btnAddReferenceProperty.setText("Add Reference Property");
		
		btnEdit = new Button(compositeControls, SWT.NONE);
		btnEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnEdit.setImage(ResourceManager.getPluginImage("unblod", "metro-icons/appbar.edit.png"));
		btnEdit.setText("Edit");
		
		btnRemove = new Button(compositeControls, SWT.NONE);
		btnRemove.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnRemove.setImage(ResourceManager.getPluginImage("unblod", "protege-icons/clear.gif"));
		btnRemove.setText("Remove...");
		sashForm.setWeights(new int[] {273, 174});
		
		treeViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				CsvToRdfImportation csvToRdfImportation = null;
				CsvFile csvFile = null;
				RdfConstruction rdfConstruction = null;
				Property property = null;
				ReferenceProperty referenceProperty = null;
				
				
				// TODO Auto-generated method stub
				if (element instanceof CsvToRdfImportation) {
					csvToRdfImportation = (CsvToRdfImportation)element;
					return "CSV importation";
				}
				
				if (element instanceof CsvFile) {
					csvFile = (CsvFile)element;
					return "CSV file - " +  csvFile.getName();
				}
				
				if (element instanceof RdfConstruction) {
					rdfConstruction = (RdfConstruction)element;
					return "Construction - " +  rdfConstruction.getName();
				}
				
				if (element instanceof Property) {
					property = (Property)element;
					return "Property - " +  property.getName();
				}
				
				if (element instanceof ReferenceProperty) {
					referenceProperty = (ReferenceProperty)element;
					return "Property - " +  referenceProperty.getName();
				}
				
				return super.getText(element);
			}
			
			@Override
			public Image getImage(Object element) {
				
				/*if (element instanceof CsvToRdfImportation) {
					return ResourceManager.getPluginImage("unblod", GUIUtil.icon_CSV_FILE);
				}*/
				
				if (element instanceof CsvFile) {
					return ResourceManager.getPluginImage("unblod", GUIUtil.icon_CSV_FILE);
				}
				
				if (element instanceof RdfConstruction) {
					return ResourceManager.getPluginImage("unblod", GUIUtil.icon_RDF_CONSTRUCTION);
				}
				
				if (element instanceof ReferenceProperty) {
					return ResourceManager.getPluginImage("unblod", GUIUtil.icon_PROPERTY_OBJ);
				}
				else if (element instanceof Property) {
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
		
		btnEdit.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
				Object firstElement = selection.getFirstElement();
				
				if (firstElement instanceof CsvFile) {
					CsvFile csvFile = (CsvFile)firstElement;
					CsvFileDialog dialog = new CsvFileDialog(shell, csvFile);
					
					dialog.create();
					if (dialog.open() == Window.OK) {
						treeViewer.refresh();
						dirty.setDirty(true);
					}
					
				}
				else if (firstElement instanceof RdfConstruction) {
					RdfConstruction rdfConstruction = (RdfConstruction)firstElement;
					RdfConstructionDialog dialog = new RdfConstructionDialog(shell, rdfConstruction, dataset);
					
					dialog.create();
					if (dialog.open() == Window.OK) {
						treeViewer.refresh();
						dirty.setDirty(true);
					}
					
				}
				else if (firstElement instanceof ReferenceProperty) {
					ReferenceProperty property = (ReferenceProperty)firstElement;
					CsvReferencePropertyDialog dialog = new CsvReferencePropertyDialog(shell, property, dataset);
					
					dialog.create();
					if (dialog.open() == Window.OK) {
						treeViewer.refresh();
						dirty.setDirty(true);
					}
				}
				else if (firstElement instanceof Property) {
					Property property = (Property)firstElement;
					CsvPropertyDialog dialog = new CsvPropertyDialog(shell, property, dataset);
					
					dialog.create();
					if (dialog.open() == Window.OK) {
						treeViewer.refresh();
						dirty.setDirty(true);
					}
				}
				
				
				
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
				
				
				if (firstElement instanceof ReferenceProperty) {
					ReferenceProperty referenceProperty = (ReferenceProperty)firstElement;
					RdfConstruction parent = (RdfConstruction)referenceProperty.eContainer();
					
					parent.getProperties().remove(referenceProperty);
					treeViewer.refresh();
					dirty.setDirty(true);
				}
				else if (firstElement instanceof Property) {
					Property property = (Property)firstElement;
					RdfConstruction parent = (RdfConstruction)property.eContainer();
					
					parent.getProperties().remove(property);
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
						datasetModelService.getFactory().createRdfConstruction(), dataset);
				
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
				
				super.widgetSelected(e);
			}
			
		});
		
		btnAddProperty.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				CsvPropertyDialog dialog = new CsvPropertyDialog(shell, 
						datasetModelService.getFactory().createProperty(), dataset);
				
				ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
				Object firstElement = selection.getFirstElement();
				
				RdfConstruction rdfConstruction = (RdfConstruction)firstElement;
				
				if (!(firstElement instanceof RdfConstruction)) {
					return;
				}
				
				dialog.create();
				if (dialog.open() == Window.OK) {
				  
					Property property = dialog.getProperty();
					rdfConstruction.getProperties().add(property);
					
					treeViewer.refresh();
					dirty.setDirty(true);
				} 
				
				super.widgetSelected(e);
			}
			
		});
		
		
		btnAddReferenceProperty.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				CsvReferencePropertyDialog dialog = new CsvReferencePropertyDialog(shell, 
						datasetModelService.getFactory().createReferenceProperty(), dataset);
				
				ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
				Object firstElement = selection.getFirstElement();
				
				RdfConstruction rdfConstruction = (RdfConstruction)firstElement;
				
				if (!(firstElement instanceof RdfConstruction)) {
					return;
				}
				
				dialog.create();
				if (dialog.open() == Window.OK) {
				  
					ReferenceProperty referenceProperty = dialog.getReferenceProperty();
					rdfConstruction.getProperties().add(referenceProperty);
					
					treeViewer.refresh();
					dirty.setDirty(true);
				} 
				
				super.widgetSelected(e);
			}
			
		});
		
		treeViewer.setContentProvider(new CsvImportationTreeContentProvider());
		treeViewer.setInput(new CsvToRdfImportation[]{csvToRdfImportation});
		//System.out.println("CsvImportationPart: " + dataset.getName());
		
		treeViewer.expandAll();
		
		updateBtnControls();
	}
	
	protected void openRdfTurtleViewerPart() {
		// TODO Auto-generated method stub
		ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
		Object firstElement = selection.getFirstElement();
		
		if (!(firstElement instanceof CsvToRdfImportation)) {
			return;
		}
		
		TarqlQueryGenerator tarqlQueryGenerator = new TarqlQueryGenerator(dataset, csvToRdfImportation);
		//System.out.println(csvToRdfImportation.toString());
		String tarqlQuery = tarqlQueryGenerator.getQueryFromModel();
		
		TarqlService tarqlService =  new TarqlService(tarqlQuery);
		tarqlService.executeQuery();
		
		selectionService.setSelection(tarqlService.getModelRdfDataAsString("TURTLE"));
		MPart part = partService.createPart(GUIUtil.RDF_VIEWER_PART_ID);
		
		MPartStack stack = (MPartStack)modelService.find(GUIUtil.INFO_STACK_ID, application);
		stack.getChildren().add(part);
		
		part.setLabel("RDF Preview");
		part.setVisible(true);
		
		stack.setSelectedElement(part);
	}

	protected void openCodePreview() {
		// TODO Auto-generated method stub
		ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
		Object firstElement = selection.getFirstElement();
		
		if (firstElement instanceof CsvToRdfImportation) {
			Map<String, Object> args = new HashMap<String, Object>();
			
			//CsvToRdfImportation csvToRdf = (CsvToRdfImportation)firstElement;
			
			args.put("csvToRdfImportation", csvToRdfImportation);
			args.put("dataset", dataset);
			
			selectionService.setSelection(args);
		}
		else return;
		
		MPart part = partService.createPart(GUIUtil.RDF_CONS_CODE_PART_ID);
		
		MPartStack stack = (MPartStack)modelService.find(GUIUtil.INFO_STACK_ID, application);
		stack.getChildren().add(part);
		
		/*IEclipseContext context = EclipseContextFactory.create();
		context.set(Dataset.class, parentDataset);
		part.setContext(context);*/
		
		part.setLabel("Code");
		part.setVisible(true);
		
		stack.setSelectedElement(part);
	}

	protected void openCsvViewerPart() {
		ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
		Object firstElement = selection.getFirstElement();
		
		
		if (firstElement instanceof CsvFile) {
			CsvFile csvFile = (CsvFile)firstElement;
			selectionService.setSelection(csvFile.getCsvFileURL());
		}
		else return;
		
		MPart part = partService.createPart(GUIUtil.CSV_VIEWER_PART_ID);
		
		MPartStack stack = (MPartStack)modelService.find(GUIUtil.INFO_STACK_ID, application);
		stack.getChildren().add(part);
		
		/*IEclipseContext context = EclipseContextFactory.create();
		context.set(Dataset.class, parentDataset);
		part.setContext(context);*/
		
		part.setLabel("CSV viewer");
		part.setVisible(true);
		
		stack.setSelectedElement(part);
		
	}

	private void updateBtnControls() {
		ITreeSelection selection = ((ITreeSelection)treeViewer.getSelection());
		//Object parent  = selection.getPaths()[0].getParentPath().getLastSegment();
		Object firstElement = selection.getFirstElement();
		
		btnAddRdfConstruction.setEnabled(false);
		btnAddProperty.setEnabled(false);
		btnAddReferenceProperty.setEnabled(false);
		btnRemove.setEnabled(true);
		btnEdit.setEnabled(true);
		
		treeViewer.getTree().setMenu(null);
		
		if (firstElement instanceof CsvToRdfImportation) {
			btnAddCsvFile.setEnabled(true);
			btnRemove.setEnabled(false);
			btnEdit.setEnabled(false);
			
			treeViewer.getTree().setMenu(csvToRdfMenu);
		}
		else if (firstElement instanceof CsvFile) {
			btnAddRdfConstruction.setEnabled(true);
			btnRemove.setEnabled(true);
			btnEdit.setEnabled(true);
			
			treeViewer.getTree().setMenu(csvFileMenu);
		}
		else if (firstElement instanceof RdfConstruction) {
			btnAddProperty.setEnabled(true);
			btnAddReferenceProperty.setEnabled(true);
			btnRemove.setEnabled(true);
			btnEdit.setEnabled(true);
		}
		else if (firstElement instanceof Property) {
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
	  datasetModelService.saveCsvToRdfImportation(dataset, this.csvToRdfImportation);
	  // Save was successful
	  System.out.println("Saving data (csv importation)");
	  dirty.setDirty(false);
	} 
}
