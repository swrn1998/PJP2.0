package com.assignment.java;

import java.text.DecimalFormat;

public class Calculation {

	public static String currencyConversionInUS(double avg, String currency) {
		if(currency.equals("GBP"))
			return new DecimalFormat("$#.000").format(avg/0.67);
		else if(currency.equals("INR"))
			return new DecimalFormat("$#.00").format(avg/66.0);
		else if(currency.equals("SGD"))
			return new DecimalFormat("$#.00").format(avg/1.5);
		else if(currency.equals("HKD"))
			return new DecimalFormat("$#.00").format(avg/8.0);
		
		return null;
	}
}
