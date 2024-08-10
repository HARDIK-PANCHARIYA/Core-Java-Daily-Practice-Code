package com.core.day21.abstraction.assignment;

public class AbstractSubclassEx4 extends AbstractEx4 {

	String name;
	
	@Override
	void getVal(String name) {
		this.name=name;
		
	}

	@Override
	void display() {
		System.out.println("Hello "+name);
	}

}
