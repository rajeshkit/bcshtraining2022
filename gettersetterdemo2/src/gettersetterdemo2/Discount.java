package gettersetterdemo2;

public class Discount {
	public int calculateDiscount(Mobile mobile) {
		int discount = 0;
		if(mobile.getCost()>1000 && mobile.getCost()<10000) {
			return discount = mobile.getCost()*10/100;
		}
		if(mobile.getCost()>10000 && mobile.getCost()<20000) {
			return discount = mobile.getCost()*20/100;
		}
		if(mobile.getCost()>30000) {
			return discount = mobile.getCost()*30/100;
		}
		return discount;
	}
}	
