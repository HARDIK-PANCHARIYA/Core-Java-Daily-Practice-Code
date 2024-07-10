package com.core.day14ArraySorting;

public class Sortingasc {
	
	public static void main(String[] args) {
		
		int a[]= {123,56,9,67,11,2};
		
		
//		for(int i=0; i<a.length-1; i++) {  // approach for only one element 
//			if(a[0]>a[i+1]) {
//				int t=a[0];
//				a[0]=a[i+1];
//				a[i+1]=t;
//			}
//		}
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=i; j<a.length-1; j++) {
				if(a[i]>a[j+1]) {
					int t=a[i];
					a[i]=a[j+1];
					a[j+1]=t;
					
				}
				}
			}			
	
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
