package carro;

public class PickUp extends Carro {
	String categoria = "Pick-up";
	
	public PickUp(){};
	
	public PickUp(String modelo, String fabricante, String categoria, String combustivel, boolean hibrido){
		super(modelo, fabricante, categoria, combustivel, hibrido);
	}

}