//import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class App {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		JSONObject obj = new JSONObject();
		obj.put("Nome", "Victor");
		obj.put("Autor", "Miguez");
		
		JSONArray company = new JSONArray();
		company.add("Company: eBay");
		
		obj.put("Company List", company);
		
		System.out.println(obj);
		
		FileWriter file = new FileWriter("db.json");
		
		try {
			file.write(obj.toJSONString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
