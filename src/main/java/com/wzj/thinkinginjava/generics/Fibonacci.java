package com.wzj.thinkinginjava.generics;

import com.wzj.thinkinginjava.utils.Generator;

public class Fibonacci implements Generator<Integer> {
	private static int fibonacci(int n) {
		if (n < 2) {
			return 1;
		}
		return fibonacci(n - 2) + fibonacci(n - 1);
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(fibonacci(i));
		}
	}

	public Integer next() {
		// TODO Auto-generated method stub
		return null;
	}
}
