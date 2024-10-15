package com.core.number.logic;

//   print the number from 1 to 10 and terminate the loop at 5

public class P12 {
	
	public static void main(String[] args) {
		
//		for(int i=1; i<=10; i++) {
//			if(i>5) {
//				break;
//			}
//			System.out.println(i);
//		}
		
		int i=1;
		while(i<=10) {
			if(i>5) {
				break;
			}
			System.out.println(i);
			i++;
		}
		
		
		
	}

}
