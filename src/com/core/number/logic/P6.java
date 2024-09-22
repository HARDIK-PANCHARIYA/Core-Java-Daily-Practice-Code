package com.core.number.logic;

import java.util.Scanner;

//count the even digit of the number
//input = 12345
//output = 2

public class P6 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num=sc.nextInt();
		int count=0;
		
		while(num>0) {
			int r=num%10;
			num/=10;
			if(r%2==0) {
				count+=1;
			}
		}
		System.out.println("Number of even degit = "+count);
	}

}
