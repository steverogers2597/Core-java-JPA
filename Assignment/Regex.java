package com.cg.Assignment;
import java.util.Scanner;
import java.util.regex.*;

class Person{
	String name;
	String mobile;
	String email;
}
public class Regex {
	
	public static void main(String args[]) {
		
		Person person =new Person();
		
		Scanner sc = new Scanner(System.in);
		
		Pattern pattern1 = Pattern.compile("^[A-Z][a-z\\s]{1,16}[A-Z][a-z\\s]{1,16}$");
		System.out.println("Enter Name : ");
		person.name = sc.nextLine();
		Matcher matchName = pattern1.matcher(person.name);
		if(matchName.find()) {
			System.out.println("Name is registered "+person.name);
		}
		else {
			System.out.println("Length should be between 5-16");
		}
		
		
		Pattern pattern = Pattern.compile("^[0-9]{10}$");
		
		System.out.println("Enter a mobile number: ");
		person.mobile = sc.next();
		
		Matcher match = pattern.matcher(person.mobile);
		
		if(match.find()) {
			
			long mobNo = Long.parseLong(person.mobile);
			System.out.println("Mobile Number is registered"+" "+person.mobile);
		}
		else {
			System.out.println("Invalid Mobile Number.");
		}
		
		Pattern pattern2 = Pattern.compile("[a-z0-9][@]{1}[a-z][.com]");
		System.out.println("Enter Email: ");
		person.email = sc.next();
		Matcher matchMail = pattern2.matcher(person.email);
		if(matchMail.find()) {
			System.out.println("Mail is registered "+person.email);
		}
		else {
			System.out.println("Invalid email");
		}
		
	}

}
