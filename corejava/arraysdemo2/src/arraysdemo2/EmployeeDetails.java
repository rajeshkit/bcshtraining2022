package arraysdemo2;

import java.util.Iterator;
import java.util.Scanner;

public class EmployeeDetails {
	public void createEmployeeList() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of employess");
		int noOfEmployees =s.nextInt();
		Employee[] list= new Employee[noOfEmployees];
		for (int i = 0; i < noOfEmployees; i++) {
			Employee e1=new Employee();//606060
			System.out.println("Enter the employee ID:");
			e1.setEmployeeId(s.nextInt());
			s.nextLine();
			System.out.println("Enter the employee Name");
			e1.setEmployeeName(s.nextLine());
			System.out.println("Enter the employee Salary");
			e1.setEmployeeSalary(s.nextLong());
			s.nextLine();
			System.out.println("Enter the employement Type");
			e1.setEmployeeType(s.nextLine());
			list[i]=e1;	
		}
		
		EmployeeCatagory.findEmployementType(list);
	}
	public static void main(String[] args) {
		EmployeeDetails ed=new EmployeeDetails();
		ed.createEmployeeList();
	}
}
