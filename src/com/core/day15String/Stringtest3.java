package com.core.day15String;

// Ignore upper case of character

// use equalsIgnoreCase

public class Stringtest3 {
	
	public static void main(String[] args) {
		
		String s1=new String("hello");
		String s2=new String("HellO");
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Both are same");
		}
		else{
			System.out.println("Both are different");
		}
		
	}

}
