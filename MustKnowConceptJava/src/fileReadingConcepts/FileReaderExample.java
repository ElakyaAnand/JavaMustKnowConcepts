package fileReadingConcepts;


import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		
		String location="paths.txt";
		
		FileReader file=new FileReader(location);
		
		BufferedReader buffReader=new BufferedReader(file);
		
		String alllines;
		while((alllines=buffReader.readLine())!=null) {
			
			System.out.println(alllines);
			
		}
		
		buffReader.close();
		

	}

}
