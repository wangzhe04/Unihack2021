import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**This DataStorage class uses hashmap <String, Typhoon> to 
 * store the Typhoon information. 
 * 
 * @author Zhe Wang
 *
 */
public class DataStorage {
	
	public HashMap <String, Typhoon>dataStorage;
	
	public DataStorage() {
		dataStorage = new HashMap();
	}
	
	public void insert(String TyphoonID, Typhoon farm) {
		dataStorage.put(TyphoonID, farm);
	}
	
	public Typhoon get(String TyphoonID) {
		return (Typhoon) dataStorage.get(TyphoonID);
	}
	
	public boolean contains(String TyphoonID) {
		return dataStorage.containsKey(TyphoonID);
	}
	
	public boolean remove(String farmID) {
		if(contains(farmID)) {
			dataStorage.remove(farmID);
			return true;
		}else {
			return false;
		}
	}

}
