package com.core.day19.polymorphism.assignment;

public class Overridingq2BindDynamicTest {
	
	public static void main(String[] args) {
		
		Overridingq2BindDynamicBase obj1=new Overridingq2BindDynamicBase();
		obj1.display("hiii");
		
		System.out.println("----------------------------------------------------");
		
		Overridingq2BindDynamicBase obj2=new Overridingq2BindDynamicChild();
		obj2.display("world");
		
		System.out.println("-----------------------------------------------------");
		
		Overridingq2BindDynamicChild obj=new Overridingq2BindDynamicChild();
		obj.display("class");
		
	}

}
