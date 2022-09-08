package firstproject;

import java.util.Scanner;

public class Customer {
	int bankCustomerId;
	String name;
	long telephoneNumber;
	String email;
	private int phone;
	private int id;
	void applySavingsAccount() {
		System.out.println("Customer account applied");
	}
	void doWithdrawl() {
		System.out.println("Customer withdrawl");
	}
	void doDeposit() {
		System.out.println("Customer deposited");
	}
	public static void main(String[] args) {
		
		String s=new String();
		Customer c1=new Customer();
		c1.id=100;
		c1.name="rahul";
		c1.phone=454555;
		c1.email="rahul@gmail.com";
	
		Customer c2=new Customer();
		c2.id=200;
		c2.name="vinith";
		c2.phone=7989;
		c2.email="vinith@gmail.com";
	}
}
