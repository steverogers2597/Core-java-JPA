package com.cg.inhndpoly;

public class PersonalLoan extends Loan {
	
	String accountHolderName;
	
	PersonalLoan(){
		accountHolderName="ARNAB";
	}
	PersonalLoan(String name){
		super("SBI",1256,44444.0);
		this.accountHolderName=name;
	}
	
	void showAccountHolderDetails() {
		System.out.println(accountHolderName);
	}
}
