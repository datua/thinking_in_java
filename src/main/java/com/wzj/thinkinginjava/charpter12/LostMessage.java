package com.wzj.thinkinginjava.charpter12;

class VeryImportantException extends Exception {
	public String toString() {
		return "A very important exception";
	}
}
class HohumException extends Exception {
	public String toString() {
		return "A homum exception";
	}
}

public class LostMessage {
	private void f() throws VeryImportantException {
		throw new VeryImportantException();
	}
	private void dispose() throws HohumException {
		throw new HohumException();
	}

	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} catch (VeryImportantException e) {
				lm.dispose();
			}
				
//			} finally {
//				lm.dispose();
//			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
