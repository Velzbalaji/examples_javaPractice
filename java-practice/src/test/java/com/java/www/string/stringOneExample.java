package com.java.www.string;

public class stringOneExample {
	
	
	
	
	public static void main (String[]args) {
	
		int count=0;
	
	String str = "!A@#$e%%t^R&R";
	
	for(int i=0; i<str.length(); i++) {
		
		//Java Program to Check Whether the String Consists of Special Characters

		if(!Character.isDigit(str.charAt(i))&&!Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
			count++;
		}
	}	
		
		if(count==0) {
			System.out.println("No Special Characters are present in the string");
			
		}else {
			System.out.println("Having Special Characters in the String :" +count);
		}
		
	
	
	
	}

}
