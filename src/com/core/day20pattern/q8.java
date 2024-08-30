package com.core.day20pattern;

//  10 20 30 40 50 60 70 500 80 90 100

public class q8 {
	
	public static void main(String[] args) {
		
		for(int i=10; i<=100; i+=10) {
			System.out.println(i);
			if(i==70) {
				System.out.println(500);
			}
		}
		
	}

}
