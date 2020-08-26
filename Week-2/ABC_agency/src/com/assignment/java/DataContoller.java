package com.assignment.java;

import java.io.File;

public class DataContoller {

	public static void start(String file) {
		CSVReaderWriter.readCSV(file);
		//ReportBook.dataDisplay();
		
		//For deleting existing output file
		File f = new File(MainRunner.OUTPUT_FILE); 
		if (f.exists()) {
			f.delete();
		}
		ReportBook.reportGeneration();
	}

}
