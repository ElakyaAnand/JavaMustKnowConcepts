package fileWritingConcepts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsExample {

	public static void main(String[] args) throws IOException {
		
		
		String location="paths.txt";
		String content="Keep learning, keep practice, Keep hope";
		
		Path path=	Paths.get(location);
		Files.write(path, content.getBytes());
		

	}

}
