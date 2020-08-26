package com.assignment.week2;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DateInput implements Serializable{

	int day, month, year;

	public DateInput(String inputDate) {
		String []date = inputDate.split("-");
		this.day = Integer.parseInt(date[0]);
		this.month = Integer.parseInt(date[1]);
		this.year = Integer.parseInt(date[2]);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return this.day+"-"+this.month+"-"+this.year;
	}
	
	
}
