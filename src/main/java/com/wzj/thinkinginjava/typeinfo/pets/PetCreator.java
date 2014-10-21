package com.wzj.thinkinginjava.typeinfo.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class PetCreator {
	private Random random = new Random(47);
	public abstract List<Class<? extends Pet>> types();
	
	public Pet randomPet() {
		int typeNum = random.nextInt(types().size());
		Pet pet = null;
		try {
			pet = types().get(typeNum).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pet;
	}
	public Pet[] createArray(int size) {
		Pet[] pets = new Pet[size];
		for (int i = 0; i < size; i++) {
			pets[i] = randomPet();
		}
		return pets;
	}
	public ArrayList<Pet> createList(int size) {
		ArrayList<Pet> petList = new ArrayList<Pet>();
		Collections.addAll(petList, createArray(size));
		return petList;
	}
}
