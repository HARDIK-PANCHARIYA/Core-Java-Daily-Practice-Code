package com.core.day22.exceptionhandling.assignment;

public class ThrowEx1 {
	
	static void throwMethod() throws NullPointerException{
		System.out.println("inside throw methods");
		throw new NullPointerException("Demo");
	}
	
	public static void main(String[] args) {
		try {
			throwMethod();
		} catch (NullPointerException exp) {
			System.out.println("The exception get catch "+exp);
		}
	}
	

}
