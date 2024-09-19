package com.core.number.system;

// Find all the perfect squares in given array


public class SquareOFNumber {
	
	public static void squareroot(int no) {
		for(int i=0; i<no; i++) {
			if(i*i==no) {
				System.out.println(i+" square of "+no);
			}
			else {
				
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		int a[]= {4,9,40,60,25,250,62500};
		for(int i=0; i<a.length; i++) {
			squareroot(a[i]);
		}
		
		
		
		}
	}
