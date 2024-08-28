package com.core.method.logic;

import java.util.Scanner;

public class Mq6Test {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	
	Mq6 obj=new Mq6();
	
	int count=obj.findNumberOfDigits(no);
	
	obj.total(no,count);
	}

}
