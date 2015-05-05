package carro;

public class Sedan extends Carro {
	String categoria = "Sedan";
	
	public Sedan(){};
	
	public Sedan(String modelo, String segmento, String fabricante, String categoria, double preco){
		super(modelo, segmento, fabricante, categoria, preco);
	}

}