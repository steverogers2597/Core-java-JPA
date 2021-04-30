package com.cg.practiceoops;
/*
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Email {
	// Implement Email Class according to the specifiaction.
		Header header;
		String body;
		String greetings;
		Email(Header header,String body,String greetings){
			this.header=header;
			this.body=body;
			this.greetings=greetings;
		}
		
		
	}
	class Header{
	// Implement the Header Class according to the specifiaction.
		String from;
		String to;
		Header(String from,String to){
			this.from=from;
			this.to=to;
		}
	}
	class EmailOperations {
		// Implemet the Three methods specified in the specified.	
		
			public int emailVerify(Email e){
				//Email e1 = new Email();
				Pattern pattern =Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
				
				//e1.header.from="arnab@gmail.com";
				//e1.header.to="arnab@gmail.com";
				Matcher matchMail = pattern.matcher(e.header.from);
				Matcher matchM = pattern.matcher(e.header.to);
				if(matchMail.find() && matchM.find()) {
					//System.out.println("Verified");
					return 2;
				}
				else if(matchMail.find() || matchM.find())
					return 1;
				else {
					return 0;
				}
				
		}
			public String bodyEncrytion(Email body) {
				String f="";
				char ch;
				int a;
				for(int i=0;i<body.toString().length();i++) {
					ch=body.toString().charAt(i);
					if(Character.isLetter(ch)) {
						a=ch+3;
						if(Character.isUpperCase(ch)&&a>90 || Character.isLowerCase(ch)&&a>122) {
							a=a-26;
						}
						ch = (char) a;
					}
					f=f+ch;
				}
				return f;
			}
			
			public String greetingsMessage(String greetings) {
				String str="";
				Header header =null;
				String s = header.from.substring(0,header.from.lastIndexOf("@"));
				
				str = greetings.toString().concat(s);
				
				return str;
			}
	}
	


	public class PracticeMCQ {

	public static void main(String[] args) {
		
		Header header;
		header = new Header("tabbu@gmail.com","arnab@gmail.com");
		//System.out.println(header);
		Email email=new Email(header,"Hi there!","Regards");
		
		EmailOperations ep =new EmailOperations();
		System.out.println(ep.emailVerify(email));
		
		//ep.bodyEncrytion(email.body);
		
		//System.out.println(ep.greetingsMessage(email.greetings));
		
	}


}
	
*/

