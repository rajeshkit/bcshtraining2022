import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		Scanner s=new Scanner(System.in);
		System.out.println("*********************");
		System.out.println(new java.sql.Date(System.currentTimeMillis()));
		System.out.println("**********************");
		System.out.println("DOB");
		String dob="09-25-1980 11:05:12";
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		Date d= sdf.parse(dob);
		System.out.println("Converted dob: "+d);
		System.out.println(d.compareTo(new Date()));
		
		System.out.println(d.getMonth());
		
		
		System.out.println("*****************************");
		java.util.Date utilDate=new java.util.Date(); 
		System.out.println(utilDate);
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MMMM-yyyy");
		String stringFormatDate = sdf1.format(utilDate);
		System.out.println(stringFormatDate);
		
		
		
		
		
		//Fri Sep 09 16:52:11 IST 2022 
		//  from the user we get date as an string format input 
		// dd-MM-YYYY
		// programmer have to convert from string format to Date format
		
//		java.util.Date utilDate1=new java.util.Date(998565656556L); // 09-09-2022 DD-MM-YYYY
//		System.out.println(utilDate1);

		// 12-12-1990
		// String format u need to convert date format
		// convert string to Date format
//		System.out.println("Enter your DOB:");
//		String dob = s.nextLine(); //dd-MM-YYYY
//		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
//		Date d = sdf.parse(dob);
//		System.out.println(d);
		
	}
}
