package userdefinedexception;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) throws InvalidAccountNumberException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the account number");
		String accountNumber = s.nextLine();
		if(accountNumber.length()!=8) {
			
			throw new InvalidAccountNumberException("Account no should be 8 digit!! check account number");
			
		}
		System.out.println("Valid Account number");
	}
}
