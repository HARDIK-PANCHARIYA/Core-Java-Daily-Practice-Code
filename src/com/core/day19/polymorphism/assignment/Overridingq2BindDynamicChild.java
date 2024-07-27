package com.core.day19.polymorphism.assignment;

public class Overridingq2BindDynamicChild extends Overridingq2BindDynamicBase {
	
	void display(String str) {
		System.out.println(val);
		super.display(str);
		if(val==null) {
			str="Child class ".concat(str);
			System.out.println(str);}
			else {
				System.out.println("else");
			}
		}
	}

