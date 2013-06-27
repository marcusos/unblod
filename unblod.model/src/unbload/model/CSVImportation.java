package unbload.model;

import java.util.ArrayList;

public class CSVImportation {

	private String name = "";
	private String className = "";
	private String file = "";
	private int headerLines = 0;
	
	private String uriSourceCol = "";
	private String transformation = "";
	private String customUri = "";		
	private String uri = "";		
	
	private ArrayList<CSVProperty> properties = new ArrayList<CSVProperty>();
	
	public CSVImportation(String name, String className, String file,
			int headerLines, String uriSourceCol, String transformation,
			String customUri, String uri) {
		super();
		this.name = name;
		this.className = className;
		this.file = file;
		this.headerLines = headerLines;
		this.uriSourceCol = uriSourceCol;
		this.transformation = transformation;
		this.customUri = customUri;
		this.uri = uri;
	}
	
	public CSVImportation() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public int getHeaderLines() {
		return headerLines;
	}

	public void setHeaderLines(int headerLines) {
		this.headerLines = headerLines;
	}

	public String getUriSourceCol() {
		return uriSourceCol;
	}

	public void setUriSourceCol(String uriSourceCol) {
		this.uriSourceCol = uriSourceCol;
	}

	public String getTransformation() {
		return transformation;
	}

	public void setTransformation(String transformation) {
		this.transformation = transformation;
	}

	public String getCustomUri() {
		return customUri;
	}

	public void setCustomUri(String customUri) {
		this.customUri = customUri;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public ArrayList<CSVProperty> getProperty() {
		return properties;
	}

	public void setProperty(ArrayList<CSVProperty> properties) {
		this.properties = properties;
	}
	
	
	
}
