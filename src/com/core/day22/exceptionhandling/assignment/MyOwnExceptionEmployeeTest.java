package com.core.day22.exceptionhandling.assignment;

public class MyOwnExceptionEmployeeTest {
	
	static void employeeage(int age)throws MyOwnException{
		if(age<0) {
			throw new MyOwnException("Age can't be negative");
		}
		else{
			System.out.println("input is valid");
		}
	}
	
	public static void main(String[] args) {
		try {
			employeeage(-1);
		}catch(MyOwnException e) {
			e.printStackTrace();
		}
	}

}
