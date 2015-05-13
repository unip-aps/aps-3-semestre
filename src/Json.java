import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import carro.Carro;
import carro.Compacto;
import carro.PickUp;
import carro.Sedan;
import carro.Suv;

public class Json {

	public ArrayList <Carro> listaDeCarros = new ArrayList<Carro>();

	public void montarListaDeCarros() {
		listaDeCarros.add(uno);
		listaDeCarros.add(gol);
		listaDeCarros.add(palio);
	}

	// public void escreverJson() throws IOException {
			
	// 	JSONObject obj = new JSONObject();
		
	// 	obj.put("modelo", listaDeCarros.get(0).modelo);
	// 	obj.put("modelo", listaDeCarros.get(1).modelo);
		
	// 	System.out.println(obj);
		
	// 	FileWriter file = new FileWriter("db.json");
		
	// 	try {
	// 		file.write(obj.toJSONString());
	// 	} catch (IOException e) {
	// 		e.printStackTrace();
	// 	} finally {
 //            file.flush();
 //            file.close();
 //        }
	// }
}