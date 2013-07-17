package unblod.ui.handles;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import unbload.ui.utils.GUIUtil;
import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.service.DatasetModelService;

public class RemoveDatasetHandler {

	
  @Inject private ESelectionService selectionService;
  
  @CanExecute
  boolean canExecute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION)Dataset dataset) {
    return dataset == null ? false : true;
  }

  @Execute
  void execute(@Named(IServiceConstants.ACTIVE_SELECTION)Dataset dataset, Shell shell, IEventBroker eventBroker ) {
	DatasetModelService datasetModelService = DatasetModelService.getInstace();
	
	if(MessageDialog.openConfirm(shell, "Remove dataset", "Are you sure you want to remove this dataset?")) {
		
		if (datasetModelService.deleteDataset(dataset.getName())) {
			System.out.println("dataset removed");
			eventBroker.post(GUIUtil.DATASETS_UPDATE, new Boolean(true));
		}
	}
	  
		
   // partService.savePart(part, false);
    selectionService.setSelection(null);
  }

} 