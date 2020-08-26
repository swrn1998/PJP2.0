package com.assignment.week2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValidity {

	public static boolean isValidFormat(String format, String value) {
		Date date = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			sdf.setLenient(false);

			date = sdf.parse(value);
			if (!value.equals(sdf.format(date))) {
				date = null;
			}
		} catch (ParseException ex) {
			System.out.println("Invalid date or format, please enter valid date in specified format");
		}
		return date != null;
	}

}
