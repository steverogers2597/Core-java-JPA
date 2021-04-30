package com.cg.lessons3Family1;

public class Female{
	
	//data members
	public String name;
	byte fAge;
	char fGender;
	protected String fCast;
	private float fSal;
	
	//constructer
	public Female() {
		name =" ";
		fAge = 23;
		fGender = 'f';
		fCast = "NotKnown";
		fSal = 1000.00f;
	}
	
	public Female(String name,byte age,char fGender,float fSal) {
		this.name =name;
		this.fAge =age;
		this.fGender= fGender;
		
		this.fSal=fSal;
		
	}
	
	//methods for operation
	
	void showDetails() {
		System.out.println(name+ " "+fAge+" "+ fGender + " "+ fCast+ " "+ fSal);
	}
}
