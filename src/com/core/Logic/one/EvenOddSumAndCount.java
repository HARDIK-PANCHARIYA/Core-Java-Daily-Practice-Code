package com.core.Logic.one;

public class EvenOddSumAndCount {
	
	public static void main(String[] args) {
		int sumeven=0;
		int sumodd=0;
		int counteven=0;
		int countodd=0;
		for(int i=1; i<=20 ;i++) {
			if(i%2==0) {
				counteven++;
				sumeven+=i;
				
			}else {
				countodd++;
				sumodd+=i;
				
			}
		}
		
		System.out.println("Sum of even number = "+sumeven);
		System.out.println("Count of even number = "+counteven);
		System.out.println("-----------------------------------------------");
		System.out.println("Sum of odd number = "+sumodd);
		System.out.println("Count of odd number = "+countodd);
		
	}

}
