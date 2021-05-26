package com.java.www.collection;

import java.util.HashMap;
import java.util.Map;

public class TestDemoMap {

	public static void main(String[] args) {
		
		
		Map<String, Integer> map = new HashMap<String,Integer>();

		map.put("vishal", 35);
		map.put("sachin", 10);
		map.put("vaibhav", 40);


	    for(Map.Entry<String, Integer> entry : map.entrySet()) 
        {
			String key=entry.getKey();  
	        int b=entry.getValue();  
	        
	        if(b>=35) {
	        	
	        	System.out.println("Found : " + entry.getKey() + " " + entry.getValue());
	        	
	        	
	        }else {
	        	System.out.println("Not Found : " + entry.getKey() + " " + entry.getValue());
	        }
	        
	        
	        

		}
		
		
     }
}
