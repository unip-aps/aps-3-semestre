public class Consumo{
	
	double autonomia, distancia;
	
	public Consumo(){}
	
	public void menuConsumo() {
		System.out.println("Calculo de Consumo");
		System.out.println("Para realizar calculo de consumo.\n Informe a autonomia do seu veiculo");
		//autonomia = ler.nextDouble();
		System.out.println("Agora, informe a distancia do percurso");
		//distancia =	ler.nextDouble();
		
		//Consumo CalcularConsumo = new Consumo();
		//double consumo = CalcularConsumo.CalcConsumo(autonomia,distancia);
		//System.out.println("O consumo � "+ consumo);
	}
	
	public double CalcConsumo(double autonomia, double distancia){
		
		this.autonomia = autonomia;
		this.distancia = distancia;
		
		double consumo = autonomia * distancia;
		
			return consumo;
		
	}

	
}