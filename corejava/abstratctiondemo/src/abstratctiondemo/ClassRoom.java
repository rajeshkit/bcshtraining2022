package abstratctiondemo;

public abstract class ClassRoom { //
	private int k=10;
	public abstract void conductSession(); 
	// unimplemented or abstract method 
	
	private void breakSession(){ 
		// implemented or non abstract method or concrete method
		System.out.println("Morning at 10.30am");
		System.out.println("Lunch at 12.30Pm");
		System.out.println("Evening tea at 3.15PM");
		
	}
	

}
