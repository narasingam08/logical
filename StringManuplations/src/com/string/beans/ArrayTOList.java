package com.string.beans;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTOList {

	public static void main(String[] args) {
		String  str[]= {"ravi","swetha","sanju"};
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(str));
		for(String aa:al)
		System.out.println(al);
	}

}
