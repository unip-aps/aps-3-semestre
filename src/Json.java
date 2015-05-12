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
		
	Carro uno   = new Compacto("Uno", "Fiat", "Trabalho", "Flex", false);
	Carro gol   = new Compacto("VW Gol", "Ford Ka", "CASAIS","Flex", false);
	Carro palio = new Compacto("Fiat Palio", "Chevrolet Agile", "Jovens", "Flex", false);
	
	Carro montana  = new PickUp("Montana", "Chevrolet", "Flex", false);
	Carro ranger   = new PickUp("Ranger", "Ford", "CASAIS","Flex", false);
	Carro hilux    = new PickUp("Hilux", "Toyota", "Jovens", "Flex", false);
	
	Carro fusion = new Sedan("Fusion", "Ford", "Flex", false);
	Carro a6     = new Sedan("A6", "Audi", "CASAIS","Flex", false);
	Carro accord = new Sedan("Accord", "Honda", "Jovens", "Flex", false);
	
	Carro ecosport   = new Suv("Ecosport","Ford", "Flex", false);
	Carro santa_fe   = new Suv("Santa Fe", "Hyundai", "CASAIS","Flex", false);
	Carro palio      = new Suv("Fiat Palio", "Chevrolet Agile", "Jovens", "Flex", false);
	
	Carro focus   = new Esportivo("Focus", "Ford" , "Flex", false);
	Carro sandero = new Esportivo("Sandero", "Renault", "CASAIS","Flex", false);
	Carro astra   = new Esportivo("Astra", "Chevrolet", "Jovens", "Flex", false);

	public void montarListaDeCarros() {
		listaDeCarros.add(uno);
		listaDeCarros.add(gol);
		listaDeCarros.add(agile);
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