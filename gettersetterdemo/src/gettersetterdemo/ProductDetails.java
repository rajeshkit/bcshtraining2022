package gettersetterdemo;


import java.util.Scanner;

public class ProductDetails {
	int productId;
	String productName;
	long cost;
	String membershipType;
	String dealerName;
	public void prepareBill() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the product ID");
		productId = s.nextInt();
		s.nextLine();
		System.out.println("Enter the product Name");
		productName = s.nextLine();
		System.out.println("Enter the product cost");
		cost = s.nextLong();
		s.nextLine();
		System.out.println("Enter the memebership type");
		membershipType = s.nextLine();
		System.out.println("Enter the dealer Name");
		dealerName = s.nextLine();
		Discount d=new Discount();
		long discountedPrice=d.calculateDiscount(productId, productName, cost, membershipType, dealerName);
		long finalBillAmount = cost-discountedPrice;
		System.out.println("The Final Bill is:"+ finalBillAmount);
		s.close();
		
	}
	public static void main(String[] args) {
		ProductDetails pd=new ProductDetails();
		pd.prepareBill();
	}

}
