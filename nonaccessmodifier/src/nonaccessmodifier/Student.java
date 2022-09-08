package nonaccessmodifier;

public class Student {
	public static final int studentId=10;// instance variable - Heap memory
	public static synchronized void getDepartmentDetails() {
		Department d=new Department();
		System.out.println(d.departmentName);
		//d.makeThemStudent();
	
		d.discipline();
	}
}
