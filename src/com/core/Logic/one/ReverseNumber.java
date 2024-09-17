package com.core.Logic.one;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number = ");
		int no=sc.nextInt();
		
		int result=0;
		
		while(no>0) {
			int rem=no%10;
			no=no/10;
			result+=rem;
			result*=10;
		}
		
		result=result/10;
		
		System.out.println(result);
		
		
	}

}
