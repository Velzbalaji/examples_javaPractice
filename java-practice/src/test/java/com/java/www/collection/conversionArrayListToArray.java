package com.java.www.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class conversionArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ls = new ArrayList<Integer>();
		
		ls.add(3);
		ls.add(9);
		ls.add(0);
		ls.add(5);
		
		Collections.sort(ls);	
		
		System.out.println(ls);
		
		
		Object[] arr = ls.toArray();
		
		for(Object i : arr) {
			
			System.out.println(i);
			
		}
		
		
		
		

	}

}
