package com.wzj.thinkinginjava.generics;

public class LinkedStack<T> {
	private class Node<U> {
		U item;
		Node<U> next;
		public Node() {
			item = null;
			next = null;
		}
		public Node(U item, Node<U> next) {
			this.item = item;
			this.next = next;
		}
		public boolean end() {
			return item == null && next == null;
		}
	}
	private Node<T> top = new Node<T>();
	
	public void push(T item) {
		top = new Node<T>(item, top);
	}
	public T pop() {
		T result = top.item;
		if (!top.end()) {
			top = top.next;
		}
		return result;
	}
	public static void main(String[] args) {
		String[] toPushs = "wo ai bei jing".split(" ");
		LinkedStack<String> stack = new LinkedStack<String>();
		for (String str : toPushs) {
			stack.push(str);
		}
//		while (true) {
//			String temp = stack.pop();
//			if (temp != null) {
//				System.out.println(temp);
//			} else {
//				break;
//			}
//		}
		String str = null;
		while ((str = stack.pop()) != null) {
			System.out.println(str);
		}
	}
}
