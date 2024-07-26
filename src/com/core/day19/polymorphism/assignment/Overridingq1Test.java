package com.core.day19.polymorphism.assignment;

public class Overridingq1Test {
	
	public static void main(String[] args) {
		
		Overridingq1DerivedClass dr=new Overridingq1DerivedClass();
		dr.method();
		
		Overridingq1baseClass bs=new Overridingq1baseClass();
		bs.method();
		
		
		Overridingq1baseClass bs2= new Overridingq1DerivedClass();
		bs.method();
		
	}

}
