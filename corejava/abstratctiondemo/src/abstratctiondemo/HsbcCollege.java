package abstratctiondemo;

public class HsbcCollege extends ClassRoom{

	@Override
	public void conductSession() {
		System.out.println("Hsbc college consuct the session offline");
		System.out.println("At Business Bay, Pune");
		
	}
	public static void main(String[] args) {
		ClassRoom c=new HsbcCollege();
		c.conductSession();
	
	}
	

}
