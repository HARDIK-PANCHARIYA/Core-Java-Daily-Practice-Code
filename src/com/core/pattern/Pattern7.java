package com.core.pattern;

/*
 
 1
 2 6
 3 7 10
 4 8 11 13 
 5 9 12 14 15 
 
 */

public class Pattern7 {
	
	public static void main(String[] args) {
		
		int n=7;
		int no=1;
		
		for(int i=1; i<=n; i++) {
			int s=no;
			int diff=6;
			for(int j=1; j<=i; j++) {
				System.out.print(s+" ");
				s=s+diff;
				diff--;
			}
			no+=1;
			System.out.println();
		}
		
	}

}
