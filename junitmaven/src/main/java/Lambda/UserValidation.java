//Assignment Question

package Lambda;

import java.util.Scanner;

@FunctionalInterface
interface Validate{
boolean login(String uname,String password); 
}

public class UserValidation {
   boolean login(String uname,String password) {
	   Validate v=(u,p)->{
		   return (uname.equals("Gagana")&&(password.endsWith("Gaganamv"))?true:false);
		   
	   };
	   return v.login(uname, password);
   }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter UserName and Password");
	String uname=sc.next();
	String Password=sc.next();
	UserValidation v=new UserValidation();
	System.out.println(v.login(uname, Password));
	}

}
