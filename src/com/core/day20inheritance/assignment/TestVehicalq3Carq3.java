package com.core.day20inheritance.assignment;

public class TestVehicalq3Carq3 {
	
	public static void main(String[] args) {
		
		Carq3 obj=new Carq3();
		
		obj.setSize(7);
		obj.setSpeed(300);
		obj.color="White";
		obj.gear=6;
		obj.cc=2000;
		
		System.out.println("Car size = "+obj.getSize());
		System.out.println("Car Speed = "+obj.getSpeed());
		System.out.println("Car Color = "+obj.getColor());
		System.out.println("Care CC = "+obj.cc);
		System.out.println("Care Gear = "+obj.gear);
		
		
	}

}
