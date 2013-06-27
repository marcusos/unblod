package unblod.xlwrap.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.rdf.model.Model;

import at.jku.xlwrap.exec.XLWrapMaterializer;
import at.jku.xlwrap.map.MappingParser;
import at.jku.xlwrap.map.XLWrapMapping;

public class XlwrapRunner implements ICsvImportationRunner {
	
	OutputStream out = null;
	XLWrapMapping  map = null;
	Model m;	
	private static final Logger log = LoggerFactory.getLogger( XlwrapRunner.class );
	
	public static final String PATH =  "/Users/marcusoliveira/Desktop/teste/";
	
	public void runXlwrap(String mapPath) {
		System.out.println("CSVtoRDF conversor.");
		try {
			//out = new FileOutputStream("datas/sancionadas.ttl");
			out = new FileOutputStream(PATH + "data-preview/preview.ttl");
			map = MappingParser.parse(PATH + "csv-mapping.trig");
			m = new XLWrapMaterializer().generateModel(map);
			//setPrefixs(m);
			m.write( out, "Turtle" );
			
		}
		catch (Exception e) {
            log.error( e.getMessage(), e);
        }
		System.out.println("End.");
		/*try {
			Runtime.getRuntime().exec("java -jar map.jar time.rel test.txt debug");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	@Override
	public boolean run(String mapPath) {
		// TODO Auto-generated method stub
		runXlwrap(mapPath);
		return true;
	}
}
