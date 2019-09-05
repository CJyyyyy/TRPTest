package com.travelsky.test;

import java.math.BigDecimal;

public class TotalFare {

	public static void main(String[] args) {
		String priceString = "378USD";
		BigDecimal price = new BigDecimal(priceString.split("USD")[0]);
		String taxString = "161.53USD";
		BigDecimal tax = new BigDecimal(taxString.split("USD")[0]);
		BigDecimal total = price.add(tax).multiply(new BigDecimal(3));
		String totalString = "<TotalFare Amount=\"" + total
				+ "\" CurrencyCode=\"USD\"/>";
		System.out.println(totalString);
		total = total.multiply(new BigDecimal("6.7")).setScale(1, BigDecimal.ROUND_HALF_UP);;
		totalString = "<TotalFare Amount=\"" + total
				+ "\" CurrencyCode=\"CNY\"/>";
		System.out.println(totalString);
		
	}
}
