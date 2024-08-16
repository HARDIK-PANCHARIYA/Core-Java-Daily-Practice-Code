package com.core.day22.exceptionhandling.assignment;

public class MultiCatchEx2 {
	
	public static void main(String[] args) {
		
		int array[]= {20,10,30};
		int num1=15, num2=0;
		int sum=0;
		
		try {
			sum=num1/num2;
			System.out.println("the result = "+sum);
			
			for(int i=0; i<10; i++) {
				System.out.println("values of array = "+array[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error 1 = "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("Error 2 = "+e);
		}
		
	}

}
