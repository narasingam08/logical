package com.logical.beans;

public class StringPolindrome {

	public static void main(String[] args) {
		String s="iti";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1+=s.charAt(i);
			System.out.println(s1);
		}
		if(s.equals(s1))
			{
			System.out.println("polindrome");
			}else
			{
				System.out.println("not a polindrome");
			}
	}

}
