package com.cg.abstractDemo;

interface AccountA{
    void createAccounts();
    static     void shows() {
        System.out.println("java8 sttaic method allowed in interface");
    }
    default void disps(String name) {
        System.out.println("Welceom t:"+name);
    }
    
}
interface  LoanA{
   
public static final String name="abc";  //instance variable or members of class
   
    void getEmi(double amt); //abstract method
    void getLoanDetails(String name);
}
class PersonalLoanA implements LoanA ,AccountA{
public    void createAccounts() {
       System.out.println("account ");
   }
public     void getEmi(double amt) {
       System.out.println("emi..."+amt);
   }
public    void getLoanDetails(String name) {
        System.out.println("loan details...."+name);
    }
}
class BusinessLoanA  implements LoanA {
   public void getEmi(double amt) {
           
       }
    public     void getLoanDetails(String name) {
            
        }
        
         void businessMethod() {
             
         }
}
class EducationLoanA implements LoanA{
   public void getEmi(double amt) {
       
   }
public     void getLoanDetails(String name) {
        
    }
}



public class InterfaceDemo {
	
	public static void main(String[] args) {
        LoanA l;//=new Loan();
        l=new PersonalLoanA();  //dynamic binding
        l.getLoanDetails("ICICI");
        l.getEmi(5000);
        AccountA a;
        a=new PersonalLoanA();
        a.createAccounts();
        AccountA.shows();  //calling java8 sttaic method from interface
        PersonalLoanA pl=new PersonalLoanA();
        pl.disps("abc");
      
    }

}
