package com.cg.Collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//TreeMap<Integer,Object> hm =new TreeMap<Integer,Object>();//Auto sorting of keys.
		LinkedHashMap<Integer,Object> hm =new LinkedHashMap<Integer,Object>(); //Faster than Hashmap
		//HashMap<Integer,Object> hm =new HashMap<Integer,Object>();
		
		
		//hm.put(null, "Capgemini");
		//hm.put(null, "Cg123");
		hm.put(10, new Employee2(100,"ABC"));
		hm.put(11, new Employee2(101,"ABCD"));
		hm.put(12, new Employee2(102,"ABCDE"));
		hm.put(13, new Employee2(103,"ABCDEF"));
		hm.put(1, new String("cg"));
		hm.put(2, new Date());
		
		System.out.println(hm.get(2));
		System.out.println(hm.isEmpty());
		//System.out.println(hm.remove(null));
		System.out.println(hm.containsKey(13));
		System.out.println(hm.containsValue("cg"));
		
		System.out.println("===========");
		System.out.println(hm);
		
		Set k=hm.keySet();
		System.out.println(k);    //all keys are displayed as a Set
		
		Collection objects=hm.values();	   //all values are displayed as a Collection
		System.out.println(objects);
		
		/*Iterator i = k.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("===========");
		Iterator i1 = objects.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}*/
		
		System.out.println("===========");
		
		//EntrySey
		Set entryset=hm.entrySet();
		Iterator i2=entryset.iterator();
		while(i2.hasNext()) {
			Entry e =(Entry)i2.next();       //Entry is a combination of keys and values.
			Integer key=(Integer)e.getKey();             //null we cant throw into integer
			Object o=e.getValue(); //since all values are not employee type, so we will typecast to employee
			if(o instanceof Employee2 )
				System.out.println(key + " "+ (Employee2)o);
			else
				System.out.println(key + " "+ o);     //date,string,int,double, etc.
			
		}
		
		
		
	}

}
