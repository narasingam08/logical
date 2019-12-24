 package com.lamdaExpresions;

public class RunnableAdd {

	public static void main(String[] args) {
		Runnable r=()->{
			int a=10;
			int b=20;
			int c=a+b;
			System.out.println("add"+c);
		};
		Thread t=new Thread(r);
		t.start();
		
	}

}
