package carro;
//import java.util.ArrayList;

public abstract class Carro {
	String modelo;
	String fabricante;
	String categoria;
	double preco;
	
	public Carro(){};
	
	public Carro(String modelo, String segmento, String fabricante, String categoria, double preco){
		this.modelo     = modelo;
		this.fabricante = fabricante;
		this.categoria  = categoria;
		this.preco      = preco;
	}
	
}
