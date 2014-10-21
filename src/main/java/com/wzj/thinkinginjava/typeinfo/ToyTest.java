package com.wzj.thinkinginjava.typeinfo;

interface HasBatteries {};
interface WaterProof {};
interface Shoots {};

class Toy {
	Toy() {};
	Toy(int i) {};
}

class FancyToy extends Toy implements HasBatteries, WaterProof, Shoots {
	FancyToy() {
		super(1);
	}
}
public class ToyTest {
	public static void printTypeInfo(Class c) {
		System.out.println("Class name: " + c.getName() + ", is Interface? " + c.isInterface());
		System.out.println("Simple name: " + c.getSimpleName());
		System.out.println("Cannonical name: " + c.getCanonicalName());
	}
	
	public static void main(String[] args) {
		Class cc = null;
		try {
			cc = Class.forName("com.wzj.thinkinginjava.typeinfo.FancyToy");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printTypeInfo(cc);
		
		for (Class c : cc.getInterfaces()) {
			printTypeInfo(c);
		}
		
		Object object = null;
		Class toy = cc.getSuperclass();
		
		try {
			object = toy.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		printTypeInfo(toy);
		printTypeInfo(object.getClass());
	}
}
