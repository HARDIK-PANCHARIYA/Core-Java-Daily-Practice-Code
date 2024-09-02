package com.core.pattern;
/*
 
     *
    ***
   *****
  *******
 *********


 */

public class Pattern4 {
	public static void main(String[] args) {
		int s=4;
		for(int i=1; i<=9; i=i+2) {
			for(int j=1; j<=s; j++) {
				System.out.print(" ");
			}
			s--;
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
			
	}
	

}
