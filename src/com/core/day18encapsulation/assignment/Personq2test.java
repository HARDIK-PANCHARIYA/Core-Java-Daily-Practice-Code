package com.core.day18encapsulation.assignment;

import java.util.Scanner;

public class Personq2test {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age = ");
		int age=sc.nextInt();
		
		Personq2 p1=new Personq2();
		p1.setAge(age);
		
		System.out.println("My age = "+p1.getAge());
		
		System.out.println(p1);
	}

}
