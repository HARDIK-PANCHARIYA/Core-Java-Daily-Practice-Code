package com.core.number.system;

import java.util.Scanner;

// harshad number is equal to Niven number

// sum of all digit of the number can divide the number completely

// eg = 200 -- 2+0+0=2 -> 200%2==0

public class HarshadNumber {
	
	public static void harshad(int no) {
		
		int org=no;
		int sum=0;
		
		while(no>0) {
			int rem=no%10;
			sum+=rem;
			no=no/10;
		}
		
		if(org%sum==0) {
			System.out.println(org+" is harshad number");
		}else {
			System.out.println(org+" is not harshad number");
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Number = ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		harshad(no);
		
	}

	

}
