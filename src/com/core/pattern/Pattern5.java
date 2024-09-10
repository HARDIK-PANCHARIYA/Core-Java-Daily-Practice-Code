package com.core.pattern;
/*

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *


*/


public class Pattern5 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			int  sup=2*(4-i);       // to draw space
			for(int j=1; j<=sup; j++) {
				System.out.print(" ");
			}
			sup-=2;
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int sdp=0;
		for(int i=4; i>=1; i--) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=sdp; j++) {
				System.out.print(" ");
			}
			sdp+=2;
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
		
	}
}
