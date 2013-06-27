package unbload.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.persistence.FilePersistenceStrategy;
import com.thoughtworks.xstream.persistence.PersistenceStrategy;
import com.thoughtworks.xstream.persistence.XmlArrayList;

import unbload.model.*;

public class DatasetModelImp implements IDatasetModel {
	
	XmlArrayList model;
	PersistenceStrategy persistenceStrategy;
	//private static final String path = "/Users/marcusoliveira/Documents/runtime-testes/dataset";
	private static final String path =  "/Users/marcusoliveira/Desktop/teste";
	//private int current = 1;
	
	public DatasetModelImp() {
		
	  File theDir = new File(path + "/datasets");
	  
	  // if the directory does not exist, create it
	  if (!theDir.exists()) {
		System.out.println("creating directory: " + theDir.getAbsolutePath());
	    boolean result = theDir.mkdir();  
	    if (result) {    
	       System.out.println("DIR created");  
	    }
	    else {
	    	System.out.println("DIR not created");  
	    }
	  }
		
	   persistenceStrategy = new FilePersistenceStrategy(theDir);
	   model = new XmlArrayList(persistenceStrategy);
	}

	@Override
	public List<Dataset> getDatasets() {
		/*try {
			TimeUnit.SECONDS.sleep(1);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		ArrayList<Dataset> list = new ArrayList<Dataset>();
		
		for (Object obj: model) {
			Dataset dataset = (Dataset) obj; 
			list.add(dataset.copy());
		}
		
		return list;
	}
	
	@Override
	public boolean saveDataset(Dataset dataset) {
		
		/*if (this.getDataset(dataset.getName()) != null) {
			return false;
		}*/
		
		addDataset(dataset);
		return true;
		//throw new UnsupportedOperationException("Not yet supported");
		//return false;
	}

	@Override
	public Dataset getDataset(String name) {
		
		if (model == null)
			return null;
		System.out.println("Chegou aqui");
		
		if (model.size() == 0)
			return null;
		
		for (Object obj: model) {
			Dataset dataset = (Dataset)obj;
			if (dataset.getName() == name)
				return dataset.copy();
		}
		return null;
	}

	/*public Dataset getDataset(long id) {
		for (Dataset Dataset: model) {
			if (Dataset.getId() == id)
				return Dataset.copy();
		}
		return null;
	}*/

	@Override
	public boolean deleteDataset(String name) {
		//throw new UnsupportedOperationException("Not yet supported");
		for (Object obj: model) {
			Dataset dataset = (Dataset)obj;
			if (dataset.getName() == name)
			{
				model.remove(dataset);
				return true;
			}
		}
		return false;
	}
	
	/*private List<Dataset> createInitialModel() {
		ArrayList<Dataset> list = new ArrayList<Dataset>();
		list.add(createDataset("Animais", "http://animais.org", "Dataset de exemplo de animais", "an"));
		list.add(createDataset("Cidades", "http://cidades.org", "Dataset de exemplo de cidades", "ci"));
		return list;
	}*/

	//teste
	/*private Dataset createDataset(String name, String uri, String description, String namespace) {
		// Dataset Auto-generated method stub
		return new Dataset(name, uri, description, namespace);
	}*/

	@SuppressWarnings("unchecked")
	@Override
	public void addDataset(Dataset dataset) {
		// Dataset Auto-generated method stub
		//Dataset.setId(current++);
		//model.add(dataset);
		model.add(dataset);
	}

	

}
