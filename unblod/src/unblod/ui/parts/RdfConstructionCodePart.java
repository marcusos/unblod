package unblod.ui.parts;

import java.util.ArrayList;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Composite;

import unblod.dataset.model.dataset.CsvToRdfImportation;
import unblod.dataset.model.dataset.Dataset;
import unblod.tarql.service.TarqlQueryGenerator;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.SWT;

public class RdfConstructionCodePart {

	int linesLimit = 10;
	
	ArrayList<String []> lines = new ArrayList<String[]>();
	
	@PostConstruct
	public void createControl(Composite parent, 
			@Named(IServiceConstants.ACTIVE_SELECTION)Map<String, Object> args) {
		
		StyledText styledText = new StyledText(parent, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		
		Dataset dataset = (Dataset)args.get("dataset");
		CsvToRdfImportation csvToRdfImportation = (CsvToRdfImportation)args.get("csvToRdfImportation"); 
		
		TarqlQueryGenerator tarqlQueryGenerator = new TarqlQueryGenerator(dataset, csvToRdfImportation);
		
		//System.out.println(csvToRdfImportation.toString());
		
		String res = tarqlQueryGenerator.getQueryFromModel();
		
		//System.out.println("result: " + res);
		
		styledText.setText(res);
	    
	}
	
}
