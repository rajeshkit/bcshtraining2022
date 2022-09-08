package arraysdemo2;

public class EmployeeCatagory {
	public static void findEmployementType (Employee[] emp) {
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].getEmployeeId());
			System.out.println(emp[i].getEmployeeName());
			System.out.println(emp[i].getEmployeeSalary());
			System.out.println(emp[i].getEmployeeType());
			System.out.println("**************************");
		}
		for (Employee employee : emp) {
			System.out.println(employee.getEmployeeId());
			System.out.println(employee.getEmployeeName());
			System.out.println(employee.getEmployeeSalary());
			System.out.println(employee.getEmployeeType());
			System.out.println("**************************");
		}
		
	}

}
