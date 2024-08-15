package com.core.day22.exceptionhandling.assignment;

public class CustomExceptionEx2 {
	
	public static void main(String[] args) {
		try {
			throw new CustomExceptionEx1("custom");
		}catch(CustomExceptionEx1 exp){
			System.out.println("This is my catch block");
			System.out.println(exp);
		}
	}
	
}
