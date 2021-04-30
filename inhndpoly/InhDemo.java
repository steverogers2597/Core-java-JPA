package com.cg.inhndpoly;

public class InhDemo {
	public static void main(String args[]) {
		
		Loan loan=new Loan();
		System.out.println(loan.loanId+" "+loan.loanAmount);
		
		Loan loan1=new Loan(1564,120000.00);
		System.out.println(loan1.loanId+" "+loan1.loanAmount);
		
		loan.showDetails();
		loan1.showDetails();
		
		Loan loan2 =new Loan("HDFC");
		System.out.println(loan2.bName);
		loan2.showDetails();
		
		Loan loan3=new Loan("Axis",251,10000.0);
		loan3.showDetails();
		
		PersonalLoan pl=new PersonalLoan("AB");
		pl.showDetails();
		pl.showAccountHolderDetails();
		
		PersonalLoan p2=new PersonalLoan();
		p2.showAccountHolderDetails();
	}
}
