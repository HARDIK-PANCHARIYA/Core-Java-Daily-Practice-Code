package com.core.day22.exceptionhandling.assignment;

public class ThrowEx3 {
	
	 static void checkEligibilty(int stuage, int stuwig) {
		if(stuage<12 && stuwig<40) {
			throw new ArithmeticException();
		}
		else {
			System.out.println("student registration complete");
		}
	}
	
	public static void main(String[] args) {
		
		checkEligibilty(10,20);
		System.out.println("have nice day");
		
	}

}
