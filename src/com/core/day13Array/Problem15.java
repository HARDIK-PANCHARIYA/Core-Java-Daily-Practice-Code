package com.core.day13Array;

//	Copy one array into multiple array

public class Problem15 {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			b[i]=c[i]=a[i];
		}
		
		System.out.print("Array a = ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.print("\nArray b = ");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
		
		System.out.print("\nArray c = ");
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}
		
	}

}
