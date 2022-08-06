package com.bridgelabz.CabInvoiceTool;

public class CabInvoiceSummary {
	private final int numOfRides;
	private final double totalFare;
	private final double averageFare;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CabInvoiceSummary that = (CabInvoiceSummary) o;
		return numOfRides == that.numOfRides && Double.compare(that.totalFare, totalFare) == 0
				&& Double.compare(that.averageFare, averageFare) == 0;
	}

	/*
	 * parameterized constructor with parameters number of rides & total fare.
	 */
	public CabInvoiceSummary(int numOfRides, double totalFare) {
		this.numOfRides = numOfRides;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare / this.numOfRides;
	}

	/*
	 * Method to print number of rides,total fare & average fare per ride
	 */
	public void invoiceSummary() {
		System.out.println("\nNumber of Rides : " + this.numOfRides);
		System.out.println("Total fare : " + this.totalFare + " Rs.");
		System.out.println("Average Fare Per Ride : " + this.averageFare + " Rs.");
	}
}
