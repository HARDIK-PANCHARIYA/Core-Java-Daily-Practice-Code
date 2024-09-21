package com.core.number.logic;

// count no of digit in given number 

import java.util.Scanner;

public class P3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num=sc.nextInt();
		int count=0;
		while(num>0) {
			int r=num%10;
			count+=1;
			num=num/10;
		}
		System.out.println("Total no of digits = "+count);
		
	}
	

}
