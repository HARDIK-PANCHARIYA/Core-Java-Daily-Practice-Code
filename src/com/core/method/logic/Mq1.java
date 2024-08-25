package com.core.method.logic;


// write a program using method to calculate the factorial of number 


public class Mq1 {
	
	int fac=1;
	public void m1(int a) {
		for(int i=1; i<=a; i++) {
			fac*=i;   ///fac=fac*i;
		}
		System.out.println("Factors of "+a+" = "+fac);
	}

}
