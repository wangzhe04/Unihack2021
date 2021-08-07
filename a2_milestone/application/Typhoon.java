/**
 * This file contains the Farm class to run the program
 */
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Creates objects to build a Farm
 * @author huangyibin
 *
 */
public class Typhoon {
	public String id = "";
	public int year = 0;
	public int month = 0;
	public double lat = 0;
	public double Long = 0;
	public double Prs = 0;
	public double Wnd = 0;
	
	

	public Typhoon(String id, int year, int month, double lat, double Long, double Prs,
			double Wnd) {
		// TODO Auto-generated constructor stub
		this.year = year;
		this.lat = lat;
		this.month = month;
		this.Long = Long;
		this.Prs = Prs;
		this.Wnd = Wnd;
	}
	
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public double getLat() {
		return lat;
	}
	
	public void setLat(double lat) {
		this.lat = lat;
	}
	
	public double getLong() {
		return Long;
	}
	
	public void setLong(double l) {
		Long = l;
	}
	
	public double getPrs() {
		return Prs;
	}
	
	public void setPrs(double prs) {
		this.Prs = prs;
	}
	
	public double getWnd() {
		return Wnd;
	}
	
	public void setWnd(double wnd) {
		this.Wnd = wnd;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	
	
	
	
	
	
	

}
