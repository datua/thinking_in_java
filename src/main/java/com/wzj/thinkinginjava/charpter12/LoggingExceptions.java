package com.wzj.thinkinginjava.charpter12;

import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingExceptions {
	@SuppressWarnings("serial")
	static class LoggingException extends Exception {
		private static Logger logger = Logger.getLogger("LoggingException");
		public LoggingException() {
			StringWriter trace = new StringWriter();
//			printStrackTrace(new PrintWriter(trace));
			logger.info(trace.toString());
		}
	}
	
	public static void main(String[] args) {
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Caught " + e);
		}
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Caught " + e);
		}
	}
}
