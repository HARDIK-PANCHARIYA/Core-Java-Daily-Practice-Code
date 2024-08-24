package com.core.day26.contenment;

public class EmpDetails {
	
	String bg;
	String city;
	String email;
	String mobileno;
	
	public EmpDetails(String bg, String city, String email, String mobileno) {
		this.bg=bg;
		this.city=city;
		this.email=email;
		this.mobileno=mobileno;
	}

	@Override
	public String toString() {
		return " EmpDetails [bg=" + bg + ", city=" + city + ", email=" + email + ", mobileno=" + mobileno + "]";
	}
	
	

}
