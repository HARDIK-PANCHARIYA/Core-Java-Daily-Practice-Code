package com.core.pattern;

public class Pattern12 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=0; i<n; i++) {

				System.out.print((int)Math.pow(11, i));

			System.out.println();
		}
		
		for(int i=n-2; i>=0; i-- ) {

				System.out.print((int)Math.pow(11, i));

			System.out.println();
		}
	}

}
