package com.core.day13Array;

// Creating of array method 1

public class Problem1 {
	
	public static void main(String[] args) {
		
		int a[]=new int[5];  // Creating of array
		
		a[0]=23;
		a[1]=55;
		a[2]=67;
		a[3]=88;
		a[4]=111;
		
		System.out.println("Array length = "+a.length); // to get length of array
		
		for(int i=0; i<a.length; i++) {  //to get each array element
			System.out.println(a[i]);
		}	
		
	}

}
