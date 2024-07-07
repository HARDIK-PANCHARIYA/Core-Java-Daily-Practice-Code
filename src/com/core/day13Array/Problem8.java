package com.core.day13Array;

//  add all the integer which are less than 0 from array

public class Problem8 {
	public static void main(String[] args) {

	
	int a[]= {-13,45,-56,45,-62,-33};
	int sum=0;
	
	for(int i=0; i<a.length; i++) {
		
		if(a[i]<0) {
			sum=sum+a[i];
		}
			
	}
	
	System.out.println("Sum of all negative no = "+sum);
	
	}
	
			
}
