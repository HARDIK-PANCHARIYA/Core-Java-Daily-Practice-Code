package com.core.day22.exceptionhandling.assignment;

public class OwnExceptionTest {
	
	public static void intfn() throws OwnException{
		System.out.println("Throwing own exception from int function ");
		throw new OwnException(10);
	}
	
	public static void floatfn() throws OwnException{
		System.out.println("Throwing own exception from float function");
		throw new OwnException ((float)11.111);
	}
	
	public static void charfn() throws OwnException{
		System.out.println("Throwing own exception from char function");
		throw new OwnException('H');
	}
	
	public static void stringfn() throws OwnException{
		System.out.println("Throwing own exception from string function");
		throw new OwnException("Hello");
	}
	
	public static void main(String[] args) {
		try {
			intfn();
		}catch(OwnException e) {
			e.printStackTrace();
		}
		
		try {
			floatfn();
		}catch(OwnException e) {
			e.printStackTrace();
		}
		
		try {
			charfn();
		}catch(OwnException e) {
			e.printStackTrace();
		}
		
		try {
			stringfn();
		}catch(OwnException e) {
			e.printStackTrace();
		}
	}

}
