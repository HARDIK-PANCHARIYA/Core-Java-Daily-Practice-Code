package com.core.day13Array;

//Find the Smallest element in an array 

public class Problem10 {
	
	public static void main(String[] args) {
		
		int a[]= {56,89,34,67,21,12};
		int s=a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<=s) {
				s=a[i];
			}
			
		}
		System.out.println("Smallest element in array = "+s);
		
	}

}
