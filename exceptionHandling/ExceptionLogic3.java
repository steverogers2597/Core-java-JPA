package com.cg.exceptionHandling;

//Multicatch blocks

public class ExceptionLogic3 {
	
	public static void main(String args[]) {
		
		try{
			//int a = args.length;
			//System.out.println("a = " + a);
			int b = 42 / 2; 
			
			int c[] = { 1 };
			c[42] = 99;
			System.out.println("Hi");
		}catch(ArithmeticException e){
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Exceptions are handled");
		}

}
