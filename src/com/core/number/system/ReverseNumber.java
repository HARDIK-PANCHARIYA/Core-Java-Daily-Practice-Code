package com.core.number.system;

import java.util.Scanner;

// reverse the no 

// 123 -> 321

public class ReverseNumber {
	
	public int reverse(int no){
		
		int revno=0;
		
		
		while(no>0) {
			int rem=no%10;
			no=no/10;
			
			revno+=rem;
			revno*=10;	
		}
		
		revno/=10;
		
		return revno;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number = ");
		int no=sc.nextInt();
		
		ReverseNumber rv=new ReverseNumber();
		
		System.out.print("Reverse no = "+rv.reverse(no));
		
		
	}

}
