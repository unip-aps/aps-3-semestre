package carro;

public class PickUp extends Carro {
	String categoria = "Pick-up";
	
	public PickUp(){};
	
	public PickUp(String modelo, String segmento, String fabricante, String categoria, double preco){
		super(modelo, segmento, fabricante, categoria, preco);
	}

}