package com.cg.MPTassessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListOps {
	
	public ArrayList<Integer> makeArrayListInt (int n){
		
		ArrayList list =new ArrayList<Integer>();
		for(int i =0;i<n;i++) {
			list.add(0);
		}
		return list; 
		
	}
	
	public ArrayList<Integer> reverseList (ArrayList<Integer> list){
		
		Collections.reverse(list);
		return list;
	}
	
	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n){
		
		Collections.replaceAll(list, m, n);
		
		return list;
	}
	
	public static void main(String args[]) {
		ArrayListOps a =new ArrayListOps();
		System.out.println(a.makeArrayListInt(4));
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));
		System.out.println(a.reverseList(list));
		
		System.out.println(a.changeList(list, 28, 20));
		
	}

}
