
public class Typhoon {
	private int year;
	private int id;
	private int specific_time;
	private double lat;
	private double Long;
	private double prs;
	private double wnd;
	private int month;
	
	
	public Typhoon(int year, int id, int specific_time, double lat, double l, double prs, double wnd, int month) {
		super();
		this.year = year;
		this.id = id;
		this.specific_time = specific_time;
		this.lat = lat;
		Long = l;
		this.prs = prs;
		this.wnd = wnd;
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSpecific_time() {
		return specific_time;
	}
	public void setSpecific_time(int specific_time) {
		this.specific_time = specific_time;
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
		return prs;
	}
	public void setPrs(double prs) {
		this.prs = prs;
	}
	public double getWnd() {
		return wnd;
	}
	public void setWnd(double wnd) {
		this.wnd = wnd;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}

	

}
