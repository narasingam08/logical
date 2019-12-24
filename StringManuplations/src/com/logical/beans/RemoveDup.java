package com.logical.beans;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDup {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(30);
		l.add(30);
		l.add(30);
		l.add(301);
		l.add(40);
		l.add(50);
		System.out.println(l);
		Set<Integer> s=new HashSet<Integer>(l);
		System.out.println(s);
	}

}
