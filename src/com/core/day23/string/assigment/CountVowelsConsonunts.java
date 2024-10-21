package com.core.day23.string.assigment;

import java.util.Scanner;

public class CountVowelsConsonunts {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toUpperCase();
		int vowel=0;
		int con=0;

		for(int i=0; i<str.length(); i++) {
			char c=str.charAt(i);
			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				vowel++;
			}
			else {
				con++;
			}
		}
		
		System.out.println("Vowels = "+vowel);
		System.out.println("Consonunts = "+con);
		
		
	}

}
