package carro;

public abstract class Carro {
	public String modelo;
	public String fabricante;
	public String categoria;
	public String combustivel;
	public boolean hibrido;
	
	public Carro(){};
	
	public Carro(String modelo, String fabricante, String categoria, String combustivel, boolean hibrido){
		this.modelo       = modelo;
		this.fabricante   = fabricante;
		this.categoria    = categoria;
		this.combustivel  = combustivel;
		this.hibrido      = hibrido;
	}
	
}
