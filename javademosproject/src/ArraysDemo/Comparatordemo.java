package ArraysDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Comparatordemo{
	public static void main(String[] args) throws InterruptedException {
		List list=new ArrayList();
		list.add(new Employee(105,"mark",15000,"AA2001"));
		list.add(new Employee(102,"varsha",12000,"AA4001"));
		list.add(new Employee(13,"darshan",16000,"AA7001"));
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
/*class empcom implements Comparable<Employee>{
	public int compareTo(Employee e1,Employee e2) {
		// TODO Auto-generated method stub
		return 
}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}*/
class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;
	String aadhar;
	
	public Employee(int id, String name, double salary, String aadhar) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", aadhar=" + aadhar + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id-(o.id);
	}
	
}
