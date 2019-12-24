package com.string.beans;

public class AddNumber {
	
	public static void main(String[] args) {
		 int a=10;
		 int b=20;
		Runnable r=()->{
			int c=a+b;
			System.out.println(c);
		};
		Thread t=new Thread(r);
		t.start();
		
	}
	

}
