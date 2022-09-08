package gettersetterdemo2;

import java.util.Scanner;

public class MobileDetails {
	
	public void getDiscount() {
		Scanner s=new Scanner(System.in);
		
		Mobile m=new Mobile(); // getter setter class object
		
		System.out.println("Enter the Mobile cost");
		m.setCost(s.nextInt());// setting the cost
		System.out.println("Enter the Mobile Model");
		m.setModel(s.nextLine());// setting the model
		System.out.println("Enter the Mobile Brand");
		m.setBrand(s.nextLine());// setting the brand
		System.out.println("Enter the Mobile network type");
		m.setNetworkType(s.nextLine());// setting the nt
		
		Discount d=new Discount();
		int finalCost = m.getCost() - d.calculateDiscount(m);
		System.out.println(finalCost);
	}
	public static void main(String[] args) {
		MobileDetails md=new MobileDetails();
		md.getDiscount();
	}
}
