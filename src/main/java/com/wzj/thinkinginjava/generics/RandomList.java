package com.wzj.thinkinginjava.generics;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
	private ArrayList<T> list = new ArrayList<T>();
	private Random random = new Random(47);
	public void add(T item) {
		list.add(item);
	}
	public T select() {
		return list.get(random.nextInt(list.size()));
	}
	public static void main(String[] args) {
		RandomList<String> randomList = new RandomList<String>();
		for (String str : "wo ai bei jing".split(" ")) {
			randomList.add(str);
		}
		for (int i = 0; i < 11; i++) {
			System.out.println(randomList.select());
		}
	}

}
