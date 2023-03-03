package Threadingdemo;

import java.util.Scanner;

public class Joindemo {
public static void main(String[] args) {
	printmessage("Sum of first N numbers");
	printmessage("Enter value");
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	
	Calculator cal=new Calculator(n);
	cal.start();
	try {
		cal.join();
		//At this point it waits until the thread completes and returns
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("sum of first "+n+" numbers are "+cal.sum);
}
	private static void printmessage(String message) {
		System.out.println(Thread.currentThread().getName()+"-"+message);
	}
}


class Calculator extends Thread{
	int n;
	int sum;
	Calculator(int n){
		this.n=n;
	}
	public void run() {
		for(int i=1;i<=n;i++) {
			this.sum+=i;
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
