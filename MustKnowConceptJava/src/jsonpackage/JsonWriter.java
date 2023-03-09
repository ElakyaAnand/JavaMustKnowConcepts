package jsonpackage;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriter {

	public static void main(String[] args) throws IOException {
		
		
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("Name", "Dayalan");
		jsonObject.put("Age", 1);
		
		JSONArray jsonArray=new JSONArray();
		jsonArray.add("KindHeart");
		jsonArray.add("sensitive");
		
		
		jsonObject.put("Qualities", jsonArray);
		
		
		FileWriter fileWriter=new FileWriter("Jsonwriter.json");
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();
		
		
		

	}

}
