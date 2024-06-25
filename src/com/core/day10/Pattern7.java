package com.core.day10;

//@*@*@
//@*@*@
//@*@*@
//@*@*@
//@*@*@

public class Pattern7 {
	
	public static void main(String args[]) {
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				
				if(j==1 || j==3 || j==5) {
					System.out.print("@");
				}
				else{
				
				System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
