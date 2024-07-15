package com.core.day16constructor.Assignment;

public class ConstOverloadingq1Test {
	
	public static void main(String[] args) {
		
		ConstOverloadingq1 a1=new ConstOverloadingq1();
		ConstOverloadingq1 a2=new ConstOverloadingq1(30);
		ConstOverloadingq1 a3=new ConstOverloadingq1(40,50);
		
		a1.display();
		a2.display();
		a3.display();
		
	}

}
