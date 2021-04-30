package com.cg.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class NameComparator implements Comparator{   //needs separate class , so 2 objects to compare
	
	public int compare(Object o1,Object o2) { //Here, it will take 2 objects  
		Product p1= (Product)o1;
		Product p2= (Product)o2;
		if(p1.name.compareTo(p2.name) >1)      //to compare string values
			return +1;                   //Shuffling needs to be done
		else if(p1.name.compareTo(p2.name) <1)
			return -1;					// Shuffling need not be done
		else
			return 0;
	}
	
}
class IDComparator implements Comparator{
	
	public int compare(Object o1,Object o2) { //Here, it will take 2 objects  
		Product p1= (Product)o1;
		Product p2= (Product)o2;
		if(p1.id>p2.id)      
			return +1;                   //Shuffling needs to be done
		else if(p1.id <p2.id)
			return -1;					// Shuffling need not be done
		else
			return 0;
	}
	
}

class Product// implements Comparable
{   //This is used to sort elements. 
	int id;
	String name;
	double price;
	double qty;
	
	/*public int compareTo(Object o) {  //Sorting based on id's. Basically compares 1st 2 objects and shuffles them. We can sort only once using comparable
		Product p= (Product)o;
		if(this.id>p.id)      
			return +1;                   //Shuffling needs to be done
		else if(this.id<p.id)
			return -1;					// Shuffling need not be done
		else
			return 0;
	}
	*/
	public Product(int id, String name, double price, double qty) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
}

public class ComparableDemo {
	
	public static void main(String args[]) {
		
		//ArrayList<Product> plist = new ArrayList<Product>() ;     //to store products only, we use generics<>.
		TreeSet<Product> plist = new TreeSet<Product>(new IDComparator());  // TreeSet cannot auto sort custom objects unless mentioned explicitly
		
		plist.add(new Product(3,"bag",900,50));
		plist.add(new Product(4,"book",1200,60));
		plist.add(new Product(2,"table",300,40));
		plist.add(new Product(1,"pen",2000,70));
		plist.add(new Product(5,"box",500,30));
		
		System.out.println(plist);
		System.out.println("=================");
		
		//Collections.sort(plist);          //Comparable is required to use this method(For Comparable)
		//Collections.sort(plist,new NameComparator());  //For comparator 
		//Collections.sort(plist,new IDComparator());  //For comparator         (ArrayList)
		Iterator i=plist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
