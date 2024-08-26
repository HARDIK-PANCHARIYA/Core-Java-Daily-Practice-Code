package com.core.method.logic;

//write a program to for following task
//int y=2351; int r = 2^4+3^3+5^2+1^1

public class Mq6 {
	
	int r=0;
	int countdigit=0;
	int sum=0;
	int mul=1;
	
	int findNumberOfDigits(int no) {
		while(no>0) {
			no=no/10;
			countdigit++;
		}
		return countdigit;
	}
	
	void total(int no,int count) {
		int i=1;
			while(no>0) {
			r=no%10;
			no=no/10;
			while(i<=count) {	
				sum+=Math.pow(r, i);
				break;
			}
			i++;		
			}
			System.out.println(sum);
			
}
}
