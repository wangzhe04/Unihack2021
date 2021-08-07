
///////////////////////File Header///////////////////////////
//Author: Zhe Wang
//Email: zwang2428@wisc.edu
//Term: Summer2020
////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * This class read in and add file into the dataStorage
 * @author Zhe Wang
 *
 */
public class FileManager {
	DataStorage a;
	public FileManager(File file, DataStorage a) throws IOException{
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader(file));
		int end = 0;
		int a2 = 0;
		while(end!=2){
			try {

				if((line = br.readLine()).equals("")) {
					end+=1;
					continue;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(9999);
			}
			end = 0;
			
			String[] array = line.split(",");
			
			String year = array[0].substring(0, 4);
			//System.out.println(a2);
			
			a2+=1;

			String id = array[0];
			String specific_time = array[0].substring(6, array[0].length());
			String month = array[0].substring(6, 8);
			String lat = array[1];
			String Long = array[2];
			String Prs = array[3];
			String Wnd = array[4];
			
			System.out.println(year);
			
			Typhoon t = new Typhoon(id,year, 
					Integer.parseInt(month), Double.parseDouble(lat),
					Double.parseDouble(Long), Double.parseDouble(Prs),Double.parseDouble(Wnd));
			a.insert(id, t);
			
			if(a2 == 14997) {
				break;
			}
			

		}
		System.out.println(10086);
	}


}