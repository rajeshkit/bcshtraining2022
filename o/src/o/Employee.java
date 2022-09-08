package o;

public class Employee {
	int employeeId;
	String name;
	String phone;
	public void setProfile(int eId,String name,String phone) {
		employeeId = eId;
		this.name = name;
		this.phone = phone;
		//logic 
	}
	public void displayProfile() {
		System.out.println(employeeId);
		System.out.println(name);
	}
	public int caclulateSalary(int basic, int hra,int da) {
		return basic+hra+da;
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		int salary=e.caclulateSalary(4545, 566, 355);
		int finalSalary = salary *20 /200;
		System.out.println("Salary Before Increment"+salary);
		System.out.println("Salary After Increment"+finalSalary);
	}
}

