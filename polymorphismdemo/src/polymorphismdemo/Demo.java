package polymorphismdemo;

class Demo extends OverloadingDemo{
	// 5 methods
	public int add(int number1,int number2,int number3) {
		return number1+number2;
	}
	public int add(int number1,int number2,int number3,int number4) {
		return number1+number2;
	}
	public static void main(String[] args) {
		Demo o=new Demo();
		o.add(678, 8);
		o.add();
		o.add(4, 56, 56);
		o.add(56, 677, 78, 78);
	}
}