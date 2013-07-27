package unblod.ui.parts;

import java.io.File;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.layout.TreeColumnLayout;

import unbload.ui.utils.DatasetTreeContentProvider;
import unbload.ui.utils.GUIUtil;
import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.service.DatasetModelService;
import unblod.util.Util;


public class DatasetTreePart {
	
	
	//@Inject private IDatasetModel datasetModel;
	@Inject private ESelectionService selectionService;
	
	//@Inject private EPartService partService;
	//@Inject private MApplication application;
	//@Inject private EModelService modelService;
	
	//@Inject private ECommandService commandService;
	//@Inject private EHandlerService handlerSerivce;
	@Inject private MApplication application;
	@Inject private EPartService partService;
	@Inject private EModelService modelService;
	
	//@Inject private IEclipseContext context;
	//@Inject private EHandlerService handlerService;
	
	private TreeViewer treeViewer;
	private DatasetModelService datasetModelService;
	
	@Inject @Optional
	void datasetUpdate(@UIEventTopic(GUIUtil.DATASETS_UPDATE) Boolean toUpdate) {
		if (toUpdate) {
			/*Job job = new Job("Loading") {
				
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					// TODO Auto-generated method stub
					final List<Todo> list =  todoService.getTodos();
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							// TODO Auto-generated method stub
							tableViewer.setInput(list);
							tableViewer.refresh();
						}
					});
					return Status.OK_STATUS;
				}
			};
			job.schedule();*/
			
			//treeViewer.setInput(datasetModel.getDatasets());
			System.out.println("datasets updated");
			treeViewer.refresh();
		}
	}

	@PostConstruct
	public void createControl(Composite parent, final EMenuService menuService) {
		
		datasetModelService =  DatasetModelService.getInstace();
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new TreeColumnLayout());
		
	    treeViewer = new TreeViewer(composite, SWT.BORDER);
		//Tree tree = treeViewer.getTree();
		
		treeViewer.setContentProvider(new DatasetTreeContentProvider());
		treeViewer.setInput(datasetModelService.getDatasets());
		
		treeViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				if (element instanceof Dataset)
				{
					Dataset dataset = (Dataset)element;
					return dataset.getName();
				}
				
				if (element instanceof File)
				{
					File file = (File)element;
					
					String extension = Util.getExtension(file);
					
					if (extension.equals(DatasetModelService.DATASET_EXS)) {
						return "Info";
					}
					if (extension.equals(DatasetModelService.CSVTORDF_EXS)) {
						return "CSV importation";
					}
					if (extension.equals(DatasetModelService.NAMESPACES_EXS)) {
						return "Namespaces";
					}
					if (extension.equals(DatasetModelService.RDF_EXS)) {
						return "RDF data";
					}
					if (extension.equals(DatasetModelService.SCHEMA_EXS)) {
						return "Data Schema";
					}
					
				}
				
