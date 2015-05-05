package carro;

public class Compacto extends Carro {
	String categoria = "Compacto";
	
	public Compacto(){};
	
	public Compacto(String modelo, String segmento, String fabricante, String categoria, double preco){
		super(modelo, segmento, fabricante, categoria, preco);
	}

}