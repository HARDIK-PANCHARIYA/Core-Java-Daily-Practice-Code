package com.core.number.logic;

//count the odd digit of the number
//input = 12345
//output = 3

import java.util.*;

public class P7 {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number = ");
		int num=sc.nextInt();
		int count=0;
		while(num>0) {
			int r=num%10;
			num/=10;
			if(r%2!=0) {
				count+=1;
			}
		}
		System.out.println("The no of odd digit = "+count);
	}
}
