package Serializationdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
	public static void main(String[] args) {
		/*Employee emp1=new Employee(1,"maric",1500,"AA10023");
		Employee emp2=new Employee(2,"harsha",2000,"AA12343");*/
		try {
			FileOutputStream fos=new FileOutputStream("C:/javafsd/javademos/Files/seralization");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Employee emp2=new Employee(2,"harsha",2000,"AA12343");
			oos.writeObject(emp2);
			System.out.println("Object serialized");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream fis=new FileInputStream("C:/javafsd/javademos/Files/seralization");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee emp=(Employee) ois.readObject();
			System.out.println("Obeject deserialized\n");
			System.out.println(emp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
class Employee implements Serializable{
	int id;
	String name;
	double salary;
	String aadhar;
	Employee(int id,String name,double salary,String aadhar){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.aadhar=aadhar;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", aadhar=" + aadhar + "]";
	}
	
}
