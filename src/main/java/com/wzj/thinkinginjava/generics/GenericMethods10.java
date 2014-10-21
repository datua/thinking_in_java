package com.wzj.thinkinginjava.generics;

public class GenericMethods10 {
	public <A, B> void f(A a, B b, int c) {
		System.out.println(a.getClass().getSimpleName() + " " + b.getClass().getSimpleName() + " " + c);
	}
	public static void main(String[] args) {
		GenericMethods10 genericMethods = new GenericMethods10();
		genericMethods.f("wuwu", Integer.class, 55);
	}

}
