package com.core.day6;

public class volumemethod {
	
	double Calculatecubevolume(double s) {
		double sq=s*s*s;
		return sq;
	}
	
	double Calculatecuboidvolume(double l,double h,double b) {
		return (l*b*h);
	}
	
	float Calculatespherevoilume(float r) {
		float sp=(float) ((1.33)*(3.14)*(r*r*r));
		return sp;
	}
	
	double Calculatecylindervolume(double r, double h) {
		double cy=((3.14)*(r*r)*h);
		return cy;
	}

}
