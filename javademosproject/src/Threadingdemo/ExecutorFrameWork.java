package Threadingdemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameWork {
	public static void main(String[] args) {
		vedioprocessorTask[] tasks={
			new vedioprocessorTask("Bank"),
			new vedioprocessorTask("School"),
			new vedioprocessorTask("Conference"),
			new vedioprocessorTask("HomeSecurity"),
		};
		ExecutorService newFixedThreadpool= Executors. newFixedThreadPool(4);
		for(vedioprocessorTask t:tasks) {
			newFixedThreadpool.submit(t);
		}
		newFixedThreadpool.shutdown();
	}

}
class vedioprocessorTask implements Runnable{
	String Sourcename;
	public vedioprocessorTask(String Sourcename) {
		this.Sourcename=Sourcename;
	}
	public void run() {
		System.out.println("Process vedio from "+Sourcename+" Started");
		try {
			Thread.sleep(100);
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}System.out.println("Process vedio from "+Sourcename+" Ended");
	}
}
