package firstproject;

public class Department {
	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.getEmployeeId());
		e.setEmployeeId(400);
		System.out.println(e.getEmployeeId());
	}
}
