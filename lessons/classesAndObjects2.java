package com.cg.lessons;

class employee{
	int eid;
	int salary;
	static String ceo;
	
	static {	// when you load a class(class gets loaded only once)
		ceo = "Dhoni";
		System.out.println("in static");
	}
	
	public employee(){  	//Everytime ,when u create an object, this constructor will be called.
		eid = 12;
		salary = 8000;
		System.out.println("in constructor");
	}
	void show() {
		
		System.out.println(eid + ":"+salary+":"+ceo);
	
	}
} 

public class classesAndObjects2 {
	public static void main(String args[]) {
		employee hardik = new employee();
		employee krunal = new employee();
		
		hardik.show();
		krunal.show();
	}
}
