package Threadingdemo;
public class Threadingdemo {
	public static void main(String[] args) {
		
	}

}
class Threaddemo{
	void printnumbers() {
		for(int i=0;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
}
