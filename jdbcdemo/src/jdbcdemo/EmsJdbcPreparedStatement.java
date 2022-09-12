package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmsJdbcPreparedStatement {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// registerEmployee();
		// getAllEmployees();
		// deleteEmployeeById();
		// updateEmployeeById();
	}

	private static void updateEmployeeById() throws SQLException {
		String url = "jdbc:derby:C:/Users/rajesh/airline";
		Connection connect=DriverManager.getConnection(url);
		PreparedStatement pstmt=
				connect.prepareStatement("update employee set salary=?,name=?,doj=? where id=?");
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
		
		// prepared statement setting value
		pstmt.setInt(1, employeeSalary);
		pstmt.setString(2, employeeName);
		pstmt.setString(3, doj);
		pstmt.setInt(4, employeeId);
		int result = 
				pstmt.executeUpdate();
		if(result!=0) {
			System.out.println("Employee Details updated successfully");
			getAllEmployees();
		}else {
			System.out.println("Employee Details not updated");
		}
		s.close();
	}

	private static void deleteEmployeeById() throws SQLException {
		Scanner s=new Scanner(System.in);
		String url = "jdbc:derby:C:/Users/rajesh/airline";
		Connection connect=DriverManager.getConnection(url);
		PreparedStatement pstmt=connect.prepareStatement("delete from employee where id=?");
		System.out.println("Enter the employee id want to delete");
		int eId = s.nextInt();
		pstmt.setInt(1, eId);
		int result=pstmt.executeUpdate();
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
//		PreparedStatement stmt = connect.prepareStatement("INSERT INTO employee VALUES(" + employeeId + ",'" + employeeName + "'," + employeeSalary
//				+ ",'" + doj + "')");
		PreparedStatement pstmt = connect.prepareStatement("INSERT INTO employee VALUES(?,?,?,?)");
		pstmt.setInt(1, employeeId);
		pstmt.setString(2, employeeName);
		pstmt.setInt(3, employeeSalary);
		pstmt.setString(4, doj);
		pstmt.executeUpdate();
		connect.close();
	}
}
