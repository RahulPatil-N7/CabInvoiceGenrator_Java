package com.bridgelabz.CabInvoiceTest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.CabInvoiceTool.CabInvoiceGeneratorMain;

public class CabInvoiceTest {

	/*
	 * Test method to check if it matches correct total fare.
	 */
	@Test
	public void givenDistanceAndTime_whenCalculateFare_ShouldReturnTotalFare() {
		CabInvoiceGeneratorMain invoiceService = new CabInvoiceGeneratorMain();
		double totalFare = invoiceService.calculateFare(3.5, 30);
		System.out.println("Total Fare = " + totalFare);
		Assert.assertEquals(65.0, totalFare, 0.0);
	}

}
