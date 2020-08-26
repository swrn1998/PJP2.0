package com.assignment.java;

public class MainRunner {

	//Making output file constant
	public static final String OUTPUT_FILE = "E:\\PJP2.0\\ABC_agency\\Sample_output.csv";

	public static void main(String[] args) {

		String inputFile = "E:\\PJP2.0\\ABC_agency\\Sample_Input.csv";
		DataContoller.start(inputFile);
		System.out.println("Operation is successful");
	}

}
