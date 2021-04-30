package com.cg.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

class A{
	 void show() throws InterruptedException,IOException //checked or Compile time exception
		{
			
			Thread.sleep(500);
			FileWriter f = new FileWriter("e:\\ac.txt");
		}
}

public class ThrowsDemo extends A { //If superclass is throwing, no need to throw in this class,in case of Overriden methods
	@Override 
	void show() throws InterruptedException,IOException
	{
		
		//Thread.sleep(500);
		FileWriter f = new FileWriter("e:\\ac.txt");
	}
	
	 void disp() throws InterruptedException,IOException//order can be anything
	{
		show();
	}
			//ExceptionPropagation
	public static void main(String args[]) throws InterruptedException,IOException { 
		ThrowsDemo t = new ThrowsDemo();
		t.show();
		System.out.println("Thank You");
	}
}
