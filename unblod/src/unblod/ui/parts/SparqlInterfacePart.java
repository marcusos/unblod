package unblod.ui.parts;


import java.io.InputStream;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;

import unbload.ui.utils.GUIUtil;
import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.model.dataset.NamespaceDefinition;
import unblod.dataset.model.dataset.NamespacesDefinitions;
import unblod.dataset.service.DatasetModelService;

public class SparqlInterfacePart {

	
	@Inject private ESelectionService selectionService;
	@Inject private EPartService partService;
	@Inject private MApplication application;
	@Inject private EModelService modelService;
	
	@PostConstruct
	public void createControl(Composite parent, 
			@Named(IServiceConstants.ACTIVE_SELECTION)Dataset dataset) {
		
		DatasetModelService datasetModelService = DatasetModelService.getInstace();
		String rdfDataPath = datasetModelService.getRdfDataPath(dataset);
		
		NamespacesDefinitions nes = datasetModelService.getNamespacesDefinitions(dataset);
		
		InputStream in = FileManager.get().open(rdfDataPath);
		
		final Model model = ModelFactory.createDefaultModel();
		model.read(in, null, "TTL");
		
		SashForm sashForm = new SashForm(parent, SWT.NONE);
		
		Composite compositeCode = new Composite(sashForm, SWT.NONE);
		compositeCode.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		final StyledText styledText = new StyledText(compositeCode, SWT.BORDER);
		
		String q = "";
		
		for (NamespaceDefinition ne: nes.getDefinitions()) {
			q += "PREFIX " + ne.getPrefix() + ": <" + ne.getNamespace() +">\n";
		}
		q += "\n";
		q += "SELECT ?s ?p ?o\n";
		q += "WHERE {\n" ;
		q += "\t?s ?p ?o\n" ;
		q += "}\n" ;
		
		styledText.setText(q);
		
		Composite compositeControls = new Composite(sashForm, SWT.NONE);
		compositeControls.setLayout(new GridLayout(1, false));
		
		Button btnRunQuery = new Button(compositeControls, SWT.NONE);
		btnRunQuery.setBounds(0, 0, 94, 28);
		btnRunQuery.setText("Run query");
		sashForm.setWeights(new int[] {3, 1});
		
		btnRunQuery.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				String queryStr = styledText.getText();
				Query query = QueryFactory.create(queryStr);
				QueryExecution qexec = QueryExecutionFactory.create(query, model); 
				
				try {
				    ResultSet results = qexec.execSelect() ;
				    String resultStr = ResultSetFormatter.asText(results);
				    selectionService.setSelection(resultStr);
				    openSparqlResultPart();
				    
				} finally { qexec.close() ; }
				
				super.widgetSelected(e);
			}
		});
		//StyledText styledText = new StyledText(parent, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		//System.out.println("result: " + res);
		//styledText.setText(code);
	}
	
	protected void openSparqlResultPart() {
		
		MPart part = partService.createPart("unblod.partdescriptor.SparqlResultPart");
		
		MPartStack stack = (MPartStack)modelService.find(GUIUtil.INFO_STACK_ID, application);
		stack.getChildren().add(part);
		
		/*IEclipseContext context = EclipseContextFactory.create();
		context.set(Dataset.class, parentDataset);
		part.setContext(context);*/
		
		part.setLabel("Sparql result");
		part.setVisible(true);
		
		stack.setSelectedElement(part);
		
	}

	
	
	
	
	
}
