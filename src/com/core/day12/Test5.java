package com.core.day12;

import java.util.*;

/*
 	Factorial of any no ----> user input
 */

public class Test5 {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number for Factorial = ");
		int a=sc.nextInt();
		int fact=1;
		
		for(int i=a; i>=1 ; --i) /*(int i=1; i<=a; i++)*/ {
				
			fact=fact*i;
		}
		
		System.out.println(fact);
		
		
		
		
	}

}
