package com.string.beans;

public class Polindrome {

	public static void main(String[] args) {
		/*
		 * String s="itit"; String reverse=new StringBuffer(s).reverse().toString();
		 * 
		 * if(reverse.equals(s)) { System.out.println("plindrome"); }else {
		 * System.out.println("not a plindroem"); }
		 */
		int n=545;
		int sum=0;
		int r,temp;
		temp=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=(sum*10)+r;
		}
		if(temp==sum)
		{
			System.out.println("polindrome");
		}
		else
		{
			System.out.println("not poliin");
		}
		
	}

}
