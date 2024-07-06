package com.core.day13Array;

// find sum of all even no in array 

public class Problem4 {
	
	public static void main(String[] args) {
		
		int a[]= {11,24,57,80,123,468};
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		
	}

}
