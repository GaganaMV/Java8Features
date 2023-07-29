package doSelectAssignment;

import java.util.Arrays;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		int dist,u = 3600,t = 10,a = 5/60*60;
		dist=u*t+((a*t*t)/2);

		System.out.println(dist);

	}
//	List<Integer> intSeq1 = (List<Integer>) Arrays.asList(1,2,3);
//	// intSeq1.forEach(x -> System.out.println(x + var));
//	 intSeq1.forEach(x -> System.out.println(x));
//	 System.out.println("++++++++++++");
//	 intSeq1.forEach(System.out::println);
}
