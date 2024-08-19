package com.core.day22.exceptionhandling.assignment;

import java.io.IOException;

public class ThrowEx2 {
	
	void mymethods(int num) throws IOException,ClassNotFoundException{
		if(num==1) {
			throw new IOException("Exception message 1");
		}
		else{
			throw new ClassNotFoundException("Exception message 2");
		}
	}

}
