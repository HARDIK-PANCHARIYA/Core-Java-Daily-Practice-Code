package com.core.day26.contenment;

public class empSalaryDetails {
	
	double basic;
	double ta;
	double da;
	double hra;
	
	public empSalaryDetails(double basic, double ta, double da, double hra) {
		this.basic=basic;
		this.ta=ta;
		this.da=da;
		this.hra=hra;
		
	}

	@Override
	public String toString() {
		return " empSalaryDetails [basic=" + basic + ", ta=" + ta + ", da=" + da + ", hra=" + hra + "]";
	}
	
	
	
	

}
