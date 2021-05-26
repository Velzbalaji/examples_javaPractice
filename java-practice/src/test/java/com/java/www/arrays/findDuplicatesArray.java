package com.java.www.arrays;

import java.util.ArrayList;

public class findDuplicatesArray {
	
	static  void findDuplicates(int arr[], int len) {
		
		
		ArrayList<Integer> a = new ArrayList<>();
		
        		
		boolean ifPresent=false;

		
		
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				
				if(arr[i]==arr[j]) {
				
				if(a.contains(arr[i])) {
					
					break;
             	}
				else {
					a.add(arr[i]);
					ifPresent=true;
					
				}
			}
		}
	}		
			
			
			if(ifPresent==true) {
				System.out.println(a);
			}else {
				System.out.println("no duplicates are present in the array");
			}
		}
	
		
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr = {2,5,1,3,9,0,2,3,1,5,0,5,2};
		
		int n = arr.length;
		
		System.out.println(n);
		
		findDuplicates(arr,n);

	}

}
