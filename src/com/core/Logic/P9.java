package com.core.Logic;

//Print even number sum of 15 to 35

public class P9 {
	
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=15; i<=35; i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of even number = "+sum);
	}

}
