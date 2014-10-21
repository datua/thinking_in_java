package com.wzj.thinkinginjava.charpter13;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
	public String toString() {
		return " InfiniteRecursion address: " + super.toString() + "\n";
	}
	
	public static void main(String[] args) {
		List<InfiniteRecursion> list = new ArrayList<InfiniteRecursion>();
		for (int i = 0; i < 10; i++) {
			list.add(new InfiniteRecursion());
		}
		System.out.println(list);
	}
}


