package com.assignment.week2;

public class NaturalLanguageTranslation {

	public static void today() {
		System.out.println("Today is : " + OperationOnDates.operationOnDay(0));
	}

	public static void tomorrow() {
		System.out.println("Tomorrow is : " + OperationOnDates.operationOnDay(1));
	}

	public static void dayAfterTomorrow() {
		System.out.println("Day after tomorrow is:" + OperationOnDates.operationOnDay(2));
	}

	public static void yesterday() {
		System.out.println("Yesterday was :" + OperationOnDates.operationOnDay(-1));
	}

	public static void dayBeforeYesterday() {
		System.out.println("Day before yesterday was:" + OperationOnDates.operationOnDay(-2));
	}

	public static void lastWeek() {
		System.out.println("Last week :" + OperationOnDates.operationOnWeek(-1));
	}

	public static void nextWeek() {
		System.out.println("Last week :" + OperationOnDates.operationOnWeek(1));
	}

	public static void nextMonth() {
		System.out.println("Next month :" + OperationOnDates.operationOnMonth(1));
	}

	public static void nextYear() {
		System.out.println("Next year :" + OperationOnDates.operationOnYear(1));
	}

	public static void lastMonth() {
		System.out.println("Last month :" + OperationOnDates.operationOnMonth(-1));
	}

	public static void lastYear() {
		System.out.println("Last year :" + OperationOnDates.operationOnYear(-1));
	}

	public static void nMonthsAfter(int n) {
		System.out.println(n + " months after :" + OperationOnDates.operationOnMonth(n));
	}

	public static void nMonthsBefore(int n) {
		System.out.println(n + " months before :" + OperationOnDates.operationOnMonth(-n));
	}

	public static void nWeeksFromNow(int n) {
		System.out.println(n + " weeks from now :" + OperationOnDates.operationOnWeek(n));
	}

	public static void nDaysFromNow(int n) {
		System.out.println(n + " days from now :" + OperationOnDates.operationOnDay(n));
	}

	public static void nMonthsFromNow(int n) {
		System.out.println(n + " months from now :" + OperationOnDates.operationOnMonth(n));
	}

	public static void nYearsFromNow(int n) {
		System.out.println(n + " years from now :" + OperationOnDates.operationOnYear(n));
	}

	public static void nDaysEarlier(int n) {
		System.out.println(n + " days earlier :" + OperationOnDates.operationOnDay(-n));
	}

	public static void nWeeksEarlier(int n) {
		System.out.println(n + " weeks earlier :" + OperationOnDates.operationOnWeek(-n));
	}

	public static void nMonthsEarlier(int n) {
		System.out.println(n + " months earlier :" + OperationOnDates.operationOnMonth(-n));
	}

	public static void nYearsEarlier(int n) {
		System.out.println(n + " years earlier :" + OperationOnDates.operationOnYear(-n));
	}

}
