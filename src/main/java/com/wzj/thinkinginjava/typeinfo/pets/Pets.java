package com.wzj.thinkinginjava.typeinfo.pets;

import java.util.ArrayList;

public class Pets {
	public static final PetCreator creator = new LiteralPetCreator();
	public Pet randomPet() {
		return creator.randomPet();
	}
	public static ArrayList<Pet> createList(int size) {
		return creator.createList(size);
	}
	public static Pet[] createArray(int size) {
		return creator.createArray(size);
	}
}
