package in.hsbc.card;

public class DebitCard {
	void estimateExisitingCard() {
		CreditCard cc=new CreditCard();
		System.out.println(cc.balance);
		cc.getCardType();
	}
}
