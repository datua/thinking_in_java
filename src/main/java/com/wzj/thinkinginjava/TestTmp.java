package com.wzj.thinkinginjava;

import org.junit.Test;

public class TestTmp {
	private String haha = "wahaha";
	public TestTmp() {
		haha = "wuwu";
	}
	@Test
	public void printInt() {
		System.out.println(int.class.getName());
		TestTmp tmp = new TestTmp();
	}

}
