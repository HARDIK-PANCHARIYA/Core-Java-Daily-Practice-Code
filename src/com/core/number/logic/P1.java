package com.core.number.logic;

import java.util.Scanner;

// Print each digit of the number

public class P1 {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any number = ");
	int num=sc.nextInt();
	
	while(num>0) {
		int r=num%10;
		num/=10;
		System.out.println(r);
	}
	
	}
}
