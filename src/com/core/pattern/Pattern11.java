package com.core.pattern;

public class Pattern11 {
	
	public static void main(String[] args) {
		
		int n=4;
		for(int i=1; i<=n; i++) {
			for(int j=i+1; j<=n ;j++ ) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("1 ");
			}
			
			System.out.println();
		}
		
		for(int i=1 ; i<=n-1; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=n-1; j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}	
	}

}
