package com.j8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByStudents {

	public static void main(String[] args) {
		List<Student> l=new ArrayList<Student>();
		l.add(new Student(2, "anji"));
		l.add(new Student(3, "simha"));
		l.add(new Student(5, "anji"));
		l.add(new Student(6, "jaffa"));
		System.out.println(l);
		/*
		 * List<Student>
		 * l2=l.stream().filter(s->s.getSname()=="anji").collect(Collectors.toList());
		 */
		List<String> l2=l.stream().map(s->s.getSname().concat("eee")).collect(Collectors.toList());
		System.out.println(l2);
		System.out.println(l);
	}

}
