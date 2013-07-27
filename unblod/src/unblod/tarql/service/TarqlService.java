package unblod.tarql.service;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import com.hp.hpl.jena.rdf.model.Model;

public class TarqlService {

	Model model;
	String lang;
	String rdfFilePath;
	TarqlApi tarqlApi;
	
	
	public TarqlService(String tarqlQuery) {
		//this.lang = lang;
		//this.rdfFilePath = rdfFilePath;
		Reader  reader =  new StringReader(tarqlQuery);
		tarqlApi = new TarqlApi(reader);
		
	}
	
	public void executeQuery() {
		tarqlApi.executeQuery();
		this.model = tarqlApi.getResultModel();
	}
	
	public String getModelRdfDataAsString(String lang) {
		String syntax = lang; // also try "N-TRIPLE" and "TURTLE" adn RDF/XML-ABBREV" 
		StringWriter out = new StringWriter();
		System.out.println("Teste model: " + model.toString());
		model.write(out, syntax);
		String result = out.toString();
		
		return result;
	}
}
