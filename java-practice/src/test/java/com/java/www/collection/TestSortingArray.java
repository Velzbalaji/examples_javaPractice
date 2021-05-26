package com.java.www.collection;

public class TestSortingArray {

	public static void main(String[] args) {
		
		int a =10;
		
		String s = Integer.toString(a);
		
		System.out.println(a);
		
		System.out.println("Hello");
		
		
		


		int number[] = { 55, 40, 80, 65, 71, 99, 1, 88 };

		int n = number.length;

		// System.out.println(n);

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (number[i] < number[j]) {

					int temp = number[i];
					//System.out.println(temp);
					number[i] = number[j];
					//System.out.println(number[i]);
					number[j] = temp;
					//System.out.println(number[j]);
				}
			}
		}

		for (int i = 0; i < n; i++) {

			System.out.println(number[i]);
		}
		
		
		Object ob = new String("Bala");
		//String sa = new String("Raja");
		StringBuffer sb = (StringBuffer)ob;
		
		System.out.println(sb);

	}
	
	
	

}
