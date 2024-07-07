package com.core.day13Array;

// find sum of all element in array which is divisible by 3 and 5

public class Problem6 {
	
	public static void main(String[] args) {
		
		int a[] = {12,4655,89,21,35,78,154,15};
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%3==0 && a[i]%5==0 ) {
				
				System.out.println(a[i]);
			}
			
		}
		
		
		
	}

}
