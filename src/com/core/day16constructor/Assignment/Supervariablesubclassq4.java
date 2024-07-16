package com.core.day16constructor.Assignment;

public class Supervariablesubclassq4 extends Supervariableparentq4 {
	
	int num=110;
	
	void Printnumber() {
		System.out.println(super.num);  //for parent class
	}
	
	public static void main (String args[]) {
		
		Supervariablesubclassq4 obj=new Supervariablesubclassq4();
		obj.Printnumber();
					
	}

}
