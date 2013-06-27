package unbload.mapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import unbload.model.CSVImportation;
import unbload.model.CSVProperty;
import unbload.model.Dataset;

public class CsvMappingGenerator {

	
	//ArrayList<CSVImportation> importations;
	//Map<String, String> mapImportations;
	ArrayList<Map<String,?>> mapImportations;
	Dataset dataset;
	
	String putQuotation(String source) {
		return "\"" + source + "\"";
	}
	
	String putSingleQuotation(String source) {
		return "'" + source + "'";
	}
	
	public CsvMappingGenerator (Dataset dataset, CSVImportation... csvImportation) {
		
		//importations =  new ArrayList<CSVImportation>(); 		
		
		mapImportations =  new ArrayList<Map<String,?>>();
		
		for (int i = 0; i < csvImportation.length; i++)
		{
			
		   String endTemplateGraph = ";";
		   String rowNumber = "";
		   
		   if (csvImportation[i].getHeaderLines() > 0){
				   rowNumber = ""+ (csvImportation[i].getHeaderLines()+1);
		   }
		   //se for o ultimo
		   if ( i == (csvImportation.length - 1) )
			   endTemplateGraph = ".";
		   
		   
		   Map<String, Object> map = new HashMap<String, Object>();
		   map.put("name", csvImportation[i].getClassName());
		   map.put("fileName", putQuotation("file:"+csvImportation[i].getFile()) );
		   map.put("sheetNumber", i+1+"");
		   map.put("templateGraph", csvImportation[i].getClassName()+"Graph");
		   map.put("endTemplateGraph",endTemplateGraph );
		   
		   String finalUri = putSingleQuotation(dataset.getUri() + "resources/" + csvImportation[i].getClassName() + "/");
		   
		   finalUri = finalUri+" & "+"URLENCODE("+csvImportation[i].getUriSourceCol()+rowNumber+")";
		   finalUri = putQuotation(finalUri);
		   
		   map.put("classURI", finalUri + "^^xl:Expr");
		   map.put("classId", dataset.getNamespace() + ":" +csvImportation[i].getClassName());
		   
		   ArrayList<Map<String, String>> properties = new ArrayList<Map<String,String>>();
		   
		   int propertiesCount =  csvImportation[i].getProperty().size();
		   
		   for (int j = 0; j < propertiesCount; j++) {
			   String dataType = "^^xl:Expr";
			   String endProperty = ";";
			   
			   //if the last
			   if (j == (propertiesCount - 1))
				   endProperty = ".";
			   
			   CSVProperty property = csvImportation[i].getProperty().get(j);
			   Map<String, String> mapProperty = new HashMap<String, String>();
			   mapProperty.put("property", dataset.getNamespace() + ":" 
					   						+ property.getName() + " "
					   						+ "\"" + property.getSourceCol()+rowNumber + "\""
					   						+ dataType + endProperty);
			   
			   properties.add(mapProperty);
			   System.out.println("csv-property to create: " + mapProperty.get("property"));
		   }
		   
		   map.put("properties", properties);
		   mapImportations.add(map);
		   
		   //mapImportations.
		}
		this.dataset = dataset; 
	}

	public Boolean generatePreviewMap() {
		// TODO Auto-generated method stub
		
		CsvMappingTemplate.writeTemplateFile(dataset, mapImportations);
		
		return null;
	}
	
	
	
	
}
