package carro;

public class Suv extends Carro {
	String categoria = "Suv";
	
	public Suv(){};
	
	public Suv(String modelo, String segmento, String fabricante, String categoria, double preco){
		super(modelo, segmento, fabricante, categoria, preco);
	}

}