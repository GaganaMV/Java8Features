package Lambda;

//MARKER INTERFACE

interface Str1{
	default void display() {
		System.out.println("Hello");
	}
	void display3();
	static void display1() {
		System.out.println("Hello of static methods");
	}
	void display2();
}


interface Str2{
	default void display3() {
		System.out.println("Hello");
	}
	static void display4() {
		System.out.println("Hello of static methods");
	}
	void display5();
}


public class StaticDefaultEx implements Str1{

	public static void main(String[] args) {
		StaticDefaultEx s=new StaticDefaultEx();
		s.display();
		s.display2();
		Str1.display1();
        s.display3();
	}

	@Override
	public void display2() {
		System.out.println("Abstract Methods");
		
	}
	
	@Override
	public void display3() {
		System.out.println("Abstract Methods");
		

}
}
