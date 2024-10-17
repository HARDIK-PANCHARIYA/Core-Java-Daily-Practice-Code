package com.core.day23.Arraylist.Student;

public class Student {
	
	private int id;
	private String name;
	private String course;
	private float cgpa;
	
	Student(){
		
	}
	
	Student(int id, String name, String course, float cgpa){
		super();
		this.id=id;
		this.name=name;
		this.course=course;
		this.cgpa=cgpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", cgpa=" + cgpa + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	
	
	
	
	
	

}
