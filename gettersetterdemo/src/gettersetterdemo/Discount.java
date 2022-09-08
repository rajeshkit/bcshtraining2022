package gettersetterdemo;

public class Discount {
	public long calculateDiscount(int pId,String pName,long pCost,
			String mType,String dName) {
		long discount = 0;
		if(pCost>1000 && pCost<10000) {
			discount = pCost*10/100;
		}
		if(pCost>10000 && pCost<20000) {
			discount = pCost*20/100;
		}
		if(pCost>20000) {
			discount = pCost*30/100;
		}
		return discount;
		
	}
	public long calculateDiscountByCost(Product product) {
		long discount = 0;
		if(product.getCost()>1000 && product.getCost()<10000) {
			discount = product.getCost()*10/100;
		}
		if(product.getCost()>10000 && product.getCost()<20000) {
			discount = product.getCost()*20/100;
		}
		if(product.getCost()>20000) {
			discount = product.getCost()*30/100;
		}
		return discount;
		
	}
}
