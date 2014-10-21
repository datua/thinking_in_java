package com.wzj.thinkinginjava.charpter12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
	private BufferedReader bufferedReader;

	public InputFile(String fileName) throws Exception {
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("File " + fileName + " not exist.");
			throw e;
		} catch (Exception e) {
			try {
				bufferedReader.close();
				System.out.println("File " + fileName + " closed.");
			} catch (IOException e1) {
				System.out.println("File " + fileName + " not closed.");
			}
			throw e;
		} finally {

		}
	}
	public String getLine() {
		String lineStr = null;
		try {
			lineStr = bufferedReader.readLine();
		} catch (IOException e) {
			throw new RuntimeException("getLine() failed.");
		}
		return lineStr;
	}
	
	public void dispose() {
		try {
			bufferedReader.close();
			System.out.println("File is closed.");
		} catch (IOException e) {
			throw new RuntimeException("dispose() failed.");
		}
	}
}
