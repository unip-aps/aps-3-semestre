import java.util.Scanner;

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
	
	public void indicacao(){
		String primeiraPergunta, segundaPergunta, terceiraPergunta;

		primeiraPergunta = "Qual será o uso do veículo?";
		segundaPergunta = "Qual o tamanho da sua família?";
		terceiraPergunta = "Qual o tipo do trabalho?";
		
		System.out.println(primeiraPergunta);
		
	}
}
