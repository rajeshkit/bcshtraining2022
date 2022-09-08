package synchronizeddemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainDemo {

	public static void main(String args[]) {
		Iterable itr;
		Collection col;
		Power obj = new Power();// only one object
		Thread1 p1 = new Thread1(obj);
		Thread2 p2 = new Thread2(obj);
		p1.start();
		p2.start();
		
		
		Integer i;
		Float f;
		Byte b;
		Short s;
		Long l;
		Character c;
		Double d;
		Boolean b1;
		
		//46,656,54,78,89 - primitive type
		int a=46;
		Integer ca=new Integer(a); // Boxing
		Integer ca1=Integer.valueOf(46);// Boxing
		
		int b11=656;
		Integer ba=new Integer(b11); // Boxing
		Integer ba1=Integer.valueOf(46);// Boxing
		
		int c1=54;
		Integer ca11=new Integer(c1); // Boxing
		Integer ca12=Integer.valueOf(46);// Boxing
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(ca1);
		list.add(ba1);
		list.add(ca12);
		
	}

}
