package unblod.util;

import java.io.BufferedReader;
import java.io.FileReader;


public class Util {

	public static final String[] CSV_COLUNMS = {"A","B", "C", "D", "E", "F", "G", "H", "I"};
	public static final String[] CSV_TRANSFORMATIONS = {"none", "URLENCODE", "ONLYNUMBER"};
	
	public static final String[] XSD_DATATYPES = {"plain expression", "xsd:string", "xsd:integer", 
											"xsd:long", "xsd:boolean", "xsd:date", "xsd:dateTime", "xsd:time",
											"xsd:double", "xsd:float", "xsd:decimal"};
	
	public static final String PATH =  "/Users/marcusoliveira/Desktop/teste";
	
	/*public static Image loadImage(Class<?> clazz, String path) {
		Bundle bundle = FrameworkUtil.getBundle(clazz);
		URL url = FileLocator.find(bundle, 
		  new Path(path), null);
		ImageDescriptor imageDescr = ImageDescriptor.createFromURL(url);
		return imageDescr.createImage(); 
	}*/
	
	
	
	public static String readFileAsString(String filePath) throws java.io.IOException
	{
	    BufferedReader reader = new BufferedReader(new FileReader(filePath));
	    String 		   line;
	    String         ls = System.getProperty("line.separator");
	    StringBuilder  stringBuilder = new StringBuilder();
	    
	    while( ( line = reader.readLine() ) != null)
	    {
	    	stringBuilder.append( line );
	        stringBuilder.append( ls );
	    }
	    reader.close();
	    return stringBuilder.toString();
	}
}
