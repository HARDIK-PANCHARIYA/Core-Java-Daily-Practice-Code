package com.core.number.logic;

// Print cube of each digit

import java.util.*;

public class P9 {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Number = ");
	int num=sc.nextInt();
	
	while(num>0) {
		int r=num%10;
		num/=10;
		System.out.println(r*r*r);
	}
	
	}			
}
