package Functionalprogramdemo;

import java.util.function.Predicate;

public class Predicatedemo {
public static void main(String[] args) {
	//The predicate conditions
	Predicate<Integer> g10=(i)->(i>10);
	Predicate<Integer> even=(i)->(i%2==0);
	int[] x= {0,10,20,30,40,5,35};
	//m1(g10,x);
	//m1(even);
	m1(even.and(g10),x);
	
}
static void m1(Predicate<Integer> p,int[] x) {
	for(int i:x) {
		if(p.test(i)) {
			System.out.println(i);
		}
	}
}
}
