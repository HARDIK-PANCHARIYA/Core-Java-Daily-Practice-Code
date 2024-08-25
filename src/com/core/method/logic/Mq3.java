package com.core.method.logic;

// write a methods to show the sum of factorial of each digit of number

public class Mq3 {
	int r=0;
	int fac=1;
	int sum=0;
	
	public int factorialSum(int no) {
		while(no>0) {
			r=no%10;
			no=no/10;
			fac=1;
			for(int i=1;i<=r; i++) {
				fac*=i;
			}
			sum+=fac;
		}
		return sum;
	}
}
