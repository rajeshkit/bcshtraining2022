package exceptiondemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
	public void doTest() throws IOException   {
		
		System.out.println("Demo class");
		System.out.println("Pune");
		
		
		try(FileReader fr1=new FileReader("c:/welcome.txt");
				Scanner s=new Scanner(System.in);){
			Demo d=new Demo();
			
			fr1.read();
			
			int k=10/0;	
			int[] j=new int[2];
			j[8]=56;
		} 
		catch (ArithmeticException |ArrayIndexOutOfBoundsException |IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	public static void main(String[] args) throws IOException {
		Demo d=new Demo();
		d.doTest();
		System.out.println("main method 1");
		System.out.println("main method 2");
	}
}
