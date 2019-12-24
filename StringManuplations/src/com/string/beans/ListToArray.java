package com.string.beans;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("anthi");
		al.add("sweetha");
		al.add("santhu");
		al.add("akanya");
		String[] str=new String[al.size()];
		al.toArray(str);
		System.out.println(str);
		for(String ss:str) {
		System.out.println(ss);
		}
	}

}
