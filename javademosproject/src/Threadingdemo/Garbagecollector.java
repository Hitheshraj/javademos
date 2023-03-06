package Threadingdemo;


public class Garbagecollector {
public static void main(String[] args) {
	/*for(int i=1;i<=100000;i++) {
		new House(i);
	}*/
	new House(1);
	new House(2);
	System.gc();
}
}
class House {
	int id;
	House(int id){
		this.id=id;
		System.out.println("Hose Created "+id);
	}
	
	public void finalize() throws Throwable{
		System.out.println("Hose Destroyed "+id);
	}
	
}
