package carro;

public class Compacto extends Carro {
	String categoria = "Compacto";
	
	public Compacto(){};
	
	public Compacto(String modelo, String fabricante, String categoria, String combustivel, boolean hibrido){
		super(modelo, fabricante, categoria, combustivel, hibrido);
	}

}