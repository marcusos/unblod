package unblod.ui.handles;



import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

import unbload.model.IDatasetModel;
import unblod.ui.wizards.NewDatasetWizard;


public class NewDatasetHandler {

	private String className =  this.getClass().getName();
	public static final String TOPIC_NEWDATASET = "NEW_DATASET";
	
	@Inject
	IDatasetModel datasetModel;
	
	@Execute
	public void execute(Shell shell, MApplication application, IEventBroker eventBroker) {
		System.out.println(className + " Called");
		
		NewDatasetWizard newDatasetWizard =  new NewDatasetWizard();
		WizardDialog wizardDialog =  new WizardDialog(shell, newDatasetWizard);
		
		if (wizardDialog.open() == Window.OK) {
			System.out.println("Finished pressed");
			if (newDatasetWizard.getDataset() != null) {
				
				if (datasetModel.saveDataset(newDatasetWizard.getDataset())) {
					System.out.println("New dataset: " + newDatasetWizard.getDataset().getName());
					eventBroker.post(TOPIC_NEWDATASET, new Boolean(true));
				}
			}
				
		}
		else {
			System.out.println("Cancel pressed");
		}
		
	}
	
	@CanExecute
	public boolean canExecute() {
		/*if (dataset == null) {
			return false;
		}*/
		
		return true;
	}
	
}
