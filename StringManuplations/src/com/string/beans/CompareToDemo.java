package com.string.beans;

public class CompareToDemo {

	public static void main(String[] args) {
		String str1="georgeReddy";
		String str2="georReddy";
		String str3="grgeReddy";
		String str4="georgeRedy";
		/*
		 * System.out.println(str1.compareTo(str2));
		 * System.out.println(str1.compareTo(str3));
		 * System.out.println(str1.compareTo(str4));
		 */
		
		StringBuffer sb1=new StringBuffer("hari");
		StringBuffer sb2=new StringBuffer("simha");
		StringBuffer sb3=new StringBuffer("kula");
		StringBuffer sb4=sb1.append(sb2).append(sb3);
		System.out.println(sb4);
	}

}
