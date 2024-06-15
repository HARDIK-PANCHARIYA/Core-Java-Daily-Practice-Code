package com.core.day2;

public class largenumberamong3 {
	
	public static void main(String[] args) {
		
		int A=100;
		int B=-20;
		int C=5;
		
		if(A>0 && B>0 && C>0) {
		if(A>B && A>C)
			System.out.println("A is Greator " );
		else if (B>A && B>C)
			System.out.println("B is Greator");
		else if (C>A && C>B)
			System.out.println("C is Greator");
		}
		else {
			System.out.println("Age can't be Negative");
		}
			
	}

}
