package Enumdemo;
public class Enum {
public static void main(String[] args) {
	//paymentType pt = new paymentType.DEBITCARD;
	//vehicle v=new vehicle.BIKE;
	//System.out.println(pt);
	paymentType[] values=paymentType.values();
	for(paymentType p:values) {
		System.out.println(p);
		System.out.println(p.ordinal());
		System.out.println(p.getfee());
	}
}
}
enum vehicle{
	CAR,
	BUS,
	BIKE;
}
enum paymentType{
	DEBITCARD(5),
	CREDITCARD(10),
	CASH(1);
	int fee;
	paymentType(int fee){
		this.fee=fee;
	}
	public int getfee() {
		return this.fee;
	}
	
}
