package com.core.number.system;

import java.util.Scanner;

//Divisors of 28 are : 1, 2, 4, 7, 14 (excluding 28)

//On adding the divisors,

//1 + 2 + 4 + 7 + 14 =28

public class PerfectNumber {
	
	public static void perfect(int no) {
		
		for(int i=1; i<=no; i++) {
			int sum=0;
			for(int j=1; j<i; j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			if(sum==i) {
				System.out.println(i+" is Perfect no");
			}else {
				System.out.println(i+" is not Perfect no");
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the no of range 1 to = ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		perfect(no);
	}

}
