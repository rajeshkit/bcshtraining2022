package abstratctiondemo;

public class PunePassportOffice implements PassportOffice{

	@Override
	public void applyPassport() {
		// TODO Auto-generated method stub
		System.out.println("Offline application");
	}

	@Override
	public void scheduleAppointment() {
		// TODO Auto-generated method stub
		System.out.println("Scheduling offline");
	}

	@Override
	public void verification() {
		// TODO Auto-generated method stub
		System.out.println("Pan Card for verification");
	}
	

}
