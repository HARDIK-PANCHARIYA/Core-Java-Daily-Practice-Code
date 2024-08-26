package com.core.method.logic;

import java.util.Scanner;

public class Mq5Test {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number = ");
		int no=sc.nextInt();
		
		Mq5 obj=new Mq5();
		System.out.println("Output = "+obj.m1(no));
	}

}
