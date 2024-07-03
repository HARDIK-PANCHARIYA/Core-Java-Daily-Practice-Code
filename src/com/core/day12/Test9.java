package com.core.day12;

/*
 	12345
 	--->  555
 		  444
 		  333
 		  222
 		  111
 */

public class Test9 {
	
	public static void main(String[] args) {
		
		int no=12345;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=3; j++) {
				System.out.print(no%10);
			}
			no=no/10;
			System.out.println();
		}
		
	}

}
