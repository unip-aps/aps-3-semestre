
import java.util.*;
import carro.*;

public class Carros {

	public ArrayList <Carro> listaDeCarros = new ArrayList<Carro>();
		
	Carro uno   = new Compacto("Uno", "Fiat", "Trabalho", "Flex", false);
	Carro gol   = new Compacto("Gol", "Volkswagen", "Familia","Flex", false);
	Carro palio = new Compacto("Palio", "Fiat", "Trabalho", "Flex", false);
	
	Carro montana  = new PickUp("Montana", "Chevrolet", "Trabalho", "Flex", false);
	Carro ranger   = new PickUp("Ranger", "Ford", "Trabalho","Disel", false);
	Carro hilux    = new PickUp("Hilux", "Toyota", "Familia", "Flex", false);
	
	Carro fusion = new Sedan("Fusion", "Ford", "Familia", "Flex", true);
	Carro a3     = new Sedan("A3", "Audi", "Familia","Flex", true);
	Carro accord = new Sedan("Accord", "Honda", "Familia", "Flex", false);
	
	Carro ecosport = new Suv("Ecosport", "Ford", "Familia", "Flex", false);
	Carro santa_fe = new Suv("Santa Fe", "Hyundai", "Familia","Flex", false);
	
	Carro focus_rs = new Esportivo("Focus RS", "Ford" , "Diversão", "Flex", false);
	Carro turboS   = new Esportivo("Turbo S", "Porsche", "Diversão","Gazolina", false);
	Carro m   	   = new Esportivo("1M", "BMW", "Diversão", "Gazolina", false);

	public void montarListaDeCarros() {
		listaDeCarros.add(uno);
		listaDeCarros.add(gol);
		listaDeCarros.add(palio);
		listaDeCarros.add(montana);
		listaDeCarros.add(ranger);
		listaDeCarros.add(hilux);
		listaDeCarros.add(fusion);
		listaDeCarros.add(a3);
		listaDeCarros.add(accord);
		listaDeCarros.add(ecosport);
		listaDeCarros.add(santa_fe);
		listaDeCarros.add(focus_rs);
		listaDeCarros.add(turboS);
		listaDeCarros.add(m);
	}
}