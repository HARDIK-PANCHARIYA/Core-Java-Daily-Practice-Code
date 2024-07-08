package com.core.day13Array;

//  Convert all Even element of array to odd element

public class Problem14 {
	
	public static void main(String[] args) {
		
	
	
	int a[]= {10,12,13,14,15,16};
	
	for(int i=0; i<a.length; i++) {
		if(a[i]%2!=0) {
			a[i]=a[i]+1;
		}
		System.out.println(a[i]);
	}

	}
}
