package com.core.day12;

import java.util.*;
/*
 	Find odd and even between range take user input
 */

public class Test6 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of Number to find Even number = ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("================= EVEN =====================");
		
		for(int i=a; i<=b; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("================= ODD =====================");
			
		for(int j=a; j<=b; j++) {
			if(j%2!=0) {
				System.out.println(j);
			}	
		}
	}

}
