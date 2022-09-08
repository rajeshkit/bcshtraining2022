package iostreamdemo;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ByteStreamDemo {
	public static void main(String[] args) throws IOException {
		// FileInputStream fis is a object byte oriented stream
		FileInputStream fis=new FileInputStream("e:/log.out");
		
		int data=0;
		while((data=fis.read())!=-1) {
			System.out.print((char)data);
		}
		fis.close();
		
		// FileReader fr is a object character oriented stream
		FileReader fr=new FileReader("e:/log.out");
		while((data=fr.read())!=-1) {
			System.out.print((char)data);
		}
		
		fr.close();	
	}
}
