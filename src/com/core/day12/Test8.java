package com.core.day12;

/*
  23456
  ---> 6  	   
  	   5
  	   4
  	   3
  	   2
  	  
 */

public class Test8 {
	
	public static void main(String[] args) {
		
		int no=23456;
		for(int i=1; i<=5; i++){
			
			System.out.println(no%10);	
			no=no/10;
		}
		
	}

}
