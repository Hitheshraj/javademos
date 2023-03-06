package Functionalprogramdemo;

public class Functionalprogram {
public static void main(String[] args) {
	//traditional way
	Calculator c=new Calculator();
	c.calculate(4, 5);
	//anonymous inner class
	Icalculate multiply=new Icalculate() {
		
		@Override
		public int calculate(int a, int b) {
			// TODO Auto-generated method stub
		int result=a*b;
		System.out.println("calculator "+a+"+"+b+"="+result);
		return result;
		
		}
	};
	multiply.calculate(7,8);
	//Lambda expression
	int x=5;
	int y=10;
	Icalculate didvide=(a,b)->{return a/b;};
	System.out.println("calculator "+x+"+"+y+"="+didvide.calculate(x,y));
	Sum sum=(a,b) ->System.out.println("Sum"+(a+b));
	sum.add(17,6);
}
}
interface Icalculate{
	int calculate(int a,int b);
}
class Calculator implements Icalculate{
	public int calculate(int a,int b) {
		int result =a+b;
		System.out.println("calculator "+a+"+"+b+"="+result);
		return result;
	}
}
interface Sum{
	void add(int a,int b);
}
