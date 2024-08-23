package com.core.day24.gc;

public class Student {
	
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(name+"is getting deleted....");
	}

}
