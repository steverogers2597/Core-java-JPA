package com.cg.stringBufferBuilder;

public class BufferBuilder {
	
	 public static void main(String[] args) {
		    
	        
	        String s="Cognizant";    //string literal ,fast,create duplicates 

	 

	        String s1=new String("Cognizant");  //java.lang.String , immutable
	         
	         System.out.println(s1);
	         System.out.println(s1.concat(" Techologies"));
	         System.out.println(s1.substring(3));
	         System.out.println(s1.length());
	         System.out.println(s1.indexOf("n"));
	         System.out.println(s1.toLowerCase());
	         System.out.println();
	         
	         StringBuffer sb=new StringBuffer("Capgemini");   //mutable ,will not duplicates, synchronized
	         StringBuffer sb1=new StringBuffer(s);    //slow
	         System.out.println(sb.append("Technologies"));
	         System.out.println(sb.delete(5,8));
	         System.out.println(sb.insert(5, "XXXX"));
	         System.out.println(sb.capacity());
	         sb.ensureCapacity(100);
	         System.out.println(sb.reverse());
	         String ss=sb1.toString();
	         System.out.println();
	         
	         StringBuilder sbu=new StringBuilder("Capgemini");   //mutable ,will not duplicates, synchronized
	         StringBuilder sb2=new StringBuilder(s);    //slow
	         System.out.println(sb2.append("Technologies"));
	         System.out.println(sb2.delete(5,8));
	         System.out.println(sb2.insert(5, "XXXX"));
	         System.out.println(sb2.capacity());
	         sb2.ensureCapacity(100);
	         System.out.println(sb2.reverse());
	         String ss2=sb2.toString();
	         
	         
	         
	         
	         
	    }


}
