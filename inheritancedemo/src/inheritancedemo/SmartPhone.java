package inheritancedemo;

public class SmartPhone extends ValkiTalki{
	int memory;
	String processor;
	public void smartPhone() { // user defined no arg constructor
		System.out.println("Smart Phone constructor no arg");
	}

	public static void main(String[] args) {
		SmartPhone sm1=new SmartPhone(); // implicit object casting
		SmartPhone sm2=new SmartPhone();
		System.out.println(sm1.hashCode()+"  "+sm2.hashCode());
		System.out.println(sm1.equals("dsf"));
		System.out.println(sm1.toString());
	}
}
