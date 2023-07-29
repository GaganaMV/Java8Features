package com.maven.junitmaven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Factorial1 {
	//Factorial
	 	public int fact(int n) {
	 		int fact=1;
	 		for(int i=1;i<=n;i++) {
	 			fact=fact*i;
	 		}
	 		return fact;
	 	}
	 @Test
	 public void testFact() {
		 assertEquals(120, fact(5));
	 }
}
