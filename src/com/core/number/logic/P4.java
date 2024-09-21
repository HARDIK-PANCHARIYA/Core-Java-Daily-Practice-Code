package com.core.number.logic;

import java.util.Scanner;

//Print sum of the even digit of the number
//input = 12345
// output = 6

public class P4 {
	
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number = ");
	int num=sc.nextInt();
	int sum=0;
	
	while(num>0) {
		int r=num%10;
		num/=10;
		if(r%2==0) {
			sum=sum+r;
		}
	}
	System.out.println("The sum of even digit = "+sum);
	
	}
}
