package com.core.day19.polymorphism.assignment;

public class Overridingq4BankTest {
	
	public static void main(String[] args) {
		Overridingq4Bank b1=new Overridingq4Bank();
		Overridingq4Bank b2=new Overridingq4SBI();
		Overridingq4Bank b3=new Overridingq4Axis();
		Overridingq4Hdfc b4=new Overridingq4Hdfc();
		
		System.out.println("Bank Intrest = "+b1.getRateofintrest());
		
		System.out.println("SBI Bank Intrest = "+b2.getRateofintrest());
		
		System.out.println("Axis Bank Intrest = "+b3.getRateofintrest());
		
		System.out.println("Hdfc Bank Intrest = "+b4.getRateofintrest());
		
	}

}
