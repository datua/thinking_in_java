package com.wzj.thinkinginjava.generics;

public class GenericMethods9 {
	public <A, B, C> void f(A a, B b, C c) {
		System.out.println(a.getClass().getSimpleName() + " "
				+ b.getClass().getSimpleName() + " "
				+ c.getClass().getSimpleName());
	}
	public static void main(String[] args) {
		GenericMethods9 genericMethods = new GenericMethods9();
		genericMethods.f(1.0d, 1.0f, GenericMethods.class);
	}
}
