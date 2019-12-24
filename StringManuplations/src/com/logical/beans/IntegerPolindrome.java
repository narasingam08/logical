package com.logical.beans;

public class IntegerPolindrome {

	public static void main(String[] args) {
		int n=141;
		int rem;
		int rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==n)
		{
			System.out.println("polindrome");
		}else
		{
			System.out.println("not a polindrome");
		}
	}

}
