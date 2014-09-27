package com.wzj.thinkinginjava.charpter12;

public class ExtraFeatures {
	class MyException extends Exception {
		private int x;
		public MyException() {
			
		}
		public MyException(String message) {
			super(message);
		}
		public MyException(String message, int x) {
			super(message);
			this.x = x;
		}
		public int val() {
			return x;
		}
		public String getMessage() {
			return "Detail message; " + x + " " + super.getMessage();
		}
	}
	
	public static void g() throws MyException {
		System.out.println("Throw new MyException from g()");
		throw new ExtraFeatures().new MyException();
	}
	public static void f() throws MyException {
		System.out.println("Throw new MyException from f()");
		throw new ExtraFeatures().new MyException("origioned in f()");
	}
	public static void h() throws MyException {
		System.out.println("Throw new MyException from h()");
		throw new ExtraFeatures().new MyException("origioned in h()", 47);
	}

	public static void main(String[] args) {
		try {
			g();
		} catch(MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			f();
		} catch(MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			h();
		} catch (MyException e) {
			e.printStackTrace(System.out);
			System.out.println("x : " + e.val());
		}
	}
}
