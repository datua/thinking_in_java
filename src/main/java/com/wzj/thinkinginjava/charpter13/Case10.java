package com.wzj.thinkinginjava.charpter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Case10 {
	public static void main(String[] args) {
		String str = "Java now has regular expressions.";
		String[] patterns = new String[] { "^Java", "\\Breg.*",
				"n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "s{1}.", "s{0,3}" };
		
		for (String s : patterns) {
			Pattern pattern = Pattern.compile(s);
			Matcher matcher = pattern.matcher(str);
			System.out.println(matcher.find());
		}
	}
}
