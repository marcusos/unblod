package unblod.ui.wizards;


import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.widgets.Composite;

import unbload.ui.components.CsvImportationForm;
import unblod.dataset.model.dataset.Dataset;

public class NewCSVImportationWizardPageOne extends WizardPage {

	CsvImportationForm csvForm;
	NewCSVImportationWizardPageOne instance = this;
	boolean confirmed = false;
	Dataset dataset;
		
	protected NewCSVImportationWizardPageOne(Dataset dataset) {
		super("New CSV Importation");
		setTitle("New CSV Importation");
		setDescription("Create and define a new CSV importation.");
		// TODO Auto-generated constructor stub
		this.dataset = dataset;
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		Composite container = new Composite(parent, SWT.NULL);
		
		setControl(container);
		this.csvForm = new CsvImportationForm(dataset);
		csvForm.createControl(container);
		//csvForm.createControl(container,this.getShell());
		
		//Composite container = new Composite(parent, SWT.NULL);
		//setControl(container);
		
		setupValidation();
		
		setPageComplete(false);
	}
	
	private void setupValidation() {
		// TODO Auto-generated method stub
		csvForm.getClassName().addModifyListener(new CsvImportationModifyListener(csvForm));
		csvForm.getFile().addModifyListener(new CsvImportationModifyListener(csvForm));
		csvForm.getHeaderLine().addModifyListener(new CsvImportationModifyListener(csvForm));
		csvForm.getUri().addModifyListener(new CsvImportationModifyListener(csvForm));
		
		csvForm.getClassName().addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				instance.csvForm.autoWriteURI();
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		csvForm.getSourceColunmViewer().addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				// TODO Auto-generated method stub
				csvForm.autoWriteURI();
			}
		});
		csvForm.getTransformationViewer().addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				// TODO Auto-generated method stub
				csvForm.autoWriteURI();
			}
		});
			
		//csvForm.getSourceColunmViewer().addSelectionChangedListener(listener)
	}

	private class CsvImportationModifyListener implements ModifyListener {
		
		CsvImportationForm csvImportationForm;
		
		public CsvImportationModifyListener(CsvImportationForm csvImportationForm) {
			super();
			this.csvImportationForm = csvImportationForm;
		}

		@Override
		public void modifyText(ModifyEvent e) {
			// TODO Auto-generated method stub
			this.csvImportationForm.validate();
			instance.setErrorMessage(csvImportationForm.getValidationMsg());
			instance.confirmed = csvImportationForm.isValidated();
			
			//csvImportationForm.autoWriteURI();
			
			if (csvImportationForm.isValidated()) {
				setPageComplete(true);
			}
			else
				setPageComplete(false);
		}
		
	}
	
	public boolean isConfirmed() {
		return confirmed;
	}
	
	
}
