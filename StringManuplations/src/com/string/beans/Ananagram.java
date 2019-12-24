 package com.string.beans;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ananagram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		
		/*
		 * String str1="java"; String str2="vaja";
		 */
		System.out.println("both anagram"+isAnangram(str1, str2));
	}
	
	public  static boolean isAnangram(String str1,String str2)
	{
		char[] c=str1.toCharArray();
		char[] cc=str2.toCharArray();
		Arrays.sort(c);
		Arrays.sort(cc);
		return Arrays.equals(c, cc);
	}

}

