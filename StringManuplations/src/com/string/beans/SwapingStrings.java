package com.string.beans;

public class SwapingStrings {

	public static void main(String[] args) {
		//swap();
		int a[]= {1,2,2,3,5,4,5,6,8,9,8};
		int n=a.length;
		duplicate(a, n);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void swap() {
		String s1="java";
		String s2="siva";
		StringBuffer sa=new StringBuffer(s1);
		sa.replace(0, 4, "siva");
		StringBuffer sb=new StringBuffer(s2);
		sb.replace(0, 4, "java");
		System.out.println(sa);
		System.out.println(sb);
	}
	public static int duplicate(int a[],int n) {
		if(n==0||n==1)
		{
			return n;
		}
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]!=a[j]) {
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[n-1];
		for(int i=0;i<j;i++) {
			a[i]=temp[i];
		}
		return j;
		
}}
