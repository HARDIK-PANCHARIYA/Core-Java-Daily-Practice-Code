package com.core.day19.polymorphismoverloading;

public class A {
	
	
	int add(int x, int y) {
		return x+y;
	}
	
	int add(int x, int y, int z) {
		return x+y+z;
	}
	
	float add(float x, float y) {
		return x+y;
	}
	
	float add ( int x, float y) {
		return x+y;
	}
	
	float add (float x, int y) {
		return x+y;
	}
	

}
