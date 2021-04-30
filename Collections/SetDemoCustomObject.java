package com.cg.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Employee2{
	double id ;
	String name;
	
	
	
	
	@Override
	public String toString() {  //to print values of Employee Objects instead of hashcodes
		return "Employee2 [id=" + id + ", name=" + name + "]";
	}




	Employee2(double id,String name){
		this.id=id;
		this.name=name;
	}




	public double getId() {
		return id;
	}




	public void setId(double id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	@Override
	public int hashCode() { //if equals is true, hashcode will be executed.
		/*final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(id);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());*/
		return 1;
	}




	@Override
	public boolean equals(Object obj) {  //this will not let duplicate items to be printed. It overrides equals method.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee2 other = (Employee2) obj;
		if (Double.doubleToLongBits(id) != Double.doubleToLongBits(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class SetDemoCustomObject {
	
	public static void main(String args[]) {
		
		HashSet<Employee2> empset1=new HashSet<Employee2>();
		
		empset1.add(new Employee2(10.0,"Ram"));
		empset1.add(new Employee2(10.0,"Ram"));
		empset1.add(new Employee2(11.0,"Shyam"));
		empset1.add(new Employee2(11.0,"Shyam"));
		empset1.add(new Employee2(12.0,"GhanShyam"));
		empset1.add(new Employee2(13.0,"Byam"));
		empset1.add(new Employee2(14.0,"ShyamaRam"));
		empset1.add(new Employee2(15.0,"ShyamaRam"));
		
		Iterator i=empset1.iterator();
		
		while(i.hasNext()) {
			Employee2 e2=(Employee2)i.next();
			System.out.println(e2);
			}
		
		for(Object o:empset1) {
			Employee2 e3 =(Employee2)o;
			if(e3.getId()==13) {
				e3.setName("Arnab");
			}
			System.out.println(e3);
		}
		
		
	}

	
}
