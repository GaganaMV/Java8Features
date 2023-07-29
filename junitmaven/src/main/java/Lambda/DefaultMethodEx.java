package Lambda;
interface Int1 {
	void abstractmethod();

	static void display1() {
		System.out.println("Interface 1....");
	}

	static void dis2() {
		System.out.println(" Abstract method Interface 2.....");

	}
}
public class DefaultMethodEx {

	public static void main(String[] args) {
		Int1.display1();
		Int1.dis2();

	}

}

