package com.wzj.thinkinginjava.typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

class TraceHandler implements InvocationHandler {
	private Object target = null;

	public TraceHandler(Object target) {
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.print(target);
		System.out.print("." + method.getName() + "(");
		if (args != null) {
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i]);
				if (i < args.length - 1) {
					System.out.print(", ");
				}
			}
		}
		System.out.print(")\n");
		// TODO Auto-generated method stub
		return method.invoke(target, args);
	}
}

public class ProxyTest {
	public static void main(String[] args) {
		Object[] elements = new Object[100];
		for (int i = 0; i < elements.length; i++) {
			Integer value = i + 1;
			InvocationHandler handler = new TraceHandler(value);
			Object proxy = Proxy.newProxyInstance(null,
					new Class[] { Comparable.class }, handler);
			elements[i] = proxy;
		}
		
		Integer key = new Random().nextInt(elements.length) + 1;
		
		int result = Arrays.binarySearch(elements, key);
		if (result > 0) {
			System.out.println(elements[result]);
		}
	}
}
