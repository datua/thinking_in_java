package com.wzj.thinkinginjava.typeinfo;

import java.util.Random;

class Initable1 {
	static final int staticFinal1 = 47;
	static final int staticFinal2 = ClassInitialization.random.nextInt(100);
	static {
		System.out.println("initializing Initable1");
	}
}

class Initable2 {
	static int staticNonFinal = 56;
	static {
		System.out.println("initializing Initable2");
	}
}
class Initable3 {
	static int staticNonFinal = 78;
	static {
		System.out.println("initializing Initable3");
	}
}

public class ClassInitialization {
	public static Random random = new Random(47);
	public static void main(String[] args) throws ClassNotFoundException {
		Class initalbe1 = Initable1.class;
		System.out.println("After creating initable1 ref");
		System.out.println(Initable1.staticFinal1);
		System.out.println(Initable1.staticFinal2);
		
		System.out.println(Initable2.staticNonFinal);

		Class initable3 = Class.forName("com.wzj.thinkinginjava.typeinfo.Initable3");
		System.out.println("After creating Initable3 ref");
		System.out.println(Initable3.staticNonFinal);
	}
}
