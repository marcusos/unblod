package unbload.mapping;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import unbload.model.Dataset;
import unbload.ui.utils.Util;

import com.x5.template.Chunk;
import com.x5.template.Theme;

public class CsvMappingTemplate {

	
	static public void writeTemplateFile() {
		Theme theme =  new Theme();
		Chunk chunk =  theme.makeChunk("csv-mapping-template", "trig");
		
		chunk.set("data_prefix", "teste");
		
		String outfilePath = Util.PATH + "/csv-mapping.trig";
	    
		File file = new File(outfilePath);
	    FileWriter out;
		try {
			out = new FileWriter(file);
			chunk.render( out );
			out.flush();
			out.close();
			System.out.print("Sucess genarating csv-mapping.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("faield genarating csv-mapping.");
			e.printStackTrace();
		}
		
	}

	public static void writeTemplateFile(Dataset dataset,ArrayList<Map<String,?>> mapImportations) {
		// TODO Auto-generated method stub
		Theme theme =  new Theme();
		Chunk chunk =  theme.makeChunk("csv-mapping-template", "trig");
		
		chunk.set("data_prefix", dataset.getNamespace());
		chunk.set("data_uri", "<" + dataset.getUri() + ">");
		chunk.set("csvImportations", mapImportations);
		
		String outfilePath = Util.PATH + "/csv-mapping.trig";
	    
		File file = new File(outfilePath);
	    FileWriter out;
		try {
			out = new FileWriter(file);
			chunk.render( out );
			out.flush();
			out.close();
			System.out.print("Sucess genarating csv-mapping.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("faield genarating csv-mapping.");
			e.printStackTrace();
		}
	}
}
