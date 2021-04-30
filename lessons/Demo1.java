package com.cg.lessons;

public class Demo1 {
	public static void main(String args[]) {
		for(int i =2;i<=10;i++) {
			System.out.print(i+" ");
			++i;
		}
		
		if(true) {System.out.println("true");}
		else
		{System.out.println("false");}
		
		
		byte num1 = 67;
		byte num2 = 89;
		short res = (short)(num1 + num2);
		System.out.println(res);
	}
}
