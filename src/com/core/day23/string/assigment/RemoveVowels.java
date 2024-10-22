package com.core.day23.string.assigment;

import java.util.Scanner;

public class RemoveVowels {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	String st=sc.nextLine();
	st=st.toUpperCase();
	
	StringBuilder s= new StringBuilder(st);
	
	for(int i=0; i<s.length(); i++) {
		if(s.charAt(i)=='A' || s.charAt(i)=='E'  
				|| s.charAt(i)=='I' || s.charAt(i)=='O' 
				|| s.charAt(i)=='U') {
			
			s.deleteCharAt(i);
		}
	}
	
	System.out.println(s);
	

	}
}
