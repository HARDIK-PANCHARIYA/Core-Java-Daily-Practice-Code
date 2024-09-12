package com.core.Logic;

// Take number as second 
//  print hour,minute,second

import java.util.*;

public class P1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter number in Second = ");
		double sec=sc.nextDouble();
		
		double H= (sec/3600);  // second to hour
		double M= (sec%3600)/60; // second to hour
		double S=(sec%60);   // Second to Second
		
		System.out.println("H : M : S == "+H+" : "+M+" : "+S);
		
	}

}
