package com.core.day21.abstraction.assignment;

public class AbstractTestEx1 extends AbstractclassEx1 {
	
	public void disp2() {
		System.out.println("I am overridding abstract method");
	}
	
	public static void main(String[] args) {
		AbstractTestEx1 obj=new AbstractTestEx1();
		obj.disp1();
		obj.disp2();
	}
}
