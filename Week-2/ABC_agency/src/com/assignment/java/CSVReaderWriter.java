package com.assignment.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVReaderWriter {

	public static void readCSV(String filePath) {
		String line = "";

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(filePath));
			while ((line = br.readLine()) != null) {
				// String []data = line.split(",");
				// System.out.println(data[0]);
				ReportBook.mapFormation(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void writeCSV(String data) {
		// Write Output in Sample_output.csv file
		String filename = MainRunner.OUTPUT_FILE;
		FileWriter fw = null;
		try {
			fw = new FileWriter(filename, true); // the true will append the new data
			fw.write(data);// appends the string to the file
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
