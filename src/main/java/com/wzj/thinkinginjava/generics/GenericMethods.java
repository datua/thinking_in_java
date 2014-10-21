package com.wzj.thinkinginjava.generics;

public class GenericMethods {
	public<T> void f(T type) {
		System.out.println(type.getClass().getSimpleName());
	}
	public static void main(String[] args) {
		GenericMethods genericMethod = new GenericMethods();
		genericMethod.f("");
		genericMethod.f(1);
		genericMethod.f(1.0);
		genericMethod.f(1.0f);
		genericMethod.f(genericMethod);
	}

}
