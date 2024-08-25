package com.core.method.logic;

import java.util.Scanner;

public class Mq3Test {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Number = ");
	int no=sc.nextInt();
	
	
	Mq3 obj=new Mq3();
	
	System.out.println("Sum = "+obj.factorialSum(no));
	}
}
