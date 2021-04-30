package com.cg.MPTassessment;

class Activity{
	String string1;
	String string2;
	String operator;
	
	Activity(String string1,String string2,String operator){
		this.string1=string1;
		this.string2=string2;
		this.operator=operator;
	}
}

public class Sources {
	
	public String handleException(Activity a) {
		String msg =null;
		try {
		if(a.string1.equals(null) || a.string2.equals(null)) {
			msg = "Null Values Found";
			throw new NullPointerException(msg);
		}
		else if(!a.operator.equals("+") && !a.operator.equals("-")) {
			msg ="wrong operator"+a.operator;
			throw new Exception(msg);
		}
		else
			msg = "No Exceptions found";
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return msg;
	}
	
	public String doOperation(Activity a) {
		String result =null;
		switch(a.operator) {
		
			case "+": {
				result =a.string1.concat(a.string2);
				break;
			} 
			case "-":{
				result =a.string1.replace(a.string2, " ");
				break;
		}
		}
		return result;
	}
	
	public static void main(String args[]) throws Exception{
		Activity a =new Activity("Hello","World","+");
		Sources s =new Sources();
		System.out.println(s.doOperation(a));
		Activity a1 =new Activity("HelloWorld","World","-");
		//System.out.println(s.doOperation(a1));
		
		System.out.println(s.handleException(a));
	}
}
