package com.maven.junitmaven;


interface RevString{
String rev(String s); 
}
public class ReverseofaString {

	public static void main(String[] args) {
      
      RevString rs=(String s)->
      {
    	  String revs="";
    	  for (int  i=s.length()-1;i>=0; i--) {
    		  
    		  char w=s.charAt(i);
    		  revs=revs+w;
    	  }
      return revs;
	};
System.out.println("Reverse :" +rs.rev("Welcome"));
		
//		RevString reverse = (String s) -> {  
//			String result = "";
//	         for(int i = s.length()-1; i >= 0; i--)
//	            result += s.charAt(i);
//	         return result;
//	      };
//	      System.out.println("The revese of  the string is " +rev.reverse("Gagana"));
	}
}
