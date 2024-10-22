package com.core.day23.string.assigment;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		int size=str.length()-1;
		StringBuilder update=new StringBuilder();
		
		for(int i=size; i>=0; i--) {
			update.append(str.charAt(i));
		}
		System.out.println(update);
		
		
	}

}
