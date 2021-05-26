package com.java.www.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class stringUniqueWords {

	static void printUniqueWords(String str) {

		HashMap<String, Integer> hmap = new LinkedHashMap<>();

		String[] words = str.split("\\W");
		
		boolean s = hmap.isEmpty();
		
		System.out.println(s);

		for (String word : words) {

			if (hmap.containsKey(word)) {

                hmap.put(word, hmap.get(word) + 1);
			} 
			
			else 
				hmap.put(word, 1);
			
		}

		for (Map.Entry<String, Integer> en : hmap.entrySet()) {

			if (en.getValue() == 1) {
				
				System.out.println(en.getKey());
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to balaji online class balaji";

		printUniqueWords(str);

	}

}
