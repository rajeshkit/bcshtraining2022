package exceptiondemo;

public class Demo1 {
	public void m2() throws ArithmeticException {
		int[] k =new int[3];
		
			k[6] = 10;// throw new ArrayIndexOutOfBounds(); //implicit
			int g=345/0;// throw new ArrayIndexOutOfBounds();
			System.out.println(k);
	}
	public void m1() {
		System.out.println("Demo class");
		System.out.println("Pune");
		
			m2();
		
		System.out.println("TR7");
		System.out.println("Pune climate is raining");
	}
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		System.out.println("Main method 1");
		d.m1();
		System.out.println("main method 2");
	}

}