				return super.getText(element);
			}
			
			@Override
			public Image getImage(Object element) {
				
				Image image = null;
				
				if (element instanceof Dataset)
				{
					image = ResourceManager.getPluginImage("unblod", GUIUtil.icon_DATASET);
				}
				
				if (element instanceof File)
				{
					File file = (File)element;
					
					String extension = Util.getExtension(file);
					
					if (extension.equals(DatasetModelService.CSVTORDF_EXS)) {
						return image = ResourceManager.getPluginImage("unblod", GUIUtil.icon_CSV);
					}
					if (extension.equals(DatasetModelService.NAMESPACES_EXS)) {
						return image = ResourceManager.getPluginImage("unblod", GUIUtil.icon_NAMESPACE);
					}
					if (extension.equals(DatasetModelService.DATASET_EXS)) {
						return image = ResourceManager.getPluginImage("unblod", GUIUtil.icon_INFO);
					}
					if (extension.equals(DatasetModelService.RDF_EXS)) {
						return image = ResourceManager.getPluginImage("unblod", GUIUtil.icon_RDF);
					}
					
				}
				
				return image;
			}
		});
		
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection)treeViewer.getSelection();
				Object firstElement = selection.getFirstElement();
				
				if (firstElement instanceof Dataset) {
					menuService.registerContextMenu(treeViewer.getControl(), "unblod.popupmenu.datasetmenu");
					
					
					System.out.println("instanceof dataset: " + ((Dataset)firstElement).getName());
					Dataset dataset = (Dataset)firstElement;
					selectionService.setSelection(dataset);
				}
				else {
					menuService.registerContextMenu(treeViewer.getControl(), "unblod.popupmenu.csvimportationmenu");
				}
				
			}
		});
		
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				//IStructuredSelection selection = (IStructuredSelection)treeViewer.getSelection();
				//Object firstElement = selection.getFirstElement();
				//selection.getFirstElement().
				
				ITreeSelection selection = ((ITreeSelection)event.getSelection());
				Object parent  = selection.getPaths()[0].getParentPath().getLastSegment();
				Object firstElement = selection.getFirstElement();
				
				
				
				if ((parent instanceof Dataset)) {
					Dataset datasetParent = (Dataset)parent;
					selectionService.setSelection(datasetParent);
					//System.out.println("dataset(" + datasetParent.getName() + ")subitem double clicked.");
					
					if (firstElement instanceof File) {
						File file = (File)firstElement;
						String extension = Util.getExtension(file);
						
						if(extension.equals(DatasetModelService.DATASET_EXS)) {
							showDatasetInfoPart(datasetParent);
						}
						if(extension.equals(DatasetModelService.NAMESPACES_EXS)) {
							showDatasetNePart(datasetParent);
						}
						if(extension.equals(DatasetModelService.CSVTORDF_EXS)) {
							showCsvImportationPart(datasetParent);
						}
						if(extension.equals(DatasetModelService.RDF_EXS)) {
							showSparqlInterfacePart(datasetParent);
						}
						if(extension.equals(DatasetModelService.SCHEMA_EXS)) {
							showSchemaPart(datasetParent);
						}
					
					}
					
				}
				
			}

		});
		
		//menuService.registerContextMenu(treeViewer.getControl(), "");
	}
	
	protected void showSparqlInterfacePart(Dataset parentDataset) {
		// TODO Auto-generated method stub
		MPart part = partService.createPart("unblod.partdescriptor.SparqlInterfacePart");
		MPartStack stack = (MPartStack)modelService.find("unblod.partstack.mainstack", application);
		stack.getChildren().add(part);
		
		/*IEclipseContext context = EclipseContextFactory.create();
		context.set(Dataset.class, parentDataset);
		part.setContext(context);*/
		
		part.setLabel(parentDataset.getName() + " - Sparql interface");
		part.setVisible(true);
		stack.setSelectedElement(part);
	}

	private void showDatasetInfoPart(Dataset parentDataset) {
		
		MPart part = partService.createPart("unblod.partdescriptor.datasetInfo");
		
		MPartStack stack = (MPartStack)modelService.find("unblod.partstack.mainstack", application);
		stack.getChildren().add(part);
		
		/*IEclipseContext context = EclipseContextFactory.create();
		context.set(Dataset.class, parentDataset);
		part.setContext(context);*/
		
		part.setLabel(parentDataset.getName() + " - Info");
		
		part.setVisible(true);
		
		stack.setSelectedElement(part);
	}
	
	private void showDatasetNePart(Dataset parentDataset) {
		
		MPart part = partService.createPart("unblod.partdescriptor.datasetNamespaces");
		
		MPartStack stack = (MPartStack)modelService.find("unblod.partstack.mainstack", application);
		stack.getChildren().add(part);
		
		/*IEclipseContext context = EclipseContextFactory.create();
		context.set(Dataset.class, parentDataset);
		part.setContext(context);*/
		
		part.setLabel(parentDataset.getName() + " - Namespaces");
		part.setVisible(true);
		
		stack.setSelectedElement(part);
	}
	
	
	private void showCsvImportationPart(Dataset parentDataset) {
		//IEclipseContext context = application.getContext();
		//context.set(Dataset.class, parentDataset);
		
		/*handlerSerivce.activateHandler("unblod.command.opencsvimportation", 
		    new OpenCsvImportationPartHandle());
		ParameterizedCommand cmd =commandService.createCommand("unblod.command.opencsvimportation", null);
		
		handlerSerivce.executeHandler(cmd);*/
		
		MPart part = partService.createPart("unblod.partdescriptor.csvImportation");
		
		MPartStack stack = (MPartStack)modelService.find("unblod.partstack.mainstack", application);
		stack.getChildren().add(part);
		
		/*IEclipseContext context = EclipseContextFactory.create();
		context.set(Dataset.class, parentDataset);
		part.setContext(context);*/
		
		part.setLabel(parentDataset.getName() + " - CSV importation");
		
		part.setVisible(true);
		
		stack.setSelectedElement(part);
		//partService.showPart(part, PartState.VISIBLE);
		
	}
	
	protected void showSchemaPart(Dataset parentDataset) {
		// TODO Auto-generated method stub
		MPart part = partService.createPart("unblod.partdescriptor.schemaPart");
		MPartStack stack = (MPartStack)modelService.find("unblod.partstack.mainstack", application);
		stack.getChildren().add(part);
		
		/*IEclipseContext context = EclipseContextFactory.create();
		context.set(Dataset.class, parentDataset);
		part.setContext(context);*/
		
		part.setLabel(parentDataset.getName() + " - Schema");
		part.setVisible(true);
		stack.setSelectedElement(part);
	}
}
