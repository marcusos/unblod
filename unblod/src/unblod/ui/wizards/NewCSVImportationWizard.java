package unblod.ui.wizards;

import org.eclipse.jface.wizard.Wizard;

import unblod.dataset.model.dataset.Dataset;



public class NewCSVImportationWizard extends Wizard {

	protected Dataset dataset;
	protected NewCSVImportationWizardPageOne pageOne;
	
	public NewCSVImportationWizard(Dataset dataset) {
		super();
		setNeedsProgressMonitor(true);
		this.dataset = dataset;
	}
	
	@Override
	public void addPages() {
		pageOne =  new NewCSVImportationWizardPageOne(dataset);
		addPage(pageOne);
	}
	
	@Override
	public boolean performFinish() {
		
		//todo = pageOne.getTodoDatailsPart().generateTodoFromInput();
		return pageOne.isConfirmed();
	}

	@Override
	public boolean canFinish() {
		// TODO Auto-generated method stub
		return pageOne.isPageComplete();
	}
}
