package com.core.day10;

public class Pattern11 {
	
//	***###
//	***###
//	***###
//	******
//	******
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=6; j++) {
				
				if( (i==1 || i==2 || i==3 ) && (j==4 || j==5 || j==6 ) ) {
					System.out.print("#");
				}
				else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
