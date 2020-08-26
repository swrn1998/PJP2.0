package com.assignment.java;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.assignment.java.interfaces.File_Reader_Writer;

public class DataContoller {

	public static void start(String file) {
		File_Reader_Writer csv = new CSVReaderWriter();
		ArrayList<Transaction> transaction = csv.read(file);

		/*
		 * for(Transaction temp :transaction) {
		 * System.out.println(temp.getTransactionId()+" "+temp.getClientId()+" "+temp.
		 * getSecurityId()+" "+temp.gettType()+" "+
		 * temp.getDate()+" "+temp.getMarketValue()+" "+temp.getPriorityFlag()); }
		 */

		// Creating ArrayList for differentiating between normal and Intra-day
		// transaction
		Map<String, TransactionType> tranType = new HashMap<>();

		// Creating a TreeMap for Summary Report and sorting it by keys
		Map<String, Double> summaryReport = new TreeMap<>();

		Double processingFee;

		for (Transaction t : transaction) {
			processingFee = (double) 0;
			// For summaryReport
			String key = t.getClientId() + "," + t.gettType() + "," + t.getDate() + "," + t.getPriorityFlag();

			// For tranType Map
			String element = t.getClientId() + "," + t.getSecurityId() + "," + t.getDate();
			TransactionType xType = tranType.get(element);

			if (xType != null) {
				if (DataContoller.conditionCheck(xType, t.gettType())) {
					processingFee += 10;
					String[] temp = element.split(",");
					// Changing values of already stored intraday transactions i.e buy or sell
					// transaction is already updated
					String key1 = temp[0] + "," + xType.toString() + "," + temp[2] + "," + "Y";
					String key2 = temp[0] + "," + xType.toString() + "," + temp[2] + "," + "N";

					if (summaryReport.get(key1) != null) {
						summaryReport.put(key1, summaryReport.get(key1) + 10);
					} else if (summaryReport.get(key2) != null) {
						summaryReport.put(key2, summaryReport.get(key2) + 10);
					}
				}
			} else {
				tranType.put(element, t.gettType());
			}

			processingFee += DataContoller.normalTransaction(t.gettType(), t.getPriorityFlag());
			summaryReport.putIfAbsent(key, processingFee);
		}

		// For deleting existing output file
		File f = new File(MainRunner.OUTPUT_FILE);
		if (f.exists()) {
			f.delete();
		}

		System.out.println("Client ID  Transaction Type  Transaction Date\t      Priority       Processing Fee");
		// Copying the SummaryReport to file and printing the values to the console
		for (Entry<String, Double> ee : summaryReport.entrySet()) {
			String ab = ee.getKey();
			Double value = ee.getValue();
			String[] info = ab.split(",");
			System.out.println(info[0] + "\t\t" + info[1] + "\t\t" + info[2] + "\t\t" + info[3] + "\t\t" + value);
			csv.write(ab + "," + Double.toString(value)+"\n");
		}
	}

	public static boolean conditionCheck(TransactionType xType1, TransactionType xType2) {
		// Inserted transaction data might not be sorted
		if ((xType1 == TransactionType.BUY && xType2 == TransactionType.SELL)
				|| (xType2 == TransactionType.BUY && xType1 == TransactionType.SELL)) {
			return true;
		}
		return false;
	}

	public static Double normalTransaction(TransactionType tType, String flag) {
		Double x = (double) 0;
		TransactionType sell = TransactionType.SELL;
		TransactionType buy = TransactionType.BUY;
		TransactionType withdrawn = TransactionType.WITHDRAWN;
		TransactionType deposit = TransactionType.DEPOSIT;

		if (flag.equals("Y")) {
			x = (double) 500;
		} else {
			if (sell.equals(tType) || withdrawn.equals(tType)) {
				x = (double) 100;
			} else if (buy.equals(tType) || deposit.equals(tType)) {
				x = (double) 50;
			}
		}
		return x;
	}
}
