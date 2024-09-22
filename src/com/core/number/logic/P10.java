package com.core.number.logic;

import java.util.Scanner;

//  Find max digit from the number

public class P10 {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number = ");
	int num=sc.nextInt();
	int max=0;
	
	while(num>0) {
		int r=num%10;
		num/=10;
		if(r>=max) {
			max=r;
		}
	}
	System.out.println("Maximum digit = "+max);
	}

}
