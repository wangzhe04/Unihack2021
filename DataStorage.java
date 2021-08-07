/**
 * this File contains the DataStorage class to run the program
 */
package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.List;

public class DataStorage {
	
	public HashMap <String, Typhoon>dataStorage;
	
	public DataStorage() {
		dataStorage = new HashMap();
	}
	
	public void insert(String TyphoonID, Typhoon ty) {
		dataStorage.put(TyphoonID, ty);
	}
	
	public Typhoon get(String TyphoonID) {
		return (Typhoon) dataStorage.get(TyphoonID);
	}
	
	public boolean contains(String TyphoonID) {
		return dataStorage.containsKey(TyphoonID);
	}
	
	public ArrayList<String> getID(double slat, double elat, double slong, double elong, int year) {
		
		ArrayList<String> IDs = new ArrayList<String>();
		
		for(Entry<String, Typhoon> entry : dataStorage.entrySet()) {
			if(entry.getValue().getYear() == year && entry.getValue().getLat() <= elat &&
					entry.getValue().getLat() >= slat && entry.getValue().getLong() >= slong
					&& entry.getValue().getLong() <= elong) {
				
				IDs.add(entry.getKey());
			}
		}
		
		return IDs;
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
