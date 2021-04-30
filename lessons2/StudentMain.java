package com.cg.lessons2;

import com.cg.lessons2.bean.*;

public class StudentMain {
	
	public static void main(String args[]) {
		
		StudentBean student = new StudentBean("Arnab",5,"JEE");
		System.out.println(student.getName());
		
		student.setName("Arnab B");
		System.out.println(student.getName());
	} 

}
