package com.core.day15String;

// String by length

public class Stringtest4 {
	
	public static void main(String[] args) {
		
		String s= "INDIA";
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<=5; j++) {
			System.out.print(s.charAt(i));
			}
			System.out.println();
		}
		
	}

}
