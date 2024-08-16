package com.core.day22.exceptionhandling.assignment;

public class TryCatchEx1 {
	
	public static void main(String[] args) {
		int num1, num2;
		
		try {
			num1=0;
			num2=62/num1;
			System.out.println("Try block");
		}catch(ArithmeticException e) // (Exception e) 
		{
			System.out.println("dont divide the number by zero");
		}
		System.out.println("out of try catch block");
	}

}
