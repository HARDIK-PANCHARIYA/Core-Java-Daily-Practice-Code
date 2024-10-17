package com.core.day23.Arraylist.Product;

import java.io.ObjectInputStream.GetField;
import java.util.*;

public class ProductTest {
	
	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter id , name , category, price");
//		int id=sc.nextInt();
//		sc.nextLine();   //use between string and int, float, double
//		String name=sc.nextLine();
//		String category=sc.nextLine();
//		float price=sc.nextFloat();
		
		Product p1=new Product(101,"Java Book","Stationary",120.7f);
		Product p2=new Product(201,"HP Projector","Electronics",2070.8f);
		Product p3=new Product(301,"White Board","Stationary",300.789f);
		Product p4=new Product(102,"Boss Mic","Electronics",1200.7f);
		Product p5=new Product(202,"Lenovo Laptop","Electronics",50458.23f);
		Product p6=new Product(302,"Marker","Stationary",30.8f);
		Product p7=new Product(103,"Chair","Stationary",1000.7f);
		Product p8=new Product(203,"Table","Stationary",2000.89f);
		Product p9=new Product(303,"Speaker","Electronics",3020.7f);
//		Product p10=new Product(id,name,category,price);
		
		
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);
		list.add(p9);
//		list.add(p10);
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("============================================================================");
		
		for(Product p: list) {
			System.out.println(p);
		}
		System.out.println("======================================================================");
		
		list.stream().forEach(p->System.out.println(p));
		
		System.out.println("==============================================================================");
		
		
		// increase the product price by 10 %
		float priceinc=10.0f/100.0f;
		
		for(Product p:list) {
			float udp=p.getPrice()+p.getPrice()*priceinc;
			p.setPrice(udp);
			
			System.out.println(p);
		}
		System.out.println("============================================================================");
		
		// decrease the price by 20%
		float pricedec=20.0f/100.0f;
		
		for(Product p:list) {
			float dissc=p.getPrice()-p.getPrice()*pricedec;
			p.setPrice(dissc);
			System.out.println(p);
		}
		
		
	}

}
