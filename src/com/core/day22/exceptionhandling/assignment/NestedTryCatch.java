package com.core.day22.exceptionhandling.assignment;

public class NestedTryCatch {
	
	public static void main(String[] args) {
		// outer try block
		try {
			// inner try block 1
			try {
				System.out.println("inside block ");
				int b=45/0;
				System.out.println(b);
			}catch(ArithmeticException e1) {
				System.out.println("inside block 1 Arithmetic Exception - e1");
			}
			
			
			// inner try block 2
			try {
				System.out.println("inside block 2");
				int b=45/0;
				System.out.println(b);
			}
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("inside block 2 Array index out of bounds - e2");
			}
			
			
			System.out.println("other statements");
		}
		catch(ArithmeticException e3) {
			System.out.println("Arithmetic Exception - e3");
			System.out.println("Inside parent try catch block ");
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("Array Index Out Of Bounds Exception - e4");
			System.out.println("Inside parent try catch block ");
		}
		catch(Exception e5) {
			System.out.println("Exception any - e5 ");
			System.out.println("Inside parent try catch block ");
		}
		System.out.println("Next statement");
	}

}
