package com.core.day11;

public class Cube1to10 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+" Cube = "+(i*i*i));	
		}
				
		System.out.println("--------------- Power -------------------");
		
		for(int j=1;j<=10;j++) {
			System.out.println(j+" Cube = "+Math.pow(j, 3));  
		}
	}

}
