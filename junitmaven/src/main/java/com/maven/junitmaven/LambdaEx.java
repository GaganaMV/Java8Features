package com.maven.junitmaven;

interface Myinterface{
int add (int a, int b);
}
interface Mulinterface{
int mul(int a, int b);
}
interface Evenodd{
boolean evod(int a);
}

public class LambdaEx {


public static void main(String[] args) {
  Myinterface add = (int a,int b)-> a+b;
  System.out.println(add.add(3, 4));

   Mulinterface mul = (int a, int b)-> a*b;
   System.out.println(mul.mul(3, 6));

   Evenodd evod=(int a)->a%2==0;
   System.out.println(" Is number is even or odd "+evod.evod(5));

}
}


