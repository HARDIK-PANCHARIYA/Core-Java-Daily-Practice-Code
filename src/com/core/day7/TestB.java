package com.core.day7;

public class TestB {

	public static void main(String args[]) {

		int a = B.x;

		System.out.print("x = " + a);
		System.out.println("\n" + "------------");

		B b1 = new B();
		B b2 = new B();
		B b3 = new B();

		b1.method1(1000, 2000);
		b1.method1(10, 20);

		b2.method1(1, 2);

		// ----------------------------------

		b1.method2(80, 90);
		b3.method2(101, 202);

	}
}
