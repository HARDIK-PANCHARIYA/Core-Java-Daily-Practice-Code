package com.core.day26.contenment;

public class EmpTest {
	
	public static void main(String[] args) {
		
		EmpDetails empdt = new EmpDetails("o+", "Pune", "hardikpanchariya3012@gmail.com", "9067181797");
		
		empSalaryDetails empsal= new empSalaryDetails(40000, 20000, 50000, 60000);
		
		Employee e1= new Employee(111, "Hardik Panchariya", empdt, empsal);
		
		System.out.println(e1);
		
		
		
	}

}
