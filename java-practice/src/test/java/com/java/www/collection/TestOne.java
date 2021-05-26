package com.java.www.collection;

public class TestOne {

	public static void main(String[] args) {
		
		int [] arr = {2,4,5,6,8,10};
		
		//System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			if(arr[i]%2==0) {
				System.out.println("Then its even number :" +arr[i]);
			}else {
				System.out.println("its odd number");
			}
		}
	
		
	}

}
