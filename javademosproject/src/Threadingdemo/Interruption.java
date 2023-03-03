package Threadingdemo;

public class Interruption {
	public static void main(String[] args) {
		System.out.println("Start");
		Thread t=new Thread(new Worker());
		t.start();
		try {
			Thread.sleep(100);
			t.interrupt();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}
	
}
class Worker implements Runnable{
	public void run() {
		System.out.println("Start");
		for(int i=1;i<=10;i++) {
			System.out.println(" "+i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println("Thread interrupted");
			}
	}
		System.out.println("End");
}
}
