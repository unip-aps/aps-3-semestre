package carro;

public class Sedan extends Carro {
	String categoria = "Sedan";
	
	public Sedan(){};
	
	public Sedan(String modelo, String fabricante, String categoria, String combustivel, boolean hibrido){
		super(modelo, fabricante, categoria, combustivel, hibrido);
	}
}