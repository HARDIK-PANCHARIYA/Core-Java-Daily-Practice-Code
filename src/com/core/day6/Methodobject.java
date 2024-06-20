package com.core.day6;



public class Methodobject {
	
	//Define method
	void Calculateareaofsquare(int s){
		System.out.println("Area of Square = "+(s*s));
	}
		
	double Calculateareaofrectangle(double l , double b) {
		return (l*b);
	}
	
	double Calculateareaoftriangle(double b, double h){
		double tr=((0.5)*b*h);
		return (tr);
	}
	
	double Calculateareaofcircle(double r) {
		double cr=((3.14)*r*r);
		return cr;
	}
	
	double Claculateareaofsphere(double r) {
		double  sq=(4*(3.14)*(r*r));
		return sq;
	}
	

}
