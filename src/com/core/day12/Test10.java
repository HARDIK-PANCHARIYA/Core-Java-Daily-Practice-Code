package com.core.day12;

import java.util.Iterator;

/*
	ABCDEEDCBA
	ABCD  DCBA
	ABC    CBA
	AB      BA
	A        A
*/

public class Test10 {
	
	public static void main(String[] args) {
		
		int m=0;
		for(int i=69; i>=65; i--) {
			m+=2;
			for(int j=65; j<=i; j++) {
				System.out.print((char)j);
			}
			
			for(int k=2; k<m; k++) {  //For space
				System.out.print(" ");
			}
			
		 
			
			for(int k=i; k>=65; k--) {
				System.out.print((char)k);
			}
			System.out.println();
		}
		
	}

}
