package com.wzj.thinkinginjava.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	private static String[] typeNames = new String[] {
		"com.wzj.thinkinginjava.typeinfo.pets.Cymric",
		"com.wzj.thinkinginjava.typeinfo.pets.Egyptianmau",
		"com.wzj.thinkinginjava.typeinfo.pets.Hamster",
		"com.wzj.thinkinginjava.typeinfo.pets.Manx",
		"com.wzj.thinkinginjava.typeinfo.pets.Mouse",
		"com.wzj.thinkinginjava.typeinfo.pets.Mutt",
		"com.wzj.thinkinginjava.typeinfo.pets.Pug",
		"com.wzj.thinkinginjava.typeinfo.pets.Rat",
	};
	@SuppressWarnings("unchecked")
	public static void load() {
		for (String typeName : typeNames) {
			try {
				types.add((Class<? extends Pet>) Class.forName(typeName));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	static {
		load();
	}
	@Override
	public List<Class<? extends Pet>> types() {
		return types;
	}

}
