package com.assignment.week2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class OperationOnDates {

	public static ArrayList<Integer> getDifference(DateInput d1, DateInput d2) {
		int year;
		int month;
		int day = d2.getDay() - d1.getDay();

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, d2.getYear());
		if (day < 0) {
			// if the days become negative, we'll decrement a month to
			// bring them back positive.
			d2.setMonth(d2.getMonth() - 1);
			cal.set(Calendar.MONTH, d2.getMonth() - 1);
			day += cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		}
		month = d2.getMonth() - d1.getMonth();
		if (month < 0) {
			// If the months went negative, we need to convert a year into months to make
			// them positive again.
			month += 12;
			d2.setYear(d2.getYear() - 1);
		}
		year = d2.getYear() - d1.getYear();

		ArrayList<Integer> arrList = new ArrayList<>(3);
		arrList.add(day);
		arrList.add(month);
		arrList.add(year);
		return arrList;
	}
	
	public static String operationOnDay(int n) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, n);
		Date d = cal.getTime();
		return DateFormatter.formatter(d);
	}
	
	public static String operationOnWeek(int n) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.WEEK_OF_MONTH, n);
		Date d = cal.getTime();
		return DateFormatter.formatter(d);
	}
	
	public static String operationOnMonth(int n) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, n);
		Date d = cal.getTime();
		return DateFormatter.formatter(d);
	}
	
	public static String operationOnYear(int n) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, n);
		Date d = cal.getTime();
		return DateFormatter.formatter(d);
	}
}
