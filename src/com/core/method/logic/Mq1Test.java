package com.core.method.logic;

import java.util.Scanner;

public class Mq1Test {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number = ");
		int a=sc.nextInt();
		
		Mq1 obj = new  Mq1();
		
		obj.m1(a);
		
	}

}
