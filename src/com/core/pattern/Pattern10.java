package com.core.pattern;

/*
 
      *
     ***
    *****
   *******
    *****
     ***
      *
 
 */

public class Pattern10 {
	
	
	public static void main(String[] args) {
	
	int n=4;
	int s=2;
	int sl=1;
	
	for(int i=1; i<=7; i=i+2) {
		for(int j=s; j<=n; j++) {
			System.out.print(" ");
		}
		s++;
		
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	 for(int i=1; i<=5; i=i+2) {
		 
		 for(int j=1; j<=sl; j++) {
			 System.out.print(" ");
		 }
		 sl++;
		 
		 for(int j=5; j>=i; j--) {
			 System.out.print("*");
		 }
		 System.out.println();
	}
	
	for(int i=1; i<=n; i++) {
		for(int j=i; j<=n-1; j++) {
			System.out.print(" ");
		}
		
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		
		for(int j=i; j>=2; j--) {
			System.out.print("*");
		}
			System.out.println();
	}
	
	for(int i=1; i<=n-1; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(" ");
		}
		for(int j=i; j<=n-1; j++) {
			System.out.print("*");
		}
		
		for(int j=i; j<=n-2; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

}

}