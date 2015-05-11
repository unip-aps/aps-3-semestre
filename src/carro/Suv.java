package carro;

public class Suv extends Carro {
	String categoria = "Suv";
	
	public Suv(){};
	
	public Suv(String modelo, String fabricante, String categoria, String combustivel, boolean hibrido){
		super(modelo, fabricante, categoria, combustivel, hibrido);
	}

}