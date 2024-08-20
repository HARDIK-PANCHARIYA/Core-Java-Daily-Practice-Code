package com.core.day22.exceptionhandling.assignment;

public class FinallyBlock {
	public static void main(String[] args) {
		
		try {
			System.out.println("The values are = ");
			for(int i=0; i<3; i++) {
				System.out.println(i);
			}
			System.out.println(10/0);
		}
			catch (Exception e) {
				e.printStackTrace();
			}
		finally {
			System.out.println("Fianlly block always executes....");
		}
			
	}
}
