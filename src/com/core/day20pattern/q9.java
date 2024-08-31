package com.core.day20pattern;

// find all number in range of 50 to 100 which are divisible my 5,7 and 10

public class q9 {
	public static void main(String[] args) {
		
	for(int i=50; i<=100; i++) {
		if(i%5==0 && i%7==0 && i%10==0) {
			System.out.println(i);
		}
	}
	}
}
