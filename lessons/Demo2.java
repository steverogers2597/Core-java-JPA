package com.cg.lessons;

public class Demo2 {
	//instance variable
	int num1;
	float val1;
	static String classname="Demo2";
	
	void showResult(int num,float val) {
		
		System.out.println("Result of Sum: "+computeSum(num,val));
	}
	
	int computeSum(int num2,float val2) {
		int result = (int)(num2+val2);
		return result;
	}
	
	void sayHello() {
		System.out.println("Hi Arnab!");
		classname="Full Stack";
		System.out.println(Demo2.classname);
		int vc = 0;
		System.out.println(vc);
	}
	
	public static void main(String args[]) {
		
		System.out.println(new Demo2()); // will show address of this newly
									  	// created object.
		
		//new Demo2().showResult(3,9.7f);
		
		Demo2 rfv = new Demo2();
		rfv.showResult(3, 5.6f);
		rfv.sayHello();
		
		Demo2 rfv1 = new Demo2();
		rfv1.sayHello();
		System.out.println(Demo2.classname);
		
	}

}
