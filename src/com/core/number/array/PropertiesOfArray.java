package com.core.number.array;

public class PropertiesOfArray {
	
	
	public static void main(String[] args) {
	
		int a[]= {10,20,40,50,60,70,20,30};
		
		for(int i =0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\n"+"length array = "+a.length);

		System.out.println("a[0] = "+a[0]);
		
		System.out.println("a[0 + 1 ] = "+a[0+1]); // index original +1 = a[1]
		
		System.out.println();
		
		System.out.println("a[0] + 1 = "+ a[0]+1);  // add element at the last 
		
	}
	
}
