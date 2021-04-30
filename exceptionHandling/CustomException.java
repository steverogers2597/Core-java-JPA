package com.cg.exceptionHandling;

import java.util.Scanner;
//custom exception
class MinimumDepositException extends Exception{
	MinimumDepositException(String msg){
		super(msg); //to notify superclass exception about the message we are creating
	}
}

public class CustomException {
	
	public static void main(String args[]) throws MinimumDepositException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Deposit amount : ");
		int amt = sc.nextInt();
		if (amt<1000) //throw is used to raise exception
			throw new MinimumDepositException("Minimum Deposit amt should be 1000/-");
		else
			System.out.println("Thank You");
	}

}
