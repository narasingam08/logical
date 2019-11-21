package com.string.beans;

import java.util.Scanner;

public class Alphabit {
	public static void main(String[] args) {
		
		char c='a';
		if((c>='a'&&c<='z')||(c>='A')&&(c<='Z'))
		{
			System.out.println(c+"is alphait");
		}else {System.out.println(c+"is not alphait");}
		
		char cc='A';
		if((cc>='a'&&cc<='z')||(cc>='A'&&cc<='Z'))
		{
			System.out.println(cc+"is alphabit");
		}else
		{
			System.out.println(cc+"not alphabit");
		}
	}

}
