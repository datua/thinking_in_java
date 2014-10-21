package com.wzj.thinkinginjava.charpter12;

public class Cleanup {
	public static void main(String[] args) {
		try {
			InputFile inputFile = new InputFile("cleanup.txt");
			try {
				while (inputFile.getLine() != null){
					// TODO
				}
			} catch (Exception e) {
				// TODO
			} finally {
				inputFile.dispose();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
