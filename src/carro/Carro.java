package carro;

public abstract class Carro {
	String modelo;
	String fabricante;
	String categoria;
	String combustivel;
	boolean hibrido;
	
	public Carro(){};
	
	public Carro(String modelo, String fabricante, String categoria, String combustivel, boolean hibrido){
		this.modelo       = modelo;
		this.fabricante   = fabricante;
		this.categoria    = categoria;
		this.combustivel  = combustivel;
		this.hibrido      = hibrido;
	}
	
}
