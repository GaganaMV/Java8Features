package com.maven.junitmaven;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class NullNotNull {
	 
	int a[]= {1,3,5};
	int b[]= {1,3,5};
	
	
	
@Test
public void Test() {

assertArrayEquals(a,b);
}

//Null,NotNull
@Test
public void test1(){
	assertNotNull(s);
}

//same,notsame
String s="Welcome to maven";
String s1="Welcome to maven"; 

@Test
public void test2() {
	assertSame(s, s1);
}
	}

