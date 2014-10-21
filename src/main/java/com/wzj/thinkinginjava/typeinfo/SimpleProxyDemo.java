package com.wzj.thinkinginjava.typeinfo;

interface Interface {
	public void doSomething();
	public void doElseSomething();
}
class RealObject implements Interface {
	public void doSomething() {
		System.out.println("do something.");
	}

	public void doElseSomething() {
		System.out.println("do else something.");
	}
}
class SimpleProxy implements Interface{
	private Interface proxied;
	public SimpleProxy(Interface proxied) {
		this.proxied = proxied;
	}
	public void doSomething() {
		System.out.println("SimpleProxy do something.");
		proxied.doSomething();
	}

	public void doElseSomething() {
		System.out.println("SimpleProxy do else something.");
		proxied.doElseSomething();
	}
}

public class SimpleProxyDemo {
	private static void consume(Interface iface) {
		iface.doSomething();
		iface.doElseSomething();
	}
	public static void main(String[] args) {
		consume(new RealObject());
		consume(new SimpleProxy(new RealObject()));
	}
}
