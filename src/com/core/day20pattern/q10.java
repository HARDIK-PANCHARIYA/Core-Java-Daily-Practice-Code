package com.core.day20pattern;

/*

Hello Hello Hello Hi
Hello Hello Hello Hi
Hello Hello Hello Hi
Hello Hello Hello Hi

 */

public class q10 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(j==4) {
					System.out.print("Hi ");
				}
			else
			System.out.print("Hello ");
			}
			System.out.println();
		}
		
	}

}
