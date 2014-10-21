package com.wzj.thinkinginjava.generics.coffee;

import java.util.Iterator;
import java.util.Random;

import com.wzj.thinkinginjava.utils.Generator;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
	private Class[] types = {Americano.class, Breve.class, Cappuccino.class, Latte.class, Mocha.class};
	private int size = 0;
	private Random random = new Random(47);
	public CoffeeGenerator() {
		
	}
	public CoffeeGenerator(int size) {
		this.size = size;
	}

	public Coffee next() {
		Coffee result = null;
		try {
			result = (Coffee)types[random.nextInt(types.length)].newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	class CoffeeIterator implements Iterator<Coffee> {
		int count = size;
		public boolean hasNext() {
			return count > 0;
		}

		public Coffee next() {
			count--;
			return CoffeeGenerator.this.next();
		}
	}

	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}
	
	public static void main(String[] args) {
		CoffeeGenerator coffeeGenerator = new CoffeeGenerator(30);
		for (Coffee coffee : coffeeGenerator) {
			System.out.println(coffee.toString());
		}
	}

}
