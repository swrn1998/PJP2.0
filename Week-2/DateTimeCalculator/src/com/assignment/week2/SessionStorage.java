package com.assignment.week2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SessionStorage {

	public static void write(DateInput dt1) {
		ArrayList<DateInput> arr = new ArrayList<>();
		arr = SessionStorage.read();
		arr.add(dt1);
		if (arr.size() > 100) {
			arr.remove(0);
			System.out.println("Restricting session storage to 100");
		}
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("E:\\PJP2.0\\session.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeInt(arr.size());
			for (DateInput x : arr) {
				oos.writeObject(x);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static ArrayList<DateInput> read() {
		ArrayList<DateInput> arr = new ArrayList<DateInput>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("E:\\PJP2.0\\session.ser");
			ois = new ObjectInputStream(fis);
			int data = ois.readInt();
			for (int i = 0; i < data; i++) {
				arr.add((DateInput) ois.readObject());

			}
			System.out.println("Current Session Memory");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return arr;
	}
}