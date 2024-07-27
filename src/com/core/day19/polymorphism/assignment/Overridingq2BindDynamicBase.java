package com.core.day19.polymorphism.assignment;

public class Overridingq2BindDynamicBase {
	
	protected String val;
	
	void display(String str) {
		val="Base class ".concat(str);
		System.out.println(val);
	}


}
