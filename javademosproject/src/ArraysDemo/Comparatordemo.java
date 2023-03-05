package ArraysDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparatordemo {

	public static void main(String[] args) throws InterruptedException {
		List list=new ArrayList();
		list.add(new Leaner(105,"mark",15000,"AA2001"));
		list.add(new Leaner(102,"varsha",12000,"AA4001"));
		list.add(new Leaner(13,"darshan",16000,"AA7001"));
		Collections.sort(list,new Compare());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
class Leaner{
	int id;
	String name;
	double salary;
	String aadhar;
	public Leaner(int id, String name, double salary, String aadhar) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", aadhar=" + aadhar + "]";
	}
	
}
class Compare implements Comparator<Leaner>{

	@Override
	public int compare(Leaner o1, Leaner o2) {
		// TODO Auto-generated method stub
		return o1.aadhar.compareTo(o2.aadhar);
	}

}
