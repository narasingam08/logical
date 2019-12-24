package com.lamdaExpresions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionExmp {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(200);
		l.add(20);
		l.add(100);
		l.add(300);
		System.out.println(l);
		Comparator<Integer> comp=(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0;
		Collections.sort(l,comp);
		System.out.println(l);
	}

}
