package com.cg.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {  

	public static void main(String args[]) {
		LinkedHashSet empset= new LinkedHashSet(); //this is ordered.
		//Set empset= new HashSet(); // set does not allow duplicates. it stores randomly, so does not supports index wise methods.
		
		empset.add(12);
		empset.add(23.25);
		empset.add("Capgemini");
		empset.add(new Date());
		empset.add(12);//duplicate
		
		System.out.println(empset);
		
		System.out.println(empset.size());
		System.out.println(empset.contains("Capgemini"));
		//System.out.println(empset.indexOf(12));             //Does not support
		//System.out.println(empset.lastIndexOf(12));			//Does not support
		//System.out.println(empset.remove(1));
		System.out.println(empset.isEmpty());
		System.out.println(empset);
		
System.out.println("=================");
		
		ArrayList ls = new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		
		List ls1 =Arrays.asList(11,12,13); //another way to create a list directly
		System.out.println(ls1);
		
		empset.addAll(ls);                       //this 4 operations are bulk operations
		System.out.println(empset);
		
		System.out.println(empset.containsAll(ls));
		System.out.println("================");
		
		Iterator i=empset.iterator();  //this is another interface
		while(i.hasNext()) {  //to check presence of objects
			
			System.out.println(i.next());
		}
		
		System.out.println("================");
		
		for(Object o:empset) {    //another way using forEach loop.
			System.out.println(o);
		}
		System.out.println("================");
		System.out.println("================");
		System.out.println("================");
		
		TreeSet ts =new TreeSet(); // this is auto-sorted , for this stores only homogeneous elements.
		
		ts.add(20);
		ts.add(10);
		ts.add(99);
		ts.add(43);
		ts.add(74);
		
		System.out.println(ts);
		
		TreeSet ts1 =new TreeSet();
		ts1.add("Arnab");
		ts1.add("Ankita");
		ts1.add("Apurba");
		ts1.add("Suparna");
		ts1.add("Tabbu");
		System.out.println(ts1); //Strings are also sorted automatically.
	}

}
