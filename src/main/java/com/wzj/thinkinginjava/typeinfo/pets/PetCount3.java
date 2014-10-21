package com.wzj.thinkinginjava.typeinfo.pets;

import java.util.LinkedHashMap;
import java.util.Map;

import src.net.mindview.util.MapData;

public class PetCount3 {
	static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
		public PetCounter() {
			super(MapData.map(LiteralPetCreator.allTypes, 0));
		}
		public void count(Pet pet) {
			for (Map.Entry<Class<? extends Pet>, Integer> entry : entrySet()) {
				if (entry.getKey().isInstance(pet)) {
					put(entry.getKey(), entry.getValue() + 1);
				}
			}
		}
		public String toString() {
			StringBuilder result = new StringBuilder("{");
			for (Map.Entry<Class<? extends Pet>, Integer> entry : entrySet()) {
				result.append(entry.getKey().getSimpleName());
				result.append("=" + entry.getValue());
				result.append(",");
			}
			result.delete(result.length() - 1,  result.length());
			result.append("}");
			return result.toString();
		}
	}
	public static void main(String[] args) {
		PetCounter petCount = new PetCounter();
		for (Pet pet : Pets.createList(40)) {
			petCount.count(pet);
		}
		System.out.println(petCount);
	}
}
