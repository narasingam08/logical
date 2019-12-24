package com.lamdaExpresions;
interface AddI
{
public void add(int a,int b);	
}

public class Addition{

	public static void main(String[] args) {
		AddI ai=(a,b)->{
			System.out.println("sum"+(a+b));
			};
		ai.add(10, 20);
	}

}
