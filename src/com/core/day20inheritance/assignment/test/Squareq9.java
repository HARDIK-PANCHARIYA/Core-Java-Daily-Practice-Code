package com.core.day20inheritance.assignment.test;

import com.core.day20inheritance.assignment.Shapeq9;

public class Squareq9 extends Shapeq9{
	
	public Squareq9(int nside) {
		side=nside;
	}
	
	void display() {
		Shapeq9 s1=new Shapeq9();
		//System.out.println(s1.side);   Error
	}

}
