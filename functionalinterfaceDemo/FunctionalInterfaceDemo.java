package com.cg.functionalinterfaceDemo;

import java.util.Scanner;



@FunctionalInterface  //can have only 1 abstract method.

interface Square{
	public int calc(int a);
	//public int sum(int a,int b);
}

interface Message{
	public void sayHello(String msg);
	//public int sum(int a,int b);
}
//dont need to take a subclass to implement the interface

public class FunctionalInterfaceDemo {  /*implements Loan{	|
															|
	public int calc(int a) {									|----->	This part is simplified with Lambda.
	return a*a;													|
}													    	|	     */

	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);


		//Square l=(int a) -> { return a*a; }; 
		Square l=(a) -> a*a;       //  -----> this is lambda. 'a' doesnt require a datatype. no return keyword
		Square l1=(x) -> x*x*x;

		System.out.println(l.calc(6));
		System.out.println(l1.calc(3));

		Message m= (s) -> System.out.println(s);

		String str = sc.next();
		m.sayHello("Welcome to JAva 8 Functionalinterface");
		m.sayHello(str);
	}

}
