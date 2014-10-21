package com.wzj.thinkinginjava.charpter13;

import java.util.Random;

public class UsingStringBuilder {
	private static Random random = new Random(47);
	public String toString() {
		StringBuilder strBuilder = new StringBuilder("[");
		for (int i = 0; i < 25; i++) {
			strBuilder.append(random.nextInt(100));
			strBuilder.append(" ,");
		}
		
		strBuilder.delete(strBuilder.length() - 2, strBuilder.length());
		return strBuilder.append("]").toString();
	}

	public static void main(String[] args) {
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
	}
}
