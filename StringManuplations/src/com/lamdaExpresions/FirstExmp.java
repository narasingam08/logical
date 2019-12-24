package com.lamdaExpresions;

import java.util.function.Function;

public class FirstExmp {
	
	/*
	 * public static int m1(int n) { return n*n; }
	 * 
	 * public static void main(String[] args) {
	 * System.out.println("square of"+m1(4)); }
	 */
	
	public static void main(String[] args) {
		Function<Integer, Integer> fa=n->n*n;
		
		System.out.println("square"+fa.apply(4));
	}

}
