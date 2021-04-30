package com.cg.practiceoops;
import java.util.Scanner;

class Box{
	
	double height;
	double weight;
	double depth;
	
	double calcVolume(){
		
		return height*weight*depth;
	}
}

public class BoxDemo {
	
	public static void main(String args[]) {
		
		Box box =new Box();
		Scanner sc =new Scanner(System.in);
		
		box.height=sc.nextDouble();
		box.weight=sc.nextDouble();
		box.depth=sc.nextDouble();
		
		System.out.println(box.calcVolume());
		
	}
	
}
