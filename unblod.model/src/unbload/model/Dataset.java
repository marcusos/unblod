package unbload.model;

public class Dataset {

	private long id;


	private String name = "";
	private String uri = "";	
	private String description = "";
	private String namespace = "";
	
	
	public Dataset(long id, String name, String uri, String description,
			String namespace) {
		super();
		this.id = id;
		this.name = name;
		this.uri = uri;
		this.description = description;
		this.namespace = namespace;
	}
	
	public Dataset(String name, String uri, String description,
			String namespace) {
		super();
		this.name = name;
		this.uri = uri;
		this.description = description;
		this.namespace = namespace;
	}
	
	
	public Dataset copy() {
		return new Dataset(this.id, this.name, this.uri, this.description, this.namespace);
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNamespace() {
		return namespace;
	}
	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Dataset other = (Dataset) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
