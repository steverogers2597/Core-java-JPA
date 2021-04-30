package com.cg.exceptionHandling;

class InvalidCodeException extends Exception{
	InvalidCodeException(String msg){
		super(msg);
	}
}

class PhoneRepository{
	
	static String getCountryName(String countryCode) throws InvalidCodeException {
		
		String country =null;
		int code = Integer.parseInt(countryCode);
		
		if(code>=90 && code<=100) {
			country = "India";
		}
		else if(code==901) {
			country = "USA";
		}
		else
			throw new InvalidCodeException("No country with given code found");
		
		return country;
	}
}

public class CountryCode {
	
	static String getCountryName(String countryCode) throws InvalidCodeException {
		PhoneRepository pr = new PhoneRepository();
		
		if(countryCode.length()>3 || countryCode.length()<2)
			throw new InvalidCodeException("Invalid Country Code");
		else 
			return pr.getCountryName(countryCode);
		
	}
	
	public static void main(String args[]) throws InvalidCodeException {
		PhoneRepository pr = new PhoneRepository();
		System.out.println(pr.getCountryName("96"));
		System.out.println(pr.getCountryName("901"));
		//System.out.println(pr.getCountryName("102"));
		//System.out.println(pr.getCountryName("1020"));
		
		CountryCode cc= new CountryCode();
		System.out.println(cc.getCountryName("96"));
		
	}

}
