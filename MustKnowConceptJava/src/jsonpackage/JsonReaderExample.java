package jsonpackage;


import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReaderExample {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader file=new FileReader("Jsonwriter.json");

		JSONParser jsonparse=new JSONParser();

		Object parsedobject= jsonparse.parse(file);

		JSONObject jsonobject=(JSONObject) parsedobject;
		String name=	(String) jsonobject.get("Name");
		Long age= (Long) jsonobject.get("Age");
		
		System.out.println("The name is "+ name);
		System.out.println("The age is "+ age);
		
		
		JSONArray jsonarray= (JSONArray) jsonobject.get("Qualities");
		Iterator iterator= jsonarray.iterator();
		while(iterator.hasNext())
		{
			System.out.println( "The Special qualities are "+iterator.next());
		}

	}

}
