package fileWritingConcepts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException {
		
		String location="BufferedWriter.txt";
		String content="Keep Learning... Consistency is important for learning";
		
		FileWriter filewriter=new FileWriter(location);
		BufferedWriter buffWriter=new BufferedWriter(filewriter);
		buffWriter.write(content);
		buffWriter.close();

	}

}
