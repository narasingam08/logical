package com.logical.beans;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
	public static void countdup(String s)
	{
		String[] str=s.split(" ");
		Map<String, Integer> m=new HashMap<String, Integer>();
		
		for(int i=0;i<=str.length-1;i++)
		{
		if(m.containsKey(str[i]))
		{
			m.put(str[i], m.get(str[i])+1);
		}else
		{
			m.put(str[i], 1);
		}
		}
		System.out.println(m);
		
	}

	public static void main(String[] args) {
 countdup("hi alla vykantapuram lo movie alla");
	}

}
