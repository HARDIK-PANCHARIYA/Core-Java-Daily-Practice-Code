package com.core.day23.string.assigment;

import java.util.Scanner;

public class CountWords {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter String : ");
	String str=sc.nextLine();
	int count=0;
	
	String[] st=str.split(" ");

	for(int i=0; i<st.length; i++) {
		count++;
	}
	System.out.println("Total number of words present = "+count);
	}
}
