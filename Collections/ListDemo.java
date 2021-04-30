package com.cg.Collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class Employee{
	int id;
	String name;
	
	public Employee(int id,String name){
		super();
		this.id=id;
		this.name=name;
	}
}

public class ListDemo {
	public static void main(String args[]) {
		//Vector empList= new Vector(); //it is slow. Used for MultiThreaded Operations as built in synchronized.
		//LinkedList empList= new LinkedList(); //All utilies and everything are same as ArrayList.Linked List is faster.
		List empList= new ArrayList(); //this employee list can store all your employee objects|'List' is an interface
		
		
		//empList.add(new Employee(10,"Arnab"));//custom object
		empList.add(12);
		empList.add(23.25);
		empList.add("Capgemini");
		empList.add(new Date());
		empList.add(12);//duplicate
		
		System.out.println(empList);//this entire array list becomes one single object.
		//empList.clear();//this will clear the whole list.
		System.out.println(empList.contains("Capgemini"));
		System.out.println(empList.indexOf(12));
		System.out.println(empList.lastIndexOf(12));
		System.out.println(empList.remove(1));
		System.out.println(empList.isEmpty());
		System.out.println(empList);
		
		System.out.println(empList.set(3, "Arnab"));
		System.out.println(empList);
		System.out.println(empList.size());
		
		System.out.println("=================");
		
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		List l2 =Arrays.asList(11,12,13); //another way to create a list directly
		System.out.println(l2);
		
		//copy l1 to emplist
		
		empList.addAll(l1);                       //this 4 operations are bulk operations
		System.out.println(empList);
		
		/*empList.retainAll(l1);
		System.out.println(empList);
		
		empList.removeAll(l1);
		System.out.println(empList);*/
		
		System.out.println(empList.containsAll(l1));
		System.out.println("================");
		
		Iterator i=empList.iterator();  //this is another interface
		while(i.hasNext()) {  //to check presence of objects
			
			System.out.println(i.next());
		}
		
		System.out.println("================");
		
		for(Object o:empList) {    //another way using forEach loop.
			System.out.println(o);
		}
		
		System.out.println("================");
		System.out.println("================");
		System.out.println("================");
		
		ArrayList a =new ArrayList();
		a.add(15);
		a.add(16);
		a.add(17);
		
		Object o[] = a.toArray();
		
		for(Object o1:o) {
			Integer ii=(Integer)o1;
		
			System.out.println(ii);
		}
	}
}
