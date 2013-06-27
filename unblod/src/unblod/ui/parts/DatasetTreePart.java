package unblod.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.layout.TreeColumnLayout;

import unbload.model.Dataset;
import unbload.model.IDatasetModel;
import unbload.ui.utils.DatasetTreeContentProvider;


public class DatasetTreePart {
	
	public static final String TOPIC_NEWDATASET = "NEW_DATASET";
	
	@Inject private IDatasetModel datasetModel;
	@Inject private ESelectionService selectionService;
	@Inject private EPartService partService;
	private TreeViewer treeViewer;
	
	@Inject @Optional
	void datasetUpdate(@UIEventTopic(TOPIC_NEWDATASET) Boolean toUpdate) {
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
			
			treeViewer.setInput(datasetModel.getDatasets());
			treeViewer.refresh();
		}
	}

	@PostConstruct
	public void createControl(Composite parent, EMenuService menuService) {
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new TreeColumnLayout());
		
	    treeViewer = new TreeViewer(composite, SWT.BORDER);
		Tree tree = treeViewer.getTree();
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		
		treeViewer.setContentProvider(new DatasetTreeContentProvider());
		treeViewer.setInput(datasetModel.getDatasets());
		
		treeViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				if (element instanceof Dataset)
				{
					Dataset dataset = (Dataset)element;
					return dataset.getName();
				}
				
				return super.getText(element);
			}
			
			@Override
			public Image getImage(Object element) {
				Image image = ResourceManager.getPluginImage("unblod", "icons/database.png");
				return image;
			}
		});
		
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection)treeViewer.getSelection();
				Object firstElement = selection.getFirstElement();
				
				System.out.println("selected");
				if (firstElement instanceof Dataset)
					System.out.println("instanceof dataset: " + ((Dataset)firstElement).getName());
				
				Dataset dataset = (Dataset)firstElement;
				selectionService.setSelection(dataset);
				
				/*MPart todoDetailPart = partService.findPart("com.example.e4.rcp.todo.part.tododetails");
				todoDetailPart.setVisible(true);
				partService.showPart(todoDetailPart, PartState.VISIBLE);*/
				
				
			}
		});
		
		menuService.registerContextMenu(treeViewer.getControl(), "unblod.popupmenu.datasetmenu");
	}
}
