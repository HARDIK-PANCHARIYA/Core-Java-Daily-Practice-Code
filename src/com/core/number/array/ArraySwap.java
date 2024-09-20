package com.core.number.array;

public class ArraySwap {
	
	public static void main(String[] args) {
		
	int a[]= {10,20,30,40,50,60,70};

	
	for(int i=0; i<a.length; i++) {
		System.out.print(a[i]+" ");
	}
	
	for(int i=0; i<a.length/2; i++) {
		
		int temp=0;
		temp=a[i];
		a[i]=a[a.length-i-1];
		a[a.length-i-1]=temp;	
		
	}
	
	
	System.out.println();
	for(int i=0; i<a.length; i++) {
		System.out.print(+a[i]+" ");
	}
	}
}
