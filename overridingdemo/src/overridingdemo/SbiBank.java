package overridingdemo;

public class SbiBank extends IciciBank{
	
	public void verification() {
		System.out.println("Verification using PAN card");
	}

	public static void main(String[] args) {
		SbiBank i=(SbiBank)new IciciBank();
		i.verification();
		
	}
}
