package unbload.model;

import java.util.List;

public interface IDatasetModel {

	List<Dataset> getDatasets();
	
	boolean saveDataset(Dataset Dataset);
	
	//Dataset getDataset(long id);
	Dataset getDataset(String name); 
	
	boolean deleteDataset(String name);

	void addDataset(Dataset Dataset);
}
