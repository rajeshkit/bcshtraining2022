package wordthreaddemo;

public class TypeWord implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("Word is typed");
		}
		
	}

}
