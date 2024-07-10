package com.core.day14ArraySorting;

public class Reversearray {
	
	public static void main(String[] args) {
		
		int a[]= {67,12,8,20,70,80,55,99};
		
		System.out.println("Array length = "+a.length);
		
		System.out.println("Index of array = "+(a.length-1));
		
		for(int i=0; i<a.length/2; i++) {
			
			//SWAPPING
			int t=a[i];
			a[i]=a[a.length-i-1];  //a.length-i-1 ---> index value
			a[a.length-i-1]=t;	
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
