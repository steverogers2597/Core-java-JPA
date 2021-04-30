package com.cg.lessons3Family1;

public class Male {
	
	void showDetails() {
		
		Female femal = new Female();
		Female femal2 = new Female("Arnab",(byte)23,'m',5677.00f);
		
		System.out.println(femal.name+" "+femal.fAge+" "+femal.fGender+" "+femal.fCast); //+femal.fSal);//Since,
																						//fSal is private.
		
		System.out.println(femal2.name+" "+femal2.fAge+" "+femal2.fGender+" "+femal2.fCast);
	}
	
	public static void main(String args[]) {
		
		new Male().showDetails();
	}
}
