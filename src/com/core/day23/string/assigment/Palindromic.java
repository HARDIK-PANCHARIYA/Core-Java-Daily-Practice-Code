package com.core.day23.string.assigment;

public class Palindromic {
	public static void main(String[] args) {
		
	String s="abcbia";
	
	int i=0;
	int j=s.length()-1;
	boolean cheak=true;
	
	while(i<j) {
		if(s.charAt(i) != s.charAt(j)) {
			cheak=false;
			break;
		}
		i++;
		j--;
	}
	
	if(cheak==true) {
		System.out.println("Is Palindromic String");
	}else {
		System.out.println("Is NOT Palindromic String");
	}
	
	
	}
}
