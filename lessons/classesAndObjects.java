package com.cg.lessons;

class Emp{
	int eid;
	int salary;
	static String ceo;
	
	void show() {
		
		System.out.println(eid +": "+salary+": "+ceo);
	}
	
}

public class classesAndObjects {
	
	public static void main(String args[]) {
		
		Emp hardik = new Emp();
		hardik.eid = 8;
		hardik.salary = 4000;
		Emp.ceo = "Dhoni";//since static is not object specified, it can also be called from the class name itself.
		
		Emp krunal = new Emp();
		krunal.eid = 10;
		krunal.salary = 6000;
		Emp.ceo = "Dhoni";
		
		hardik.show();
		krunal.show();
		
		krunal.ceo = "Kohli";
		krunal.show();
		hardik.show();
		
		
		
	}
}
