package com.maven.junitmaven;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Addition
{
 private int add;
//Addition
public int add(int a,int b)
 {
	 return a+b;
 }
@Test
public void addTest() {
assertEquals(4,add(2,2));
}


//multiplication
 public int mul(int a,int b)
 {
	 return a*b;
 }
 
 
@Test
	public void mulTest(){
		assertEquals(18,mul(3,6));
	}
 
//EvenOrOdd
 public String evenodd(int n)
 { 
	 int even = 0,odd=0;
	 if(n%2==0) {
	return "even";
	 }else {
	 return "odd";
	 }
 }
 @Test
 public void evenOddTest() {
 	assertEquals("even",evenodd(2));
 
 	

}
}


