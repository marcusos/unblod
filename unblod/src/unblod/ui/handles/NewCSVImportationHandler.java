package unblod.ui.handles;


import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

import unblod.dataset.model.dataset.Dataset;
import unblod.ui.wizards.NewCSVImportationWizard;


public class NewCSVImportationHandler {

	private String className =  this.getClass().getName();
	
	@Execute
	public void execute(Shell shell, @Optional @Named(IServiceConstants.ACTIVE_SELECTION)Dataset dataset,
						MApplication application) {
		//System.out.println(className + " Called, Dataset:" + dataset.getUri());
		
		NewCSVImportationWizard newCSVImportationWizard =  new NewCSVImportationWizard(dataset);
		WizardDialog wizardDialog =  new WizardDialog(shell, newCSVImportationWizard);
		if (wizardDialog.open() == Window.OK) {
				System.out.println("Finished pressed");
				//model.addTodo(newTodoWizard.getTodo());
		}
		else {
			System.out.println("Cancel pressed");
		}
		
	}
	
	@CanExecute
	public boolean canExecute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION)Dataset dataset) {
		/*if (dataset == null) {
			return false;
		}*/
		
		return true;
	}
	
}
