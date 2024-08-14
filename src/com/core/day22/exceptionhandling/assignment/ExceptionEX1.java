package com.core.day22.exceptionhandling.assignment;

public class ExceptionEX1 {
	
	public static void main(String[] args) {
		int array[]= {1,2};
		try {
			System.out.println("The 10 value of array "+array[10]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The Error "+e);
			e.printStackTrace();
		}
	}

}
