package com.lamdaExpresions;
interface Interf
{
	public static void m1()
	{
		System.out.println("m1 method");
	}
}

public class StaticMethods {

	public static void main(String[] args) {
		Interf.m1();
	}

}
