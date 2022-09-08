package abstratctiondemo;

public abstract class MumbaiPassportOffice implements PassportOffice {
	@Override
	public void applyPassport() {
		System.out.println("online application");
		
	}

	

	@Override
	public void verification() {
		// TODO Auto-generated method stub
		System.out.println("Aadhar card for verification");
		
	}

}
