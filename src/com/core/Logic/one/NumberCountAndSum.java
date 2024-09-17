package com.core.Logic.one;

import java.util.Scanner;

public class NumberCountAndSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no = ");
		int no = sc.nextInt();

		int count = 0;
		int sum = 0;

		while (no > 0) {
			int rem = no % 10;
			no = no / 10;
			sum += rem;
			count++;
		}

		System.out.println("Sum of all number digit = " + sum);
		System.out.println("Count of all number digit = " + count);

	}

}
