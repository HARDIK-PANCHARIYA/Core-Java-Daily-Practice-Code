package com.core.pattern;

/*
 
 **           **
 ***************
  *           *
  *           *
  *           *
  *           *
 ***************
 **           **

 */

public class Pattern6 {
	public static void main(String[] args) {
		
		int col=15;
		
		for(int i=1; i<=1; i++) {
			for(int j=1; j<=2; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=11; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		 
		for(int i=1; i<=15; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=1; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=11; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		for(int i=1; i<=15; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=1; i<=1; i++) {
			for(int j=i; j<=2; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=11; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=2; j++) {
				System.out.print("*");
			}
		}
	}
}


