package unblod.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;

import unblod.dataset.model.dataset.Dataset;

public class DatasetInfoPart {
	
	//@Inject IEclipseContext context;
	private Dataset dataset;
	
	@PostConstruct
	public void createControl(Composite parent, @Named(IServiceConstants.ACTIVE_SELECTION)Dataset mDataset) {
		
		this.dataset = mDataset;
		
		parent.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		parent.setLayout(new GridLayout(2, false));
		
		Label lblName = new Label(parent, SWT.NONE);
		lblName.setFont(SWTResourceManager.getFont("Lucida Grande", 12, SWT.BOLD));
		lblName.setText("Name:");
		
		Label name = new Label(parent, SWT.NONE);
		name.setText(dataset.getName());
		
		Label lblBaseUri = new Label(parent, SWT.NONE);
		lblBaseUri.setFont(SWTResourceManager.getFont("Lucida Grande", 12, SWT.BOLD));
		lblBaseUri.setText("Base URI:");
		
		Label baseUri = new Label(parent, SWT.NONE);
		baseUri.setText(dataset.getBaseUri());
		
		Label lblDescription = new Label(parent, SWT.NONE);
		lblDescription.setFont(SWTResourceManager.getFont("Lucida Grande", 12, SWT.BOLD));
		lblDescription.setText("Description:");
		
		Label description = new Label(parent, SWT.NONE);
		description.setText(dataset.getDescription());
		
		
		
		
		
		
	}
}
