package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmsJdbcStatement {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// registerEmployee();
		// getAllEmployees();
		// deleteEmployeeById();
		// updateEmployeeById();
	}

	private static void updateEmployeeById() throws SQLException {
		String url = "jdbc:derby:C:/Users/rajesh/airline";
		Connection connect=DriverManager.getConnection(url);
		Statement stmt=connect.createStatement();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the employee ID you want to update");
		int employeeId = s.nextInt();
		System.out.println("Enter the employee new salary:");
		int employeeSalary = s.nextInt();
		s.nextLine();
		System.out.println("Enter the employee new name:");
		String employeeName = s.nextLine();
		System.out.println("Enter the employee new DOJ(YYYY-MM-DD)");
		String doj = s.nextLine();
		int result = 
				stmt.executeUpdate("update employee set salary="+employeeSalary+",name='"+employeeName+"',doj='"+doj+"' where id="+employeeId+"");
		if(result!=0) {
			System.out.println("Employee Details updated successfully");
			getAllEmployees();
		}else {
			System.out.println("Employee Details not updated");
		}
	}

	private static void deleteEmployeeById() throws SQLException {
		Scanner s=new Scanner(System.in);
		String url = "jdbc:derby:C:/Users/rajesh/airline";
		Connection connect=DriverManager.getConnection(url);
		Statement stmt=connect.createStatement();
		System.out.println("Enter the employee id want to delete");
		int eId = s.nextInt();
		int result=stmt.executeUpdate("delete from employee where id="+eId+"");
		System.out.println("result value: "+result);
		if(result!=0) {
			System.out.println("Employee with id "+eId+" details deleted");
		}else {
			System.out.println("Employee with id "+eId+" does not exists in the DB");
		}
		connect.close();
		s.close();
	}

	private static void getAllEmployees() throws SQLException {
		String url = "jdbc:derby:C:/Users/rajesh/airline";
		Connection connect = DriverManager.getConnection(url);
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employee");
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getDate(4));
		}
		connect.close();
	}

	private static void registerEmployee() throws SQLException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee Details");
		System.out.println("Enter the employee ID: ");
		int employeeId = s.nextInt();
		System.out.println("Enter the employee salary:");
		int employeeSalary = s.nextInt();
		s.nextLine();
		System.out.println("Enter the employee name:");
		String employeeName = s.nextLine();
		System.out.println("Enter the employee DOJ(YYYY-MM-DD)");
		String doj = s.nextLine();
		String url = "jdbc:derby:C:/Users/rajesh/airline";
		Connection connect = DriverManager.getConnection(url);
		Statement stmt = connect.createStatement();
		stmt.executeUpdate("INSERT INTO employee VALUES(" + employeeId + ",'" + employeeName + "'," + employeeSalary
				+ ",'" + doj + "')");
		connect.close();
	}
}
