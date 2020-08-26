package com.assignment.week2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class DateTimeController {

	public static void start() {

		int option = ShowMenu.menu();
		System.out.println("Input Dates in dd-MM-yyyy format");

		switch (option) {
		case 1:
			String date1 = DateTimeController.inputFunction(1);
			DateInput dt1 = new DateInput(date1);
			String date2 = DateTimeController.inputFunction(2);
			DateInput dt2 = new DateInput(date2);

			ArrayList<Integer> result = OperationOnDates.getDifference(dt1, dt2);
			DisplayDate.datesDifferenceResultDisplay(result);
			break;

		case 2:
			String date = DateTimeController.inputFunction(1);
			Calendar cal = Calendar.getInstance();
			cal.setTime(DateFormatter.stringToDateConversion(date));
			System.out.println(cal.get(Calendar.DAY_OF_WEEK));
			break;

		case 3:
			String date3 = DateTimeController.inputFunction(1);
			DateInput dt3 = new DateInput(date3);
			Calendar cal3 = Calendar.getInstance();
			cal3.set(dt3.getYear(), dt3.getMonth(), dt3.getDay());
			System.out.println(cal3.get(Calendar.WEEK_OF_YEAR));
			break;

		case 4:
			// System.out.print("Enter tomorrow, yesterday etc. :");
			// Not Implementing all methods of NaturalLanguageTranslation class for now
			NaturalLanguageTranslation.today();
			NaturalLanguageTranslation.tomorrow();
			NaturalLanguageTranslation.dayAfterTomorrow();
			NaturalLanguageTranslation.yesterday();
			break;

		default:
			System.out.println("Enter valid option!");
		}
	}

	public static String inputFunction(int n) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String format = "dd-MM-yyyy";
		String d = null;
		boolean loop = true;
		while (loop) {
			System.out.println("Enter date " + n + ":");
			String date = sc.next();
			sc.nextLine();
			if (DateValidity.isValidFormat(format, date)) {
				d = date;
				loop = false;
			}
		}
		// sc.close();
		return d;
	}
}
