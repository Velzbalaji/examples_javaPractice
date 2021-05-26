package com.java.www.collection;

import java.util.HashMap;
import java.util.Map;

public class Demo_Anagram {

	// Java program to check if two strings
	// are anagrams of each other


	// function to check if two strings
	// are anagrams of each other
	
	// Approach one 
	
	/*static boolean areAnagram(String str1, String str2) {
		
		
		// If both strings are of different
		// length. Removing this condition
		// will make the program fail for
		// strings like "aaca" and "aca"
		if (str1.length() != str2.length())
			return false;

		// Create a count array and initialize
		// all values as 0
		int[] count = new int[256];

		// For each character in input strings,
		// increment count in the corresponding
		// count array
		for (int i = 0; i < str1.length(); i++) {
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}

		// See if there is any non-zero
		// value in count array
		for (int i = 0; i < str1.length(); i++)
			if (count[str1.charAt(i)] != 0) {
				return false;
			}
		return true;
	}
	*/
	
	// Approach two using map
	
	
	static boolean areAnagram(String str1, String str2) {
	
		
		Map<Character,Integer> strmap1 = new HashMap<Character,Integer>();
		Map<Character,Integer> strmap2 = new HashMap<Character,Integer>();
		
		Character ch;
		
		for(int i=0; i<str1.length();i++) {
			ch = str1.charAt(i);
			if(strmap1.get(ch)==null) {
				strmap1.put(ch, 1);
			}else {
				strmap1.put(ch, (strmap1.get(ch)+1));
			}
			
		}
		for(int i=0; i<str2.length();i++) {
			ch = str2.charAt(i);
			if(strmap2.get(ch)==null) {
				strmap2.put(ch, 1);
			}else {
				strmap2.put(ch, (strmap2.get(ch)+1));
			}
			
		}

		
		
		
		return strmap1.equals(strmap2);
		
	}

	
	
	

	// Driver code
	public static void main(String[] args) {
		String str1 = "geeksforgeeks";
		String str2 = "forgeeksgeeks";

		// Function call
		if (areAnagram(str1, str2))
			System.out.print("The two strings are " + "anagram of each other");
		else
			System.out.print("The two strings are " + "not anagram of each other");
	}
}
