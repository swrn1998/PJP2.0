package com.assignment.week2;

import java.util.Scanner;

public class ShowMenu {

	public static int menu() {
		System.out.println("********_____________________***********");
		System.out.println("DATE-TIME CALCULTOR OPERATION OPTIONS");
		System.out.println("********_____________________***********\n");
		
		System.out.println("1.Get difference on two dates");
		System.out.println("2.Get day of week of inputted date");
		System.out.println("3.Get week number of inputted date");
		System.out.println("4.Conversion of natural language into date");
		
		System.out.print("\n\nEnter your option:");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		/* sc.close();
		Closing sc here arising NoSuchElementException in DateController class
		*/ 
		return option;
	}
}
