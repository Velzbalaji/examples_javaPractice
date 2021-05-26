package com.java.www.collection;

import java.util.ArrayList;

public class DemoOne_ArraryList {
	
	public static void main(String[] args) {
		
		// A list of size 4 which is to be converted:
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(1);
				list.add(2);
				list.add(3);
				list.add(4);
				
				// ArrayList converted to Object[] array:
				Object[] objArr = list.toArray();
				for(Object obj: objArr){
		      // Using casting before performing addition:
		      System.out.println((Integer)obj);
		    }
		  }


		
	}


