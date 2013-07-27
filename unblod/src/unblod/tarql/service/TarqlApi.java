package unblod.tarql.service;

import java.io.Reader;

import org.deri.tarql.CSVQueryExecutionFactory;
import org.deri.tarql.TarqlParser;
import org.deri.tarql.TarqlQuery;
import org.openjena.atlas.io.IndentedWriter;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.sparql.serializer.FmtTemplate;
import com.hp.hpl.jena.sparql.serializer.SerializationContext;

public class TarqlApi {


	private String queryFile = null;
	private Reader reader = null;
	private TarqlQuery query = null;
	
	
	//private List<String> csvFiles = new ArrayList<String>();
	
	//private boolean withHeader = false;
	//private boolean withoutHeader = false;
	private boolean testQuery = false;
	
	private Model resultModel;
	
	public TarqlApi(String queryFile) {
		
		this.queryFile = queryFile;
	}
	public TarqlApi(Reader reader) {
		
		this.reader = reader;
	}
	
	public TarqlQuery getQuery() {
		return this.query;
	}
	
	public void executeQuery() {
		TarqlQuery query = null; 
		
		try  {
			Model bla = ModelFactory.createOntologyModel();
			resultModel = ModelFactory.createDefaultModel();
		}
		catch (Exception e) {
			//System.out.println("msg: " + e.getCause().getStackTrace());
		}
		
		if (reader != null) {
			query = new TarqlParser(reader).getResult();
		}
		else {
			query = new TarqlParser(queryFile).getResult();
		}
		
		this.query = query;
		
		for (Query q: query.getQueries()) {
			Model previousResults = ModelFactory.createDefaultModel();
			previousResults.add(resultModel);
			CSVQueryExecutionFactory.setPreviousResults(previousResults);
			processResults(CSVQueryExecutionFactory.create(q));
			CSVQueryExecutionFactory.resetPreviousResults();
		}
	}
	
	private void processResults(QueryExecution ex) {
		if (testQuery && ex.getQuery().getConstructTemplate() != null) {
			IndentedWriter out = new IndentedWriter(System.out); 
			new FmtTemplate(out, new SerializationContext(ex.getQuery())).format(ex.getQuery().getConstructTemplate());
			out.flush();
		}
		
		if (ex.getQuery().isSelectType()) {
			System.out.println(ResultSetFormatter.asText(ex.execSelect()));
		} else if (ex.getQuery().isAskType()) {
			System.out.println(ResultSetFormatter.asText(ex.execSelect()));
		} else if (ex.getQuery().isConstructType()) {
			resultModel.setNsPrefixes(resultModel);
			ex.execConstruct(resultModel);
		} else {
			System.out.println("Only query forms CONSTRUCT, SELECT and ASK are supported");
		}
	}
	
	
	
	public String getQueryFile() {
		return queryFile;
	}

	public void setQueryFile(String queryFile) {
		this.queryFile = queryFile;
	}

	public Model getResultModel() {
		return resultModel;
	}

	/*public void setResultModel(Model resultModel) {
		this.resultModel = resultModel;
	}*/
}
