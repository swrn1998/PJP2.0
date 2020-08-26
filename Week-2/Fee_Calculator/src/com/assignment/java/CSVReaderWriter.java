package com.assignment.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.assignment.java.interfaces.File_Reader_Writer;

public class CSVReaderWriter implements File_Reader_Writer {

	@Override
	public ArrayList<Transaction> read(String filePath) {
		String line = "";

		ArrayList<Transaction> transaction = new ArrayList<>();
		BufferedReader br;

		try {
			br = new BufferedReader(new FileReader(filePath));
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				// System.out.println(data[0]);
				TransactionType t1 = TransactionType.valueOf(data[3]);
				transaction.add(
						new Transaction(data[0], data[1], data[2], t1, data[4], Double.parseDouble(data[5]), data[6]));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} // TODO Auto-generated method stub
		return transaction;
	}

	@Override
	public void write(String data) {
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
