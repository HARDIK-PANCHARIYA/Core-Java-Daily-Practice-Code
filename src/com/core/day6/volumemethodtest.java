package com.core.day6;

public class volumemethodtest {
	
	public static  void main(String args[]) {
	
	volumemethod obj=new volumemethod();
	
	double sq=obj.Calculatecubevolume(4);
	System.out.println("Volume of Cube = "+sq);
	
	
	double re=obj.Calculatecuboidvolume(2,3,4);
	System.out.println("Volume of Cuboid = "+re);
	
	float sp=obj.Calculatespherevoilume(2);
	System.out.println("Volume of Sphere = "+sp);
	
	double cy=obj.Calculatecylindervolume(2, 4);
	System.out.println("Volume of Cylinder = "+cy);
	
}
	
}
