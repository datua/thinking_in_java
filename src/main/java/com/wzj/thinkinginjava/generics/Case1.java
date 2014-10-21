package com.wzj.thinkinginjava.generics;

import com.wzj.thinkinginjava.typeinfo.pets.Cat;
import com.wzj.thinkinginjava.typeinfo.pets.Pet;

public class Case1 {
	public static void main(String[] args) {
		Holder3<Pet> h3 = new Holder3<Pet>(new Cat());
		System.out.println(h3.get());
	}
}
