package com.j8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterClass {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(40);
		l.add(60);
		l.add(120);
		l.add(102);
		System.out.println(l);
		List<Integer> l2=l.stream().filter(i->i%3==0).collect(Collectors.toList());
		System.out.println(l2);
		
	}

}
