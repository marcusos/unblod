package unblod.tarql.service;


import unblod.dataset.model.dataset.CsvFile;
import unblod.dataset.model.dataset.CsvToRdfImportation;
import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.model.dataset.NamespaceDefinition;
import unblod.dataset.model.dataset.NamespacesDefinitions;
import unblod.dataset.model.dataset.Property;
import unblod.dataset.model.dataset.RdfConstruction;
import unblod.dataset.model.dataset.ReferenceProperty;
import unblod.dataset.service.DatasetModelService;

public class TarqlQueryGenerator {

	
	CsvToRdfImportation csvToRDF;
	Dataset dataset;
	DatasetModelService datasetModelService;
	
	public TarqlQueryGenerator(Dataset dataset, CsvToRdfImportation csvToRDF) {
		datasetModelService = DatasetModelService.getInstace();
		this.csvToRDF = csvToRDF;
		this.dataset = dataset;
	}
	
	public String getQueryFromModel() {
		return getQueryFromModel(false);
	}
	
	public String getQueryFromModel(Boolean preview) {
		
		String prefixs = "";
		String queries = "";
		
		NamespacesDefinitions nes = datasetModelService.getNamespacesDefinitions(dataset);
		
		for (NamespaceDefinition ne : nes.getDefinitions()) {
			//PREFIX ne: <http://ne.or>
			prefixs += "PREFIX " + ne.getPrefix() + ": " + "<" +  ne.getNamespace() + ">\n";
		}
		
		queries += prefixs + "\n";
		
		for (CsvFile csvFile : csvToRDF.getFromFiles()) {
			
			String q = "";
			
			for (RdfConstruction rdfConstruction: csvFile.getRdfConstructions()) {
				String qConstruct = "#construct RDF resource\n";
				
				qConstruct += "CONSTRUCT {\n";
				qConstruct += "\t?URI a " + rdfConstruction.getClassType() + ";\n";
				
				
				int i = 0;
				for (Property property : rdfConstruction.getProperties()) {
					String varName = "?var" + i;
					qConstruct += "\t" + property.getName() + " " + varName + ";\n";
					i++;
				}
				
				qConstruct += "}\n";
				
				
				qConstruct += "FROM <file:" + csvFile.getCsvFileURL() + ">\n";
//				qConstruct += "FROM <file:" + "/G:/testlod/examples/person.csv" + ">\n";
//				<file:G:\testlod\examples\person.csv>
			
				qConstruct += "WHERE {\n";
				
				if (rdfConstruction.getCustomUri() == null) {
					String pattern = "";
					
					if (rdfConstruction.getTransformation() == null || 
							rdfConstruction.getTransformation().equals("none")) {
						pattern = "?" + rdfConstruction.getSourceCsvCol();
					}
					else {
						pattern = rdfConstruction.getTransformation() +
								"(?" + rdfConstruction.getSourceCsvCol() + ")";
					}
					
					pattern = encloseConcat("\'" + rdfConstruction.getBaseUri() + "\'", pattern);
					
					qConstruct += "\t" + encloseBind(encloseUri(pattern), "?URI");
					
					
				}
				else {
					qConstruct += "\t" + encloseBind(rdfConstruction.getCustomUri(), "?URI");
				}
				
				i = 0;
				for (Property property : rdfConstruction.getProperties()) {
					String varName = "?var" + i;
					
					if (property instanceof ReferenceProperty) {
						ReferenceProperty rProperty = (ReferenceProperty)property;
						
						if (property.getCustomPattern() == null) {
							String pattern = "";
							
							if (property.getTransformation() == null || 
									property.getTransformation().equals("none")) {
								pattern = "?" + property.getSourceCSVCol();
							}
							else {
								pattern = property.getTransformation()+"(?" + property.getSourceCSVCol() + ")";
							}
							
							pattern = encloseConcat("\'" + rProperty.getUri() + "\'", pattern);
							
							qConstruct += "\t" + encloseBind(encloseUri(pattern), varName);
						}
						else {
							qConstruct += "\t" + encloseBind(property.getCustomPattern(), varName);
						}
						i++;
					}
					else {
						if (property.getCustomPattern() == null) {
							
							String pattern = "";
							
							if (property.getTransformation() == null || 
									property.getTransformation().equals("none")) {
								pattern = "?" + property.getSourceCSVCol();
							}
							else {
								pattern = property.getTransformation()+"(?" + property.getSourceCSVCol() + ")";
							}
							
							qConstruct += "\t" + encloseBind(pattern, varName);
						}
						else {
							qConstruct += "\t" + encloseBind(property.getCustomPattern(), varName);
						}
						i++;
					}
					
				}
				
				qConstruct += "}\n";
				
				if (preview) {
					qConstruct += "LIMIT 2";
				}
				
				q += qConstruct+"\n";
				
			
			}
			
			queries += q;
		}
		
		
		return queries;
	}
	
	String encloseConcat(String str1, String str2) {
		return "CONCAT(" + str1 + "," + str2 +")";
	}
	
	String encloseBind(String pattern,String varName) {
		
		return "BIND (" + pattern  + " AS " + varName +")\n";
	}
	
	String encloseUri(String pattern) {
		
		return "URI(" +  pattern +")";
	}
	
}
