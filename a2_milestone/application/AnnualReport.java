package application;
/**
 * @author Yibin Huang
 * @email huang448@wisc.edu
 * @Description This file contains the AnnualReport class to build the table
 */

/**
 * This class contains objects to run the table
 */
public class AnnualReport {
	
	private String farmID = null;
	private int milkWeight = 0;
	private double percentage = 0;
	
	/**
	 * Constructs an AnnualReport object
	 */
	public AnnualReport() {
		
	}
	/**
	 * Constructs an AnnualReport object
	 * @param farmID
	 * @param milkWeight
	 * @param percentage
	 */
	public AnnualReport(String farmID, int milkWeight, double percentage) {
		this.farmID = farmID;
		this.milkWeight = milkWeight;
		this.percentage = percentage;
	}
	/**
	 * return the farm id
	 */
	public String getFarmID() {
        return farmID;
    }
	/**
	 * set the farm id
	 */
    public void setFarmID(int month) {
        this.farmID = farmID;
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

