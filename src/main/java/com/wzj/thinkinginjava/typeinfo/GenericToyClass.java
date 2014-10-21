package com.wzj.thinkinginjava.typeinfo;

public class GenericToyClass {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class<FancyToy> fancyToyClass = FancyToy.class;
		FancyToy fancyToy = fancyToyClass.newInstance();
		Class<? super FancyToy> toyClass = fancyToyClass.getSuperclass();
//		Class<Toy> toyClass1 = fancyToyClass.getSuperclass();
//		Toy toy = toyClass.newInstance();
		Object obj = toyClass.newInstance();
	}
}
