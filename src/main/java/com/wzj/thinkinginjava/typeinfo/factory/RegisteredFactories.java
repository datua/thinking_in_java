package com.wzj.thinkinginjava.typeinfo.factory;

import java.util.ArrayList;
import java.util.List;

class Part {
	public String toString() {
		return getClass().getSimpleName();
	}

	static List<Class<? extends Part>> partFactories = new ArrayList<Class<? extends Part>>();
	static {

	}
}

class Filter extends Part {
}

class FuelFilter extends Filter {
	public static class Factory implements
			com.wzj.thinkinginjava.typeinfo.factory.Factory<FuelFilter> {
		public FuelFilter create() {
			return new FuelFilter();
		}
	}
}

public class RegisteredFactories {

}
