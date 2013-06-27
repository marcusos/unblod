package unbload.service;

import java.io.File;
import java.util.List;

import com.thoughtworks.xstream.persistence.FilePersistenceStrategy;
import com.thoughtworks.xstream.persistence.PersistenceStrategy;
import com.thoughtworks.xstream.persistence.XmlArrayList;

import unbload.model.Dataset;

public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DatasetModelImp datasetModelImp = new DatasetModelImp();
		Dataset dataset = new Dataset("Teste", "http://teste", "Bl‡ lorem, testando isso,", "te");
		datasetModelImp.saveDataset(dataset);
		
		// prepares the file strategy to directory /tmp
				/*File file = new File("dataset");
				System.out.println();
				
				PersistenceStrategy strategy = new FilePersistenceStrategy(new File("dataset"));
				
				// creates the list:
				XmlArrayList list = new XmlArrayList(strategy);
				
				// adds four authors
				list.add("joe walnes");
				list.add("joerg schaible");
				list.add("mauro talevi");
				list.add("guilherme silveira");*/
				
				
				
	}

}
