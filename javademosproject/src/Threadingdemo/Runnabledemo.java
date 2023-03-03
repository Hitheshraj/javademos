package Threadingdemo;

public class Runnabledemo {
	public static void main(String[] args) {
		System.out.println("Begin main");
		imageprocess imgp=new imageprocess();
		Thread t=new Thread(imgp);
		t.start();	
		Thread t1=new Thread(new Runnable(){
			public void run() {
				System.out.println("Do some work");
			}
		});
		t1.start();
		System.out.println("End main..");
		}

}
class imageprocess implements Runnable{
	public void run() {
		System.out.println("Precoessing the image");
	}
	
}
