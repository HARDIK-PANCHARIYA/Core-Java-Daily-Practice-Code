package com.core.day22.exceptionhandling.assignment;

public class MultipleCatchBlock {
	
	public static void main(String[] args) {
		try {
			int[] a=new int[7];
			a[4]=30/0;
			
			int b=a[10];
			System.out.println("Statementi of try block");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of BoundsException");
		}
		catch(Exception e) {
			System.out.println("Some other exception");
		}
		System.out.println("out of try and catch block");
	}

}
