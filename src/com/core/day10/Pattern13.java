package com.core.day10;

//	######
//	######
//	$$$$@@
//	$$$$@@
//	$$$$@@

public class Pattern13 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=2; i++) {
			
			for(int j=1; j<=6; j++) {
				
				System.out.print("#");	
			}
			System.out.println();
		}
		
		
		
		for(int i=1; i<=3; i++ ) {
			
			for(int j=1; j<=6; j++) {
				
				if((i==1 || i==2 || i==3) && (j==5 || j==6)) {
					System.out.print("@");
				}
				else {
				System.out.print("$");	
				}
			}
			System.out.println();			
		}
		
	}

}
