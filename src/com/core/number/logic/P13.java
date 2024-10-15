package com.core.number.logic;

//  print the number from 44 to 22 and skip number divisible by 3

public class P13 {
	
	public static void main(String[] args) {
		
	int i=44;
	while(i>=22) {
		if(i%3!=0) {
			System.out.println(i);
		}
		i--;
	}
	}

}
