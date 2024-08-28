package com.core.method.logic;

import java.util.Scanner;

public class Mq7Test {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	
	Mq7 obj=new Mq7();
	
	int count =obj.countDigit(no);
	System.out.println(obj.total(no, count));
	
	}
}
