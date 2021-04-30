package com.cg.abstractDemo;

//abstract object cant be create  , cnat be instantiated
//all abstract methods need to be implemented
abstract class Account{
  abstract void createAccount();
}
abstract class Loan{
  
  abstract void getEmi(double amt); //abstract method
  abstract void getLoanDetails(String name);
  void show() {
      System.out.println("concrete method ");
  }
}
class PersonalLoan extends Loan {
   void getEmi(double amt) {
      
  }
   void getLoanDetails(String name) {
       
   }
}
class BusinessLoan  extends Loan {
   void getEmi(double amt) {
          
      }
       void getLoanDetails(String name) {
           
       }
       
        void businessMethod() {
            
        }
}

public class AbstractDemo {
	
	public static void main(String[] args) {
	    //    Loan l;    //=new Loan();
	        PersonalLoan pl=new PersonalLoan();
	        pl.show();
	        pl.getEmi(5000);
	        pl.getLoanDetails("AXIS");
	        
	        Loan l=new PersonalLoan();
	        l.show();
	        l.getEmi(5000);
	        l.getLoanDetails("AXIS");
	        
	        l=new BusinessLoan();
	        l.show();
	        l.getEmi(5000);
	        l.getLoanDetails("AXIS");
	        BusinessLoan b1=new BusinessLoan();
	        b1.businessMethod();
	    }

	 

	}
	 


