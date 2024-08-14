package com.core.day22.exceptionhandling.assignment;

public class ExceptionEx3 {
	
	public int sum(int num1, int num2) {
		if(num1==0) {
			throw new ArithmeticException("First paramenter is not valid");
		}
		else {
			System.out.println("both paramenter are correct ");
		}
		return num1+num2;
	}

}
