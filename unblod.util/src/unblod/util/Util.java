package unblod.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Stack;


public class Util {

	public static final String[] CSV_COLUMNS = {"a","b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"};
	public static final String[] CSV_TRANSFORMATIONS = {"none", "URLENCODE", "ONLYNUMBER"};
	
	public static final String[] XSD_DATATYPES = {"none", "xsd:string", "xsd:integer", 
											"xsd:long", "xsd:boolean", "xsd:date", "xsd:dateTime", "xsd:time",
											"xsd:double", "xsd:float", "xsd:decimal"};
	
	public static final String PATH =  "/Users/marcusoliveira/Desktop/teste";
//	public static String WORKSPACE = "/Users/marcusoliveira/git/unblod2/unblod.test/resources/fake-workspace/";
	public static String WORKSPACE = "/testlod/fake-workspace/";
	
	
	//public static String WORKSPACE = "/Users/marcusoliveira/Desktop/teste";
	
	
	/*public static Image loadImage(Class<?> clazz, String path) {
		Bundle bundle = FrameworkUtil.getBundle(clazz);
		URL url = FileLocator.find(bundle, 
		  new Path(path), null);
		ImageDescriptor imageDescr = ImageDescriptor.createFromURL(url);
		return imageDescr.createImage(); 
	}*/
	/*static public class MyFilter implements FileFilter
	{
	     public boolean accepts(File pathname)
	     {
	          if (pathname.endswith(".txt") || pathname.endswith(".TXT"))
	          {
	               return true;
	          }
	          return false;
	     }
	}*/
	
	public static File[] getFiles(String [] extensions) {
		return null;
		
	}
	
	
	public static String getExtension(File f) {
	    String ext = null;
	    String s = f.getName();
	    int i = s.lastIndexOf('.');

	    if (i > 0 &&  i < s.length() - 1) {
	        ext = s.substring(i+1).toLowerCase();
	    }
	    return ext;
	}
	
	public static Boolean fileExists(String path) {
		
		File f = new File(path);
		return f.exists();
	}
	
	public static Boolean createDir(String dir) {
		try {
			new File("/path/to/folder").mkdirs();
			return true;
		}
		catch (Exception ex) {
			return false;
		}
	}
	
	public static String getWorkspace() {
		return WORKSPACE;
	}
	
	public static void setWorkspace(String workspace) {
		WORKSPACE = workspace;
	}
	
	public static void deleteDirectoryFromWorkSpace(String name) {
		deleteDirectory(WORKSPACE  + name );
	}
	
	public static void deleteDirectory(String path) {
		File dir = new File(path);
		File[] currList;
		Stack<File> stack = new Stack<File>();
		stack.push(dir);
		while (! stack.isEmpty()) {
		    if (stack.lastElement().isDirectory()) {
		        currList = stack.lastElement().listFiles();
		        if (currList.length > 0) {
		            for (File curr: currList) {
		                stack.push(curr);
		            }
		        } else {
		            stack.pop().delete();
		        }
		    } else {
		        stack.pop().delete();
		    }
		}
	}
	
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
