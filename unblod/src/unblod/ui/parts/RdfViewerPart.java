package unblod.ui.parts;


import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Composite;

import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.SWT;

public class RdfViewerPart {

	
	@PostConstruct
	public void createControl(Composite parent, 
			@Named(IServiceConstants.ACTIVE_SELECTION)String code) {
		
		StyledText styledText = new StyledText(parent, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		
		//System.out.println("result: " + res);
		
		styledText.setText(code);
	    
	}
	
}
