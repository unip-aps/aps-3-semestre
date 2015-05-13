import java.util.Scanner;
import java.util.ArrayList;

public class Indicacao {
	int primeiraResposta, segundaResposta, terceiraResposta;
	
	Scanner ler = new Scanner(System.in);

	public int getPrimeiraResposta() {
		return primeiraResposta;
	}

	public void setPrimeiraResposta(int primeiraResposta) {
		this.primeiraResposta = primeiraResposta;
	}

	public int getSegundaResposta() {
		return segundaResposta;
	}

	public void setSegundaResposta(int segundaResposta) {
		this.segundaResposta = segundaResposta;
	}

	public int getTerceiraResposta() {
		return terceiraResposta;
	}

	public void setTerceiraResposta(int terceiraResposta) {
		this.terceiraResposta = terceiraResposta;
	}
	
	public void menuIndicacao() {
		String primeiraPergunta, segundaPergunta, terceiraPergunta;

		primeiraPergunta = "Qual será o uso do veículo?\n"
				+ "1- Família\n"
				+ "2- Trabalho\n"
				+ "3- Lazer";
		
		segundaPergunta = "Qual o tamanho da sua família?\n"
				+ "1-) Pequena\n"
				+ "2-) Grande";
		
		terceiraPergunta = "Qual o tipo do trabalho?\n"
				+ "1-) Transporte de cargas\n"
				+ "2-) Atendimento";
		
		System.out.println(primeiraPergunta);
		setPrimeiraResposta(ler.nextInt());
		
		switch(getPrimeiraResposta()) {
			case 1:
				System.out.println(segundaPergunta);
				setSegundaResposta(ler.nextInt());
				
				switch(getSegundaResposta()) {
					case 1:
						System.out.println("Compacto");
						break;
					
					case 2:
						System.out.println("SUV ou Sedan");
						break;
						
					default:
						System.out.println("Inválido");
				}
				
				break;
			
			case 2:
				System.out.println(terceiraPergunta);
				switch(getTerceiraResposta()) {
					case 1:
						System.out.println("Pickup");
						break;
					
					case 2:
						System.out.println("Compacto");
						break;
						
					default:
						System.out.println("Inválido");
					}
				break;
				
			case 3:
				System.out.println("Carro Esportivo");
				break;
				
			default:
				System.out.println("Errrrrooouuu!");
		}
	}

	public void indicacao() {
		Json obj = new Json();
		obj.montarListaDeCarros();
		int tamanhoListaDeCarros = obj.listaDeCarros.size();

		String segmento = "class carro.Compacto";

		ArrayList <String> carrosIndicados = new ArrayList<String>();

		for (int i = 0; i <= tamanhoListaDeCarros - 1; i++) {
			if(obj.listaDeCarros.get(i).getClass() == obj.listaDeCarros.get(0).getClass()) {
				System.out.println(i);
				carrosIndicados.add(obj.listaDeCarros.get(i).modelo);
			}
		}

		System.out.println(carrosIndicados);
	}
}
