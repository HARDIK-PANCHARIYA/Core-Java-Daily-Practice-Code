package com.core.day2;

public class test {
	
	public static void main(String[] args) {
		
		int A = 20;
		int B = 20;
		
		if(A>0 && B>0) {
		if(A>B)
		System.out.println(" A is Greator");
		
		else if(B>A)
			System.out.println("B is Greator");
		
		else if(A==B)
			System.out.println("Both are same ");
		}
		else if(A<0 || B<0)
			System.out.println("Age cant be negative");
		
		
	}
}


