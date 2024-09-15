package com.core.Logic;

/*

no = 14629
op--> 81
	  4
	  36
	  25
	  16

 */

public class P17 {
	
	public static void main(String[] args) {
		
		int no=45629;
		
//		for(int i=1; i<=5; i++) {
//			
//			int r=no%10;
//			System.out.println(r*r);
//			
//			no=no/10;
//		}
		
		while(no>0) {
			int r=no%10;
			no=no/10;
			System.out.println(r*r);
		}
		
		
	}

}
