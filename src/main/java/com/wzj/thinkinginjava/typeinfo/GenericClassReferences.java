package com.wzj.thinkinginjava.typeinfo;

public class GenericClassReferences {
	public static void main(String[] args) {
		Class intClass = int.class;
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class;
//		genericIntClass = double.class;
		intClass = Double.class;
	}
}
