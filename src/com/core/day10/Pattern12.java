package com.core.day10;

//	***###
//	***###
//	***###
//	@@@***
//	@@@***
//	@@@***

public class Pattern12 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++) {
			
			for(int j=1; j<=6; j++) {
				
				if((i==1 || i==2 || i==3) && (j==4 || j==5 || j==6)) {
					System.out.print("#");
				}
				else if((i==4 || i==5 || i==6) && (j==1 || j==2 || j==3)) {
					System.out.print("@");
				}
				else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
