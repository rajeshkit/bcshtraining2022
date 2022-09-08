package gettersetterdemo;

public class TraineeManagementSystem {
	public static void main(String[] args) {
		Trainee t1=new Trainee();
		t1.setDesignation("developer");
		t1.setSalary(45657);
		t1.setTraineeId(4575);
		t1.setTraineeName("Ajay");
		System.out.println(t1.getTraineeName());
		System.out.println(t1.getDesignation());
		System.out.println(t1.getSalary());
		System.out.println(t1.getTraineeId());
	}

}
