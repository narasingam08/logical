package com.j8.predefiendFunInterf;

import java.util.function.Function;

public class FunctionExamp {

	public static void main(String[] args) {
		Function<Integer, Integer> f=i->i*i;
		System.out.println(f.apply(20));
		Function<String, Integer> ff=i->i.length();
		System.out.println(ff.apply("jaga"));
	}

}
