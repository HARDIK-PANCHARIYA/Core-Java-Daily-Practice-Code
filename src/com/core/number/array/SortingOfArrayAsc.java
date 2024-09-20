package com.core.number.array;

public class SortingOfArrayAsc {
	
	public static void main(String[] args) {
		
	int a[]= {90,80,70,60,50,40,20,10};
	
	for(int i=0; i<a.length; i++) {
		System.out.print(a[i]+" ");
	}
	
	for(int i=0; i<a.length-1; i++) {   // length-1 -- for proper index
		for(int j=i; j<a.length-1; j++) {
			if(a[i]>=a[j+1]) {
				int temp=a[j+1];
				a[j+1]=a[i];
				a[i]=temp;
		}
		}
	}
	
	System.out.println();
	for(int i=0; i<a.length; i++) {
		System.out.print(a[i]+" ");
	}
	
	}
}
