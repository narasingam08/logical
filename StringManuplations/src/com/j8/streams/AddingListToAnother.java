package com.j8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddingListToAnother {

	public static void main(String[] args) {
		/*
		 * List<Integer> l=new ArrayList<Integer>(); for(int i=0;i<=10;i++) { l.add(i);
		 * } List<Integer> l2=new ArrayList<Integer>();
		 * l2.stream().parallel().collect(Collectors.toCollection(()->l));
		 * System.out.println(l2);
		 */
		String ss="hi ratan how r u";
		StringBuffer sb=new StringBuffer(ss);
		StringBuffer s=sb.reverse();
		System.out.println(s.replace(4, 7, "how"));
	}

}
