package com.wzj.thinkinginjava.generics;

public class TwoTuple<A, B> {
	public final A first;
	public final B second;
	public TwoTuple(A first, B second) {
		this.first = first;
		this.second = second;
	}
	public String toString() {
		return first.toString() + ", " + second.toString();
	}
}
