package com.core.method.logic;

//write a program to for following task
//int y=2351; int r = 2^1+3^2+5^3+1^4

public class Mq7 {
	int c=0;
	int sum=0;
	int r=0;
	int countDigit(int no) {
		while(no>0) {
		no=no/10;
		c++;
		}
		return c;
	}
	
	int total(int no,int count) {
		
		while(no>0) {
			r=no%10;
			no=no/10;
			sum+=Math.pow(r, count);
			count--;
		}
		return sum;
	}
}
