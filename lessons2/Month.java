package com.cg.lessons2;

public enum Month {
	JAN(1),
	FEB(2),
	MARCH(3),
	APRIL(4);
	
	int num;
	Month(int num){
		this.num =num;
	}
	
	int getValue() {
		return num;
	}
	public static void main(String args[]) {
		System.out.println(Month.JAN.getValue());
	}
}
