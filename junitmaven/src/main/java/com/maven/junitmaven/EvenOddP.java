package com.maven.junitmaven;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class EvenOddP {
	public boolean isEvenNumber(int num) {
		boolean result = false;
		if(num%2==0) {
			result = true;
		}
		return result;
	}
	
@Test
public void evenNumberTest() {
EvenOddP e=new EvenOddP();
assertFalse(e.isEvenNumber(5));
}
}
