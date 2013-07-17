package unblod.ui.wizards;

import org.eclipse.jface.wizard.Wizard;

import unblod.dataset.model.dataset.Dataset;




public class NewDatasetWizard extends Wizard {

	protected Dataset dataset;
	
	public Dataset getDataset() {
		return dataset;
	}

	public void setDataset(Dataset dataset) {
		this.dataset = dataset;
	}

	protected NewDatasetPageOne pageOne;
	
	public NewDatasetWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	@Override
	public void addPages() {
		pageOne =  new NewDatasetPageOne();
		addPage(pageOne);
	}
	
	@Override
	public boolean performFinish() {
		dataset = pageOne.generateDatasetFromInput();
		return true;
	}

	@Override
	public boolean canFinish() {
		// TODO Auto-generated method stub
		return pageOne.isPageComplete();
	}
}
