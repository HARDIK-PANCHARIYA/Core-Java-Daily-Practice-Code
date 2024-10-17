package com.core.number.array.practice;

import java.util.Scanner;

public class InputInArray {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size =sc.nextInt();

		
		int[] number=new int[size];
		
		for(int i=0; i<size; i++) {
			number[i]=sc.nextInt();
		}
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		
	}

}
