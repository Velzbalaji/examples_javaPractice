package com.java.www.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class dummyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> dm = new TreeMap<Integer,String>();
		//List<String> ls = new ArrayList<String>();
		
		//Set<String> ss = new HashSet<String>();
		
		
		
		
		dm.put(5, "Test");
		dm.put(5, "Test");
		dm.put(10, "Test");
		dm.put(20, "Test");
		dm.put(30, "Test");
		dm.put(40, "Test");
		
//		
//		for(Map.Entry<Integer, String> ss : dm.entrySet()) {
//			
//			System.out.println(ss.getKey());
//			
//		}
//		
         Set<Entry<Integer, String>> se = dm.entrySet();
         
         Iterator<Entry<Integer, String>> itr = se.iterator();
         
         while(itr.hasNext()) {
        	 Map.Entry<Integer, String> aa = itr.next();
        	 System.out.println(aa.getKey() + " " + aa.getValue());
        	 
        	 
         }
         
	

		//System.out.println(dm);
		
		
		
		
		
	}

}
