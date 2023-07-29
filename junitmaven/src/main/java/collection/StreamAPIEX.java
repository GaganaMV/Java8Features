package collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp {
	int eid;
	String ename;
	double salary;
	String designation;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", designation=" + designation + "]";
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Emp(int eid, String ename, double salary, String designation) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
	}

}


public class StreamAPIEX {

	public static void main(String[] args) {
	ArrayList<Emp> a1=new ArrayList<>();
	a1.add(new Emp(12,"Gagana",30000,"HR"));
	a1.add(new Emp(13,"Spoorthi",20000,"Tester"));
	a1.add(new Emp(14,"Sneha",15000,"Associate"));
	a1.add(new Emp(15,"Sheema",40000,"Developer"));
	a1.add(new Emp(16,"Harshi",25000,"Team Lead"));

	System.out.println(a1);
	long count=a1.stream().count();
	
	System.out.println("Number of Employees:"+count);
	
	long start_with_s=a1.stream().filter(a->a.getEname().startsWith("S")).count();
	
	
	System.out.println("Starts with S:"+start_with_s);
	

	
	
	//List<String> s=new a1.stream().filter(a->a.getEname().startsWith("S"));
	Object max_sal=a1.stream().collect(Collectors.maxBy(Comparator.comparingDouble(a->a.salary)));
	System.out.println("Maximum Salary:"+max_sal);
	
	//minimum salary
	Object min_sal=a1.stream().collect(Collectors.minBy(Comparator.comparingDouble(a->a.salary)));
	System.out.println("Minimum Salary:"+min_sal);
	
	//Maximum Salary
	Object avg_sal=a1.stream().collect(Collectors.averagingDouble(a->a.salary));
	System.out.println("Average Salary:"+avg_sal);
	
	Collection<Emp> al;
	Stream<Emp> s = a1.stream().filter(name ->name.getEname().startsWith("S"));
    System.out.println(s.collect(Collectors.toList()));
    
    
    Stream<Emp> namesStartsWith = a1.stream().filter(a -> a.getEname().startsWith("S"));
	 System.out.println("Name start with A:"+namesStartsWith.collect(Collectors.toList()));
 
	//Sorted
	 List<Emp> sorted = a1.stream().sorted((o1, o2) ->o1.getEname().compareTo(o2.getEname())).collect(Collectors.toList());
	 System.out.println(sorted);
	
	 System.out.println("********");
     String[] myArray = {"this","is","a","sentence"};
     String result = Arrays.stream(myArray).reduce("", (a,b)->a+b);
     System.out.println(result);
     
     int a[]= {1,5,8,34,3};
     long count1=Arrays.stream(a).sum();
     System.out.println("Sum:"+count1);
    
    
    String[] arr = {"bob", "alice", "paul", "ellie"};
 	Stream<String> myStream = Arrays.stream(arr);
	System.out.println(myStream.collect(Collectors.toList()));
    
    
    
    Stream<String>myNewStream=myStream.map(b->b.toUpperCase());
    System.out.println("UpperCase:"+myStream.toString());
    
    
    
    
    
     }
	}

	

	
	
	
	
	

