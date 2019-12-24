package com.j8.predefiendFunInterf;

import java.util.ArrayList;
import java.util.function.Predicate;
class Student
{
	private int eid;
	private String ename;
	public Student(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
}

public class PredicateEamp {

	public static void main(String[] args) {
		/*
		 * Predicate<Integer> p=i->i%2==0; System.out.println(p.test(3));
		 * System.out.println(p.test(4));
		 */
		ArrayList<Student> a=new ArrayList<Student>();
		a.add(new Student(2, "raju"));
		
		Predicate<Student> ss=e->e.getEid()==2;
		for(Student s:a)
		{
			if(ss.test(s))
			{
				System.out.println(s.getEname());
			}
		}
	}

}
