package unblod.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

//import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;


public class DataIntegrationPart {
	
	public static final String TOPIC_NEWDATASET = "NEW_DATASET";
	
	@Inject private ESelectionService selectionService;
	@Inject private EPartService partService;
	private TreeViewer treeViewer;
	
	@Inject @Optional
	void datasetUpdate(@UIEventTopic(TOPIC_NEWDATASET) Boolean toUpdate) {
		if (toUpdate) {

		}
	}

	@PostConstruct
	public void createControl(Composite parent, EMenuService menuService) {
		
		//testando o carregamento do xlwrap
		//XlwrapRunner runner =  new XlwrapRunner();
		//runner.run();
		
		Composite composite = new Composite(parent, SWT.NONE);
//		composite.setLayout(new TreeColumnLayout());
		Display display = new Display();
		
		
	}
}