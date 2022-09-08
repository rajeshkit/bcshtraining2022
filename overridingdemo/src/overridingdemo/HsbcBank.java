package overridingdemo;

public class HsbcBank extends IciciBank {
	void verification() {
		System.out.println("Driving liscens");
	}
	public static void main(String[] args) {
		IciciBank hs=new HsbcBank();
		hs.verification();
	}
}
