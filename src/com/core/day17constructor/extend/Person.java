package com.core.day17constructor.extend;

public class Person {
	
	int id;
	String name;
	String bod;
	
	Person(){
		super();
	}

	public Person(int id, String name, String bod) {
		super();
		this.id = id;
		this.name = name;
		this.bod = bod;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", bod=" + bod + "]";
	}
	
	
	


}
