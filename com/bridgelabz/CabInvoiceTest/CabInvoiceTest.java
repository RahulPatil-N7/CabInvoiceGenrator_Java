package com.bridgelabz.CabInvoiceTest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.CabInvoiceTool.CabInvoiceGeneratorMain;
import com.bridgelabz.CabInvoiceTool.Ride;

public class CabInvoiceTest {

	/*
	 * Test method to check if it matches correct total fare.
	 */
	@Test
	public void givenDistanceAndTime_whenCalculateFare_ShouldReturnTotalFare() {
		CabInvoiceGeneratorMain invoiceService = new CabInvoiceGeneratorMain();
		double totalFare = invoiceService.calculateFare(3.5, 30);
		Assert.assertEquals(65.0, totalFare, 0.0);
	}

	/*
	 * Test method to check if it matches correct total fare when total fare is less
	 * than 5.
	 */
	@Test
	public void givenLessDistanceOrTime_shouldReturnTotalFare() {
		CabInvoiceGeneratorMain invoiceService = new CabInvoiceGeneratorMain();
		double distance = 0.1;
		int time = 1;
		double fare = invoiceService.calculateFare(distance, time);
		Assert.assertEquals(5.0, fare, 0.0);
	}

	/*
	 * Test method to check if it matches correct total fare of multiple rides.
	 */
	@Test
	public void givenMultipleRides_shouldReturnTotalFare() {
		CabInvoiceGeneratorMain invoiceService = new CabInvoiceGeneratorMain();
		Ride[] ride = { new Ride(3.5, 30), new Ride(2.0, 15), new Ride(3.0, 25) };
		double totalFare = invoiceService.calculateFare(ride);
		Assert.assertEquals(155.0, totalFare, 0.0);
	}

}
