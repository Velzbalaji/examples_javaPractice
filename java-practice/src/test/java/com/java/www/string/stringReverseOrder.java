package com.java.www.string;

import java.util.regex.Pattern;

public class stringReverseOrder {
	
	 static String reverseOrder(String str) {
		 
		 String st =" ";
		 for(int i=str.length();i>0;--i) {
			 
			 st=st+(str.charAt(i-1));   

		 }
			return st;	

}


	 static String reverseOrderByWord(String str) {
		// TODO Auto-generated method stub
		 
		 Pattern pattern = Pattern.compile(" ");
		 
		 String [] s = pattern.split(str);
		 
		 String result=  "";
		 
		 
		 
		 for(int i=0;i<s.length;i++) {
			 
			 if(i==(s.length-1))
				 
				 result = s[i]+result;
				 
			 else 
				 result = " " +s[i] +result;
			 
			 
		 }
		 
		 
		 return result;
		 
		
	}
	 
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = " Innova Solutions";
		
		 int a = str.length();
		 System.out.println(a);
		
		System.out.println(reverseOrderByWord(str));
		
		//System.out.println(reverseOrder(str));

	}



	

}
