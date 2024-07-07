package com.core.day13Array;

//   Find the Biggest element in an array 

public class Problem9 {
	
	public static void main (String args[]) {
	
	int  a[]= {12,56,89,34,67,21};
	int b=0;
	
	for(int i=0; i<a.length; i++) {
		
		if(a[i]>b) {
			b=a[i];
		}
		
	}
	
	System.out.println("Biggest element in array = "+b);
	
	}

}
