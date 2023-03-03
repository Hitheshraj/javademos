package Threadingdemo;

public class Challengedemo {
	/*First method 
	public static void main(String[] args) {
		Thread t1=new Thread(new even());
		Thread t2=new Thread(new odd());
		t1.start();
		t2.start();
		for(int i=0;i<=10;i++) {
			System.out.println("Main thread -"+i);
		}
	}
	

}
class even implements Runnable{
	public void run() {
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Even tread - "+i);
			}
		}
	}
}
class odd implements Runnable{
	public void run() {
		for(int i=0;i<=10;i++) {
			if(i%2!=0) {
				System.out.println("Odd tread - "+i);
			}
		}
	}
}
}*/
	//Second method
	public static void main(String[] args) {
		Runnable r1=new Runnable() {
			public void run() {
				for(int i=0;i<=10;i++) {
					if(i%2==0) {
						System.out.println("Even tread - "+i);
					}
				}
			}
		};
		Runnable r2=new Runnable() {
			public void run() {
				for(int i=0;i<=10;i++) {
					if(i%2!=0) {
						System.out.println("Odd tread - "+i);
					}
				}
			}
		};
		Thread t1=new Thread(r1);
		t1.setName("T1");
		t1.start();
		Thread t2=new Thread(r2);
		t2.setName("T2");
		t2.start();
		for(int i=0;i<=10;i++) {
			System.out.println("Main thread -"+i);
		}
	}
	}
