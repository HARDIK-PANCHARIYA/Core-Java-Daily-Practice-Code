package com.core.day13Array;

//find sum of all odd no in array 

public class Problem5 {
	
	public static void main(String[] args) {
		
		int a[]= {11,13,15,88,44,29,48,92,99};
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
			
		}
		
	}

}
