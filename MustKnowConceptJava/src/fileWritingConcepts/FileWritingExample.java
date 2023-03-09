package fileWritingConcepts;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritingExample {

	public static void main(String[] args) throws IOException {
		
		
		String location="FileWriting.txt";
		String content="Keep Learning";
		
		FileWriter fileWriter=new FileWriter(location);
		fileWriter.write(content);
		fileWriter.close();

	}

}
