package com.core.day23.string;

public class CommonString {
	public static void main(String[] args) {
	
	String a="har";
	String b="harihsihhksd";
	
	int sizea=a.length();
	int sizeb=b.length();
	int minn=0;
	
	if(sizea<=sizeb) {
		minn=sizea;
	}else {
		minn=sizeb;
	}
	
	
	// fist approach --------------------------------
	 
	String com="";
	for(int i=0; i<minn; i++) {
		if(a.charAt(i)==b.charAt(i)) {
			com+=a.charAt(i);
		}else {
			break;
		}
	}
	System.out.println(com);
	
	
	// second approach -----------------------------------------
	
	String sub=b;
		while(a.indexOf(sub)!=0) {
			sub=sub.substring(0,sub.length()-1);
		}
	System.out.println(sub);
	
	
	System.out.println(b.indexOf(a));
}
}
