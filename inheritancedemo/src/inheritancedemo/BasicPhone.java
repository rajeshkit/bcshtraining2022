package inheritancedemo;

public class BasicPhone extends ValkiTalki{
	String model;
	String brand;
	int cost;

	public BasicPhone() {

		System.out.println("Base class Basic Phone constructor");
	}
	public BasicPhone(String name) {

		System.out.println("Base class Basic Phone String 1 arg constructor");
	}
	void call() {
		System.out.println("Phone call from Basic Phone class");
	}

	void sms() {
		System.out.println("Sending sms via Basic Phone class");
	}

	static void games() {
		System.out.println("Playing games via Basic Phone class");
	}
}
