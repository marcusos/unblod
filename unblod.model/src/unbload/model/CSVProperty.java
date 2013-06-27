package unbload.model;

public class CSVProperty {

	private Boolean useCustomExpression = false;
	
	private String name = "";
	private String dataType = "";	
	private String sourceCol;
	private String transformation = "";
	private String customExpression;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CSVProperty other = (CSVProperty) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Boolean getUseCustomExpression() {
		return useCustomExpression;
	}

	public void setUseCustomExpression(Boolean useCustomExpression) {
		this.useCustomExpression = useCustomExpression;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getSourceCol() {
		return sourceCol;
	}

	public void setSourceCol(String sourceCol) {
		this.sourceCol = sourceCol;
	}

	public String getTransformation() {
		return transformation;
	}

	public void setTransformation(String transformation) {
		this.transformation = transformation;
	}

	public String getCustomExpression() {
		return customExpression;
	}

	public void setCustomExpression(String customExpression) {
		this.customExpression = customExpression;
	}


	public CSVProperty(String name,
			String dataType, String sourceCol, String transformation,
			String customExpression) {
		super();
		this.name = name;
		this.dataType = dataType;
		this.sourceCol = sourceCol;
		this.transformation = transformation;
		this.customExpression = customExpression;
	}
	
	public CSVProperty(Boolean useCustomExpression, String name,
			String dataType, String sourceCol, String transformation,
			String customExpression) {
		super();
		this.useCustomExpression = useCustomExpression;
		this.name = name;
		this.dataType = dataType;
		this.sourceCol = sourceCol;
		this.transformation = transformation;
		this.customExpression = customExpression;
	}
	
	
	
	/*public CSVProperty copy() {
		return new CSVProperty(this.name, this.uri, this.description, this.namespace);
	}*/
	


}
