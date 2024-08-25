package com.core.method.logic;

// write a method to show the factorial of each digit of number

public class Mq2 {
	int r=0;
	int fac=1;
	public void splitFactNum(int no) {
		while(no>0) {
			r=no%10;
			no/=10;
			fac=1;
			for(int i=1; i<=r; i++) {
				fac*=i;
			}
			System.out.println("Factor of "+r+" = "+fac);
		}
	}
	
}
