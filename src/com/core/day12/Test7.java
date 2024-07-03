package com.core.day12;

import java.util.*;

/*
 	67890
 	--> 0
 		90
 		890
 		7890
 		67890
 */

public class Test7 {
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter any number above 4 digit : ");
	int no=sc.nextInt();
		
//	int no=12345;
	
	for(int i=10; no%i<=no; i=i*10) {
		
		System.out.println(no%i);
		
		if(no%i==no) {
			break;
		}
		
	}
	
	
	}
}
