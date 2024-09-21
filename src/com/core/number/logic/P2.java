package com.core.number.logic;

// Print sum of digit of the number 

import java.util.*;

public class P2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num=sc.nextInt();
		int sum=0;
		
		while(num>0) {
			int r=num%10;
			sum=sum+r;
			num/=10;
		}
		System.out.println("Sum of all digit = "+sum);
		
	}

}
