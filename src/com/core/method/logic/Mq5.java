package com.core.method.logic;

//   write a program to for following task
//  int y=2351; int r = 2^4+3^4+5^4+1^4

public class Mq5 {
	
	int r=0;
	double sum=0;
	int p=4;
	
	double m1(int no) {
		while(no>0) {
			r=no%10;
			no=no/10;
			sum+=Math.pow(r,p);
		}
		return sum;
	}

}
