package com.cg.practiceoops;

public class UseStatic {
	static int intNum1 = 3; // static variable
	static int intNum2;
	static { //static constructor
	System.out.println("Static block initialized.");
	intNum2 = intNum1 * 4;
	}
	static void myMethod(int intNum3) { // static method
	System.out.println("Number3 = " + intNum3);
	System.out.println("Number1 = " + intNum1);
	System.out.println("Number2 = " + intNum2);
	}
	public static void main(String args[]) {
		myMethod(42);
	}
}
