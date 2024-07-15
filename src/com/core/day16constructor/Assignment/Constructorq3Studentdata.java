package com.core.day16constructor.Assignment;

public class Constructorq3Studentdata {
	
	private int stuID;
	private String stuName;
	private int stuAge;
	
	Constructorq3Studentdata(){
		stuID=101;
		stuName="Hardik";
		stuAge=25;	
	}
	
	Constructorq3Studentdata(int id, String name, int age){
		this.stuID=id;
		this.stuName=name;
		this.stuAge=age;
	}
	
	public int getStuID() {
		return stuID;
	}
	
	public void setStuID(int stuID) {
		this.stuID=stuID;
	}
	
	public String getStuName(){
		return stuName;
	}
	
	public void setStuName(String stuName){
		this.stuName=stuName;
	}
	
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge=stuAge;
	}
	
	@Override
	public String toString() {
		return "student = "+stuID+" "+stuName+ " "+stuAge;
	}

}
