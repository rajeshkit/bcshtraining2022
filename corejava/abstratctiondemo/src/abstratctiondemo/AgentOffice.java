package abstratctiondemo;

public class AgentOffice {
	public static void main(String[] args) {
		PassportOffice po1=new PunePassportOffice();
		po1.applyPassport();po1.scheduleAppointment();po1.verification();
	
	}
}
