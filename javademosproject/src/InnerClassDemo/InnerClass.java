package InnerClassDemo;

public class InnerClass {
public static void main(String[] args) {
	ElectronicDevice.poweron();
	ElectronicDevice.Chip.displayBrand();//if both class and method are static
	ElectronicDevice.Chip chip=new ElectronicDevice.Chip();//when both class and method are not static
	chip.specs();
	ElectronicDevice laptop=new ElectronicDevice();
	ElectronicDevice.Processor proc=laptop.new Processor();
	proc.getVoltage();
}
}
class ElectronicDevice{
	static void poweron() {
		System.out.println("Device Powred on...");
	}
	static class Chip{
		static void displayBrand() {
			System.out.println("From sony...");
		}
		void specs() {
			System.out.println("Specification for the chip...");
		}
	}
	class Processor{
		void getVoltage() {
			System.out.println("Display voltage on the processor..");
		}
	}
}
