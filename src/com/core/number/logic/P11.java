package com.core.number.logic;

import java.util.Scanner;

//Find min digit from the number

public class P11 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number = ");
		int num=sc.nextInt();
		int min=num;
		while(num>0) {
			int r=num%10;
			num=num/10;
			if(r<=min) {
				min=r;
			}
		}
		System.out.println("minimum digit = "+min);
		
	}

}
