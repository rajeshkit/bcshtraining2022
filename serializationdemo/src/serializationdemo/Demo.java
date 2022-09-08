package serializationdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Customer c1=new Customer();
		c1.setId(100);
		c1.setName("Rajesh");
		c1.setPhone(5686);
		c1.setBalance(500);
		FileOutputStream fos=new FileOutputStream("e:/customer.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c1);
		oos.close();
		c1=null; // gc will recycle c1 memory or object
		
		FileInputStream fis=new FileInputStream("e:/customer.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Customer customer=(Customer)ois.readObject();
		System.out.println(customer.getId()+" "+customer.getName());
		System.out.println(customer.getPhone()+" "+customer.getBalance());
		ois.close();
		
	}
}
