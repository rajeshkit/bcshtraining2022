package firstproject;

import java.util.Scanner;

public class Course {
	int courseId; // instance member variable
	String courseName;// instance member variable
	long courseDuration;// instance member variable
	static String department;// static member variable
	void courseDiscount() { // instance function
		int flatDiscount=40;// local variable
		System.out.println("25% Discount");
		System.out.println(courseId);
		System.out.println(Course.department);	
	}
	void contentCoverage() { // instance function
		System.out.println("25% Covered");
		Math.random();
		String.valueOf(true);
		Scanner s=new Scanner(System.in);
		s.nextInt();
	}
	public static void main(String[] args) {
		// static function
		Course c=new Course();//404040
		Course c1=new Course();//404040
		c.contentCoverage();
		c.courseDiscount();
	
	
	}
}
