package constructordemo;

public class Employee extends Thread {
	@Override
	public void run() {
		// a task executed by a thread
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+": " +"i value: "+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.start();// after i call start methods it immediatly calls the run
					//method code executed(task)
		e1.setName("Thread e1");
		Employee e2=new Employee();
		e2.start();// after i call start methods it immediatly calls the run
					//method code executed(task)
		
		e2.setName("Thread e2");
		e1.setPriority(MAX_PRIORITY);
	}
}
