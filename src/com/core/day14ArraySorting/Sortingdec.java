package com.core.day14ArraySorting;

public class Sortingdec {
	
	public static void main(String[] args) {
		int a[]= {67,12,8,20,70,80,55,99};
		
		for(int j=0; j<a.length;j++) {
		for(int i=j; i<a.length-1; i++) {
			if(a[j]<a[i+1]) {
			int t=a[j];
			a[j]=a[i+1];
			a[i+1]=t;
		}
		}
		}
	
	for(int i=0; i<a.length; i++) {
		System.out.println(a[i]);
	}
	}
}
