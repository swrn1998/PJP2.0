package com.assignment.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ReportBook {

	public static Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
	public static String[] data;

	public static void mapFormation(String line) {
		data = line.split(",");
		// key is the combination of Country, City, Gender and Currency
		String key = data[0] + "-" + data[1] + "-" + data[2] + "-" + data[3];
		map.putIfAbsent(key, new ArrayList<Integer>());
		map.get(key).add(Integer.parseInt(data[4]));
	}

	public static void reportGeneration() {
		for (Entry<String, ArrayList<Integer>> ee : map.entrySet()) {
			String key = ee.getKey();
			ArrayList<Integer> values = ee.getValue();
			int size = values.size();
			int i, sum=0;
			for (i=0; i<size; i++) {
				sum += values.get(i);
			}
			double tempAvg = ((double)sum)/size;
			String []x = key.split("-");
			String avg = Calculation.currencyConversionInUS(tempAvg, x[3]);
			
			//storing the final output in CSV file
			String finalOut = x[0]+","+x[2]+","+avg+"\n";
			CSVReaderWriter.writeCSV(finalOut);
		}
	}

	//For printing HashMap not required here, but who cares
	public static void dataDisplay() {
		for (Entry<String, ArrayList<Integer>> ee : map.entrySet()) {
			String key = ee.getKey();
			ArrayList<Integer> values = ee.getValue();
			System.out.println("Key = " + key + "\nValues = ");
			for (Integer x : values) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
}
