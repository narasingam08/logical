package com.logical.beans;

public class Amnstrong {

	public static void main(String[] args) {
		int n=153;
		int count=0;
		int temp=n;
		
		while(n>0)
		{
			int r=n%10;
			n=n/10;
			 count=count+(r*r*r);
		}
		if(temp==count)
		{
			System.out.println("amstrong");
		}else
		{
			System.out.println("not an amstrong");
		}
	}

}
