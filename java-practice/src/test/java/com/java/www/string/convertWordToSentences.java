package com.java.www.string;

import java.util.Scanner;

public class convertWordToSentences {

	public static void main(String[] args) {
		
		String temp= "";
		
		
		String [] word = {"hello","how", "are", "you"};
		
		for(int i=0;i<word.length;i++) {
			
			
			if(word[i]!=null) {
				
				temp= temp + word[i];
			}
			
		}
		System.out.println(temp);		
		
	}

}
