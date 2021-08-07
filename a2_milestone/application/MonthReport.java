package application;
/**
 * @author Yibin Huang
 * @email huang448@wisc.edu
 * @Description This file contains the MonthReport class to build the table
 */

/**
 * This class contains objects to run the table
 */
public class MonthReport {
	
	private String id = null;
	private int milkWeight = 0;
	private double percentage = 0;
	
	/**
	 * Constructs an MonthReport object
	 * @param farmID
	 * @param milkWeight
	 * @param percentage
	 */
	public MonthReport(String id, int milkWeight, double percentage) {
		this.id = id;
		this.milkWeight = milkWeight;
		this.percentage = percentage;
	}
	/**
	 * return the farm id
	 */
	public String getId() {
        return id;
    }
    /**
	 * return the milk weight production
	 */
    public int getMilkWeight() {
        return milkWeight;
    }
    /**
	 * set the milk weight production
	 */
    public void setMilkWeight(int milkWeight) {
        this.milkWeight = milkWeight;
    }
    /**
	 * return the milk weight percentage to the total production
	 */
    public double getPercentage() {
        return percentage;
    }
    /**
   	 * set the milk weight percentage to the total production
   	 */
    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
   
}