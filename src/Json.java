import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import carro.Carro;
import carro.Compacto;
import carro.PickUp;
import carro.Sedan;
import carro.Suv;

public class Json {
	
	Carro uno   = new Compacto("Uno", "Fiat", "Trabalho", "Flex", false);
	
	public Json(){};
	
	public void escreverJson() throws IOException {
	
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