package com.core.Logic;

// take year as input 
// output = year is leap year or not

import java.util.Scanner;

public class P3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter year = ");
		int year=sc.nextInt();
		
		if(year%400==0 || year%4==0 && year%100 !=0) {
			System.out.println(year+" IS LEAP YEAR");
		}
		else
			System.out.println(year+" IS NOT LEAP YEAR");
		
	}

}
