package unblod.ui.handles;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.swt.widgets.Shell;

public class TestNandler {

	
	@Execute
	public void execute(Shell shell, MApplication application, IEventBroker eventBroker) {
		
		
		System.out.println("Testando o meun");
	}
	
	@CanExecute
	public boolean canExecute() {
		/*if (dataset == null) {
			return false;
		}*/
		
		return true;
	}
}
