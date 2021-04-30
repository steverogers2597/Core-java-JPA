package com.cg.inhndpoly;

public class Loan {
	
	String bName;
	int loanId;
	double loanAmount;
	
	Loan(){
		bName="Axis";
		loanId =3456;
		loanAmount =22000.00;
	}
	//overloading
	Loan(int loan,double amount){
		this.loanId=loan;
		this.loanAmount=amount;
	}
	Loan(String bankName){
		this.bName=bankName;
	}
	Loan(String bankName,int loan,double amount){
		this.bName=bankName;
		this.loanId=loan;
		this.loanAmount=amount;
	}

	
	void showDetails() {
		System.out.println("In loan"+" "+loanId+" "+loanAmount+" "+bName);
	}
}
