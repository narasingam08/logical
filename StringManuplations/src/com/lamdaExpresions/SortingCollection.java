package com.lamdaExpresions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
	private int sno;
	private String sname;
	public Student(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}
	
}

public class SortingCollection {

	public static void main(String[] args) {
		List<Student> l=new ArrayList<Student>();
		l.add(new Student(101, "raghu"));
		l.add(new Student(120, "swamy"));
		l.add(new Student(136, "ravi"));
		l.add(new Student(121, "jai"));
		System.out.println(l);
		Comparator<Student> cc=(s1,s2)->(s1.getSno()<s2.getSno())?-1:(s1.getSno()>s2.getSno())?1:0;
		Collections.sort(l,cc);
		System.out.println(l);
	}

}
