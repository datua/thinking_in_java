package com.wzj.thinkinginjava.charpter12;

public class RethrowNew {
	class OneException extends Exception {
		public OneException() {

		}

		public OneException(String message) {
			super(message);
		}
	}

	class TwoException extends Exception {
		public TwoException() {

		}

		public TwoException(String message) {
			super(message);
		}
	}

	public static void g() throws OneException {
		System.out.println("originating exception from g().");
		throw new RethrowNew().new OneException();
	}

	public static void main(String[] args) {
		try {
			try {
				g();
			} catch (OneException e) {
				System.out.println("Caught exception inner catch.");
				e.printStackTrace(System.out);
				throw new RethrowNew().new TwoException();
			}
		} catch (TwoException e1) {
			System.out.println("Caught exception outter catch.");
			e1.printStackTrace(System.out);
		}
	}
}
