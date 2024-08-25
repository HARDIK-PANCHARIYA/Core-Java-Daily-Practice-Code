package com.core.method.logic;

import java.util.Scanner;

public class Mq2Test {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number = ");
		int no=sc.nextInt();
		
		Mq2 obj=new Mq2();
		obj.splitFactNum(no);
	}
}
