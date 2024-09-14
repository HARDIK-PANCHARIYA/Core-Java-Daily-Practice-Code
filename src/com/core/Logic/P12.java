package com.core.Logic;

// print the number from 1 to 100 - divisible by 3 and 5 and do sum 

public class P12 {
	
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				sum=sum+i;
			}
		}
		System.out.println("sum of number = "+sum);
		
	}

}
