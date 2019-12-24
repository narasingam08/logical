package com.string.beans;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountDuplicates {
	static void duplicate(String str) {
		Map<String, Integer> hm=new HashMap<String, Integer>();
		String[] st=str.split(" ");
		
		for(String s:st)
		{
			if(hm.get(s)!=null)
			{
				hm.put(s, hm.get(s)+1);
			}else {
			hm.put(s, 1);
			}
			
		}
		System.out.println(hm);
	}
	static void duplicateChar(String st)
	{
		Map<Character, Integer> mp=new HashMap<Character, Integer>();
		for(int i=0;i<st.length();i++)
		{
			char c=st.charAt(i);
			if(mp.get(c)!=null)
			{
				mp.put(c, mp.get(c)+1);
			}
			else
			{
				mp.put(c,1);
			}
		}
		System.out.println(mp);
	}
	
	public static void main(String[] args) {
		
		//duplicate("this is is narasimha Reddy Reddy bng");
		duplicateChar("aaaccba");
		duplicateChar("aaacccb");

	}
	
	
	 
	
	
		

}
