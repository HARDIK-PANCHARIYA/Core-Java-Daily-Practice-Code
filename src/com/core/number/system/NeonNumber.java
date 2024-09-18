package com.core.number.system;

import java.util.Scanner;

// number whose square and addition of square is equal to number 

// 9*9=81 = 8+1=9

public class NeonNumber {
	
	public static void neon(int no) {
		int org=no;
		int sqr=no*no;
		int sum=0;
		
		while(no>0) {
			int rem=sqr%10;
			sum+=rem;
			no=no/10;
		}
		
		if(org==sum) {
			System.out.print(org+" Number is Neon");
		}else {
			System.out.print(org+" Number is not Neon");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter The Number = ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		neon(no);
		
	}
			
	
}
