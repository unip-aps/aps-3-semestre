package carro;

public class Esportivo extends Carro {
	String categoria = "Esportivo";
	
	public Esportivo(){};
	
	public Esportivo(String modelo, String fabricante, String categoria, String combustivel, boolean hibrido){
		super(modelo, fabricante, categoria, combustivel, hibrido);
	}

}