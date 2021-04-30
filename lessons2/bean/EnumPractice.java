package com.cg.lessons2.bean;

enum Mobile{
	APPLE(100),SAMSUNG,HTC(90);
	
	int price;
	
	
	
	Mobile(){
		price =80;
	}
	
	Mobile(int p){
		price =p;
	}
	
	public int getPrice() {
		return price;
	}
}

public class EnumPractice {
	
	public static void main(String args[]) {
		System.out.println(Mobile.APPLE.getPrice());
		System.out.println(Mobile.SAMSUNG.getPrice());
		System.out.println(Mobile.HTC.getPrice());
		
		System.out.println(Mobile.APPLE.ordinal()); //by order
		System.out.println(Mobile.SAMSUNG.ordinal());
		System.out.println(Mobile.HTC.ordinal());
	}
}
