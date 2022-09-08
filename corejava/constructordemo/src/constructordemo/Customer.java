package constructordemo;

public class Customer implements Runnable{

	@Override
	public void run() {
		System.out.println("Customer");		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		Thread t1=new Thread(c);
		t1.start();
		
		Thread t2=new Thread(c);
		t2.start();
		
		Thread t3=new Thread(c);
		t3.start();
	}

}
