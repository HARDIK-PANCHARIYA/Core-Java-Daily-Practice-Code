package com.core.day16constructor.Assignment;

public class Constructoroverloadingq8 {
	
	private int num;
	
	Constructoroverloadingq8(){
		num=100;
	}
	
	Constructoroverloadingq8(int a){
		this();
		num=num+a;
	}
	
	public int getNum(){
		return  num;
	}
	
	public void setNum(int n1){
		this.num=n1;
	}	

}
