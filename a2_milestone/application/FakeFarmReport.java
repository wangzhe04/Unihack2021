package application;

/**
 * @author Yibin Huang
 * @email huang448@wisc.edu
 * @Description This file contains the FakeFarmReport class to build the table
 */

/**
 * This class contains objects to run the table
 */
public class FakeFarmReport {
	private int month = 0;
	private int milkWeight = 0;
	private double percentage = 0;
	private int max = 0;
	private int min = 0;
	private double avg = 0;
	/**
	 * Constructs an FakeFarmReport object
	 */
	public FakeFarmReport() {
		
	}
	/**
	 * Constructs an FakeFarmReport object
	 * @param month
	 * @param milkWeight
	 * @param percentage
	 */
	public FakeFarmReport(int month, int milkWeight, double percentage, int max, int min, double avg) {
		this.month = month;
		this.milkWeight = milkWeight;
		this.percentage = percentage;
		this.max = max;
		this.min = min;
		this.avg = avg;
	}
	/**
	 * return the month
	 */
	public int getMonth() {
        return month;
    }
	/**
	 * set the month
	 */
    public void setMonth(int month) {
        this.month = month;
    }
    public int getMax() {
		return max;
	}
	public int getMin() {
		return min;
	}
	public double getAvg() {
		return avg;
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
	 * return the percentage of milk weight to the total production
	 */
    public double getPercentage() {
        return percentage;
    }
    /**
	 * set the percentage of milk weight to the total production
	 */
    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
