package com.core.method.logic;

import java.util.Scanner;

public class Mq4Test {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Number = ");
	int no=sc.nextInt();
	
	Mq4 obj=new Mq4();
	
	int sum=obj.niven(no);
	obj.cheakNiven(sum, no);
	}
}
