package fileWritingConcepts;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		
		String location="FileOutputStream.txt";
		String content="Keep learning, keep practice";
		
		
		FileOutputStream fileOutputStream=new FileOutputStream(location);
		byte[] contentbyte= content.getBytes();
		fileOutputStream.write(contentbyte);
		fileOutputStream.close();
	}

}
