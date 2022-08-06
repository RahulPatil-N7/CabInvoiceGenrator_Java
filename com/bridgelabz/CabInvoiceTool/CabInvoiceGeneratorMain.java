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

	public static void main(String[] args) {
		System.out.println("************** Welcome To Cab Invoice Generator. *************\n");

		CabInvoiceGeneratorMain cabInvoice = new CabInvoiceGeneratorMain();
		double result = cabInvoice.calculateFare(3.5, 30);
		System.out.println("Total Fare :" + result + " Rs.");
	}
}
