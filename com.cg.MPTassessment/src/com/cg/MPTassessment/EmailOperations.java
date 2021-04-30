package com.cg.MPTassessment;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class Headers {
	String from;
	String to;
	public Headers(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}
	
}
 class Emails{
	Headers header;
	String body;
	String greetings;
	public Emails(Headers header, String body, String greetings) {
		super();
		this.header = header;
		this.body = body;
		this.greetings = greetings;
	}
	
	
}
public class EmailOperations {
	public int emailVerify(Emails e)
	{
		Pattern p=Pattern.compile("^[(A-Za-z)|_]{1}[A-Za-z]{}[@]{1}[A-Z][a-z]{}.$");
		String str=e.header.from;
		String str1=e.header.to;
		Matcher m=p.matcher(str);
		Matcher m1=p.matcher(str1);
		if(m.find()&&m1.find())
			return 2;
		else if(m.find()||m1.find())
			return 1;
		else
			return 0;
		
	}
	public String bodyEncription(Emails e)
	{
		    String s = "";
		    int len = e.body.length();
		    for(int x = 0; x < len; x++){
		        char c = (char)(e.body.charAt(x) + 3);
		        if (c > 'z'&&c<'A')
		            s += (char)(e.body.charAt(x) - (26-3));
		        else if(c>'Z')
		        	s += (char)(e.body.charAt(x) - (26-3));
		        else
		            s += (char)(e.body.charAt(x) + 3);
		    }
		    return s;
		
		
	}
	public String greetingMassage(Emails e)
	{
		String full=e.header.from;
		String name=full.substring(0, full.indexOf('@'));
		String Greetings=":welcome homeee";
		String total=name + Greetings;
		return total;
		
	}
}
class Source{
	public static void main(String args[]) {
		Headers header;
		header = new Headers("tabbu@gmail.com","arnab@gmail.com");
		System.out.println(header);
		Emails email=new Emails(header,"Hi there!","Regards");
		
		EmailOperations ep =new EmailOperations();
		System.out.println(ep.emailVerify(email));
		
		//ep.bodyEncrytion(email.body);
		
		//System.out.println(ep.greetingMassage(email.greetings));
	}
}
