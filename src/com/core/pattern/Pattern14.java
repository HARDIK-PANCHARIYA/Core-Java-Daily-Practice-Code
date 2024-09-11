package com.core.pattern;

import java.util.Scanner;

/*
	           *
	         * *
	       *   *
	     * * * *
	      *    *
	        *  *
	           *    
	
 */




public class Pattern14 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=4;
		
		for(int i=1; i<=n; i++) {
			
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
			
			for(int k=1; k<=n; k++) {
				if(k==n-i+1||k==n||i==n) {
					System.out.print("* ");
				}
			else {
					System.out.print("  ");
				}
			}
			
			System.out.println("");
		}
		
		
		
		
	}

}
