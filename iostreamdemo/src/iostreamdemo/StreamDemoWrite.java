package iostreamdemo;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class StreamDemoWrite {
	public static void main(String[] args) throws IOException {
		Reader r;
		Writer w;
		String data = "hai team hello team how are you dont sleep";
		byte[] b = data.getBytes();
		FileOutputStream fos=new FileOutputStream("e:/hsbctrainee.txt");
		fos.write(b);
		fos.close();
		
		
		
		
		
		
		
		String data1 = "they want leave the session now";
		FileWriter fw=new FileWriter("e:/hsbctrainee1.txt");
		fw.write(data1);
		fw.close();
	}
}
