package com.core.day23.Arraylist.Student;

import java.util.ArrayList;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student s1=new Student(101,"Hardik","BE",8.23f);
		Student s2=new Student(102,"Sanket","BE",8.44f);
		Student s7=new Student(101,"soham","ME",7.2f);
		Student s3=new Student(101,"Ritesh","BE",8.44f);
		Student s5=new Student(101,"Aryan","BE",7.8f);
		Student s6=new Student(101,"Amit","Bcom",9.1f);
		
		ArrayList<Student> list= new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s5);
		list.add(s6);
		list.add(s7);
				
		//================ normal for===============
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\n"+"================================================");
		
		//==================== Enhance for ===================
		for(Student t : list) {
			System.out.println(t);
		}
		System.out.println("\n"+"===================================================");
		
		//======================= for each ================================
		list.stream().forEach(a->System.out.println(a));

		
		System.out.println("\n"+"=========== print all BE student ==================");
		for(Student t : list) {
			if(t.getCourse().equals("BE")) {
				System.out.println(t);
			}
		}
		
		System.out.println("\n"+"------------------------ Decrease Cgpa by one -----------------------");
		for(Student t : list) {
			t.setCgpa(t.getCgpa()-1);
			System.out.println(t);
		}
		
		System.out.println("\n"+"------------------------ java 8 -----------------------");
		list.stream().filter(a->a.getCourse().equals("ME")).forEachOrdered(s->System.out.println(s));	
	}
}
