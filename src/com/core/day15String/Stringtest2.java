package com.core.day15String;

// using of equals function to check both string

// use equals

public class Stringtest2 {
	
	public static void main(String[] args) {
		
		String s1= new String("hello");
		String s2= new String("hello");
		
		if(s1.equals(s2)) {
			System.out.println("Both are same");
		}
		else
			System.out.println("Both are different");
		
	}

}
