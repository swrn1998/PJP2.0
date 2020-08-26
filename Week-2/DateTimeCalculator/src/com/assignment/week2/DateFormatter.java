package com.assignment.week2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
	public static String formatter(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String date = sdf.format(d);
		return date;
	}
	
	public static Date stringToDateConversion(String s) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		Date d = null;
		try {
			d = sdf.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
}
