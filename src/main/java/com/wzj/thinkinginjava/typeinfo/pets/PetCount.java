package com.wzj.thinkinginjava.typeinfo.pets;

import java.util.HashMap;

public class PetCount {
	static class PetCounter extends HashMap<String, Integer> {
		public void count(String type) {
			Integer quantity = get(type);
			if (quantity == null) {
				put(type, 1);
			} else {
				put(type, quantity + 1);
			}
		}
	}
	public static void countPets(PetCreator creator) {
		PetCounter counter = new PetCounter();
		for (Pet pet : creator.createList(40)) {
			System.out.println(pet.getClass().getSimpleName());
			if (pet instanceof Pet) {
				counter.count("pet");
			}
			if (pet instanceof Dog) {
				counter.count("dog");
			}
			if (pet instanceof Mutt) {
				counter.count("mutt");
			}
			if (pet instanceof Pug) {
				counter.count("pug");
			}
		}
		System.out.println(counter);
	}
	public static void main(String[] args) {
		countPets(new ForNameCreator());
	}
}