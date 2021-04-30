package com.cg.exceptionHandling;

public class ExceptionLogic {
	
	public static void main(String args[]) {
		
		int a=10;
		int b=0;
		int c=0;
		try {
			try {
				c = a/b;
			
			} catch (ArithmeticException e) {
				e.printStackTrace();
	
			}
			int[] x = {4,5,6};
			System.out.println(x[4]);
		}	
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e); 
            try {
                
            }
            catch(Exception e1) {
                
            }
		}
		/*try {
			
		}
		finally {
			
		}*/
		
		System.out.println("Result "+c);
		System.out.println("Thank you");
	
	}

}
