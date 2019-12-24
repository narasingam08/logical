package com.string.beans;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] ="hi simha living in bng".split(" ");
		System.out.println(s.length -1);
		
		
		String ans="";
		for(int i=s.length-1;i>=0;i--)
		{
			ans+=s[i]+" ";
		}
		System.out.println(ans.substring(0,ans.length()-1));

	}

}
