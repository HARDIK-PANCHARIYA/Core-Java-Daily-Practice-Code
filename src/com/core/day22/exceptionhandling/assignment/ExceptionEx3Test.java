package com.core.day22.exceptionhandling.assignment;

public class ExceptionEx3Test {
	
	public static void main(String[] args) {
		
		ExceptionEx3 obj=new ExceptionEx3();
		try {
		int res=obj.sum(0, 20);
		System.out.println(res);
		}catch(Exception e) {
			System.out.println("catch = "+e);
			
		}
		
	}

}
