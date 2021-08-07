/**
 * this File contains the DataStorage class to run the program
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class DataStorage {
	
	public HashMap <String, Typhoon>dataStorage;
	private int size;
	
	private int totalPrs = 0;
	private int totalWnd = 0;
	private int count = 0;
	
	public DataStorage() {
		dataStorage = new HashMap();
	}
	
	public void insert(String TyphoonID, Typhoon ty) {
		dataStorage.put(TyphoonID, ty);
		++size;
	}
	
	public Typhoon get(String TyphoonID) {
		return (Typhoon) dataStorage.get(TyphoonID);
	}
	
	public boolean contains(String TyphoonID) {
		return dataStorage.containsKey(TyphoonID);
	}
	
	public ArrayList<String> getID(double slat, double elat, double slong, double elong, String year) {
		
		ArrayList<String> IDs = new ArrayList<String>();
		
		System.out.println(dataStorage.size());
		
		for(Entry<String, Typhoon> entry : dataStorage.entrySet()) {
			
			if(entry.getValue().getYear().equals(year)) {
				
				if(entry.getValue().getLat() > slat && entry.getValue().getLat()< elat) {
					if(entry.getValue().getLong() > slong && entry.getValue().getLong()< elong) {
						IDs.add(entry.getKey());
					}
				}
				

				
			}
		}
		return IDs;
	}
	
	public int predict(double slat, double elat, double slong, double elong, int month) {
		int prediction = 0;


		
		for(Entry<String, Typhoon> entry : dataStorage.entrySet()) {
			if(entry.getValue().getLat() > slat && entry.getValue().getLat()< elat) {
				if(entry.getValue().getLong() > slong && entry.getValue().getLong()< elong) {
					if(entry.getValue().getMonth() == month) {
						totalPrs += entry.getValue().getPrs();
						totalWnd += entry.getValue().getWnd();
						count+=1;
					}
					
				}
			}
		}
		prediction = count/36;
		
		return prediction;
	}
	
	public int predictPrs() {
		return totalPrs/count;
	}
	
	public int predictWnd() {
		return totalWnd/count;
	}
	
	
	public boolean remove(String farmID) {
		if(contains(farmID)) {
			dataStorage.remove(farmID);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		return dataStorage.isEmpty();
	}
	
	public int getSize() {
		return size;
	}
	
		
	

}