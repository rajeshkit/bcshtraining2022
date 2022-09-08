package gettersetterdemo;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductDetails1 {
	
	public void prepareBill() {
		Scanner s=new Scanner(System.in);
		Product p=new Product();
	
		int id=s.nextInt();
		
		
		Discount d=new Discount();
		long discountedPrice=d.calculateDiscountByCost(p);
		long finalBillAmount = p.getCost()-discountedPrice;
		System.out.println("The Final Bill is:"+ finalBillAmount);
		s.close();
		
	}
	public static void main(String[] args) {
		ProductDetails1 pd=new ProductDetails1();
		pd.prepareBill();
	}

}
