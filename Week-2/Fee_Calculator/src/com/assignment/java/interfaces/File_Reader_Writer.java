package com.assignment.java.interfaces;

import java.util.ArrayList;

import com.assignment.java.Transaction;

//This interface will help in reading and writing in other kinds of file
public interface File_Reader_Writer {

	ArrayList<Transaction> read(String filePath);

	void write(String data);
}
