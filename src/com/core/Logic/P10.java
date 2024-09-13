package com.core.Logic;

//Print the odd number sum 15 to 35

public class P10 {
	
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=15; i<=35; i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println("odd number sum = "+sum);
		
	}

}
