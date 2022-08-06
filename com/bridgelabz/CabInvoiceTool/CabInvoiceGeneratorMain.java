package com.bridgelabz.CabInvoiceTool;

public class CabInvoiceGeneratorMain {
	public final double COST_PER_KM = 10.0;
	public final int COST_PER_MIN = 1;
	private final double MIN_FARE = 5.0;

	/*
	 * This method calculates & returns total fare.
	 */
	public double calculateFare(double distance, int time) {
		double totalFare = distance * COST_PER_KM + time * COST_PER_MIN;
		return Math.max(totalFare, MIN_FARE);
	}

	/*
	 * This method calculates & returns total fare of multiple rides.
	 */
	public double calculateFare(Ride[] ride) {
		double totalFare = 0;
		for (Ride rides : ride) {
			totalFare += this.calculateFare(rides.distance, rides.time);
		}
		return totalFare;
	}

	public static void main(String[] args) {
		System.out.println("************** Welcome To Cab Invoice Generator. *************\n");

		CabInvoiceGeneratorMain cabInvoice = new CabInvoiceGeneratorMain();

		Ride[] ride = { new Ride(3.5, 30), new Ride(2.0, 15), new Ride(3.0, 25) };
		double result = cabInvoice.calculateFare(ride);
		System.out.println("Rides Taken ---> ");
		for (Ride rides : ride) {
			System.out.println("Distance :" + rides.distance + " Km \t Time :" + rides.time + " Min.");
		}
		CabInvoiceSummary invoiceSummary = new CabInvoiceSummary(ride.length, result);
		invoiceSummary.invoiceSummary();
	}
}
