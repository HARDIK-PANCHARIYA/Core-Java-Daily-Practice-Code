package com.core.day16constructor;

public class Doctor {
	
	int id;
	String name;
	float exp;
	String spec;
	
	Doctor(){
		System.out.println("object is created........");
	}
	
	Doctor(int id, String name, float exp, String spec){
		this.id=id;
		this.name=name;
		this.exp=exp;
		this.spec=spec;
	}
	
	Doctor(int id, String name, String spec){
		this.id=id;
		this.name=name;
		this.spec=spec;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", exp=" + exp + ", spec=" + spec + "]";
	}
	
	

}
