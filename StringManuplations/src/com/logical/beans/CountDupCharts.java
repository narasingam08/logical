package com.logical.beans;

import java.util.HashMap;
import java.util.Map;

public class CountDupCharts {
	public static void countdupch(String s)
	{
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(m.get(c)!=null)
			{
				m.put(c, m.get(c)+1);
			}else
			{
				m.put(c, 1);
			}
			
					
				
					
		}
		System.out.println(m);
	}

	public static void main(String[] args) {
		countdupch("jaiifficl");
	}

}
