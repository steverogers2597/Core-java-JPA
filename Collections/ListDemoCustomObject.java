package com.cg.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee1{
	int id ;
	String name;
	
	
	
	
	@Override
	public String toString() {  //to print values of Employee Objects instead of hashcodes
		return "Employee1 [id=" + id + ", name=" + name + "]";
	}




	Employee1(int id,String name){
		this.id=id;
		this.name=name;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class ListDemoCustomObject {

	public static void main(String[] args) {
		
		ArrayList<Employee1> emplist=new ArrayList<Employee1>(); //Now, this will store Array list of Employee custom objects
		
		emplist.add(new Employee1(10,"Ram"));              //this storing is 'Boxing'.
		emplist.add(new Employee1(11,"Shyam"));
		emplist.add(new Employee1(12,"GhanShyam"));
		emplist.add(new Employee1(13,"Byam"));
		emplist.add(new Employee1(14,"ShyamaRam"));
		
		//System.out.println(emplist);
		
		Iterator i=emplist.iterator();
		/*while(i.hasNext()) {
			Employee1 e =(Employee1)i.next();  // Since this is Object type
			System.out.println(e);
		}*/
		for(Object o:emplist) {
			Employee1 e1=(Employee1)o;
			if(e1.getId()==12)
				e1.setName("Arnab");
		}
		/*while(i.hasNext()) {
			Employee1 e1=(Employee1)i.next();                //this retrieving is 'Unboxing'
			if(e1.getId()==12)
				e1.setName("Arnab");
			
			if(e1.getId()==11)
				i.remove();
			
		}*/
		System.out.println(emplist);
		
		for(Object o:emplist) {
			System.out.println(o);
		}
		
	}

}
