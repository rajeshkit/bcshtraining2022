package arraysdemo;

public class ArrayDemo {
	public static void main(String[] args) {
		// int a[size];
		// two ways u can declare an array in java
		int[] marks=new int[5];
		marks[0]=57;
		
		int mark[]= {67,35,88,57,89,5};
		float mark1[]= {67,35,88,57,89,5};
		boolean status[]= {true,false,false,true};
		
		String name[]={"hsbc","pune","chennai","delhi"};
		
		Mobile m1=new Mobile();
		m1.setCost(1000);m1.setBrand("oppo");m1.setNetworkType("4G");
		Mobile m2=new Mobile();
		m2.setCost(2000);m2.setBrand("Redmi");m2.setNetworkType("5G");
		Mobile m3=new Mobile();
		m3.setCost(3000);m3.setBrand("Samsung");m3.setNetworkType("5G");
		
		Mobile mobiles[]= new Mobile[3];
		mobiles[0]=m1;
		mobiles[1]=m2;
		mobiles[2]=m3;
	}
}
