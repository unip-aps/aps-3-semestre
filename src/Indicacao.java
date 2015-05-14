import java.util.*;

public class Indicacao {
	int primeiraResposta, segundaResposta, terceiraResposta;
	
	Console console = new Console();
	Scanner ler = new Scanner(System.in);
	boolean continuar = true;

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
	
	public void menuIndicacao() throws InputMismatchException{
		String primeiraPergunta, segundaPergunta, terceiraPergunta;

		primeiraPergunta = "1 - Família\n"
				+ "2 - Trabalho\n"
				+ "3 - Lazer";
		
		segundaPergunta = "1 - Pequena\n"
				+ "2 - Grande";
		
		terceiraPergunta = "1 - Transporte de cargas\n"
				+ "2 - Atendimento";
		
		console.ConsoleTitle("Qual será o uso do veículo?");
		System.out.println("Digite o número da opção que deseja executar");
		System.out.println(primeiraPergunta);
		
		do {
			try {
				setPrimeiraResposta(ler.nextInt());
				
				switch(getPrimeiraResposta()) {
					case 1:
						console.ConsoleTitle("Qual o tamanho da sua família?");
						System.out.println("Digite o número da opção que deseja executar");
						System.out.println(segundaPergunta);
						setSegundaResposta(ler.nextInt());
						
						switch(getSegundaResposta()) {
							case 1:
								console.ConsoleTitle("Carros compactos");
								System.out.println("Esses são os modelos mais indicados para seu perfil:");
								indicacao(0);
								continuar = false;
								break;
							
							case 2:
								console.ConsoleTitle("SUVs ou Sedans");
								System.out.println("Esses são os modelos mais indicados para seu perfil:");
								indicacao(6);
								indicacao(10);
								continuar = false;
								break;
								
							default:
								System.err.println("Você não digitou uma opção válida, tente novamente!");
								continuar = true;
						}
						
						break;
					
					case 2:
						console.ConsoleTitle("Qual o tipo do trabalho?");
						System.out.println("Digite o número da opção que deseja executar");
						System.out.println(terceiraPergunta);
						setTerceiraResposta(ler.nextInt());

						switch(getTerceiraResposta()) {
							case 1:
							console.ConsoleTitle("Pickups");
								System.out.println("Esses são os modelos mais indicados para seu perfil:");
								indicacao(3);
								continuar = false;
								break;
							
							case 2:
								console.ConsoleTitle("Carros compactos");
								System.out.println("Esses são os modelos mais indicados para seu perfil:");
								indicacao(0);
								continuar = false;
								break;
								
							default:
								System.err.println("Você não digitou uma opção válida, tente novamente!");
								continuar = true;
							}
						break;
						
					case 3:
						console.ConsoleTitle("Carros esportivos");
						System.out.println("Esses são os modelos mais indicados para seu perfil:");
						indicacao(12);
						System.out.println("Andar de bike pode ser uma ótima opção para seu lazer :)\n");
						continuar = false;
						break;
						
					default:
						System.err.println("Você não digitou uma opção válida, tente novamente!");
						continuar = true;
				}
			}
			catch (InputMismatchException e){
				System.err.println("Você não digitou uma opção válida, tente novamente!");
				ler.nextLine();
			}
		} while(continuar);
	
	}

	public void indicacao(int segmento) {
		Carros obj = new Carros();
		obj.montarListaDeCarros();

		int tamanhoListaDeCarros = obj.listaDeCarros.size();

		ArrayList <String> carrosIndicados = new ArrayList<String>();

		String lista = "";

		for (int i = 0; i <= tamanhoListaDeCarros - 1; i++) {
			if(obj.listaDeCarros.get(i).getClass() == obj.listaDeCarros.get(segmento).getClass()) {
				carrosIndicados.add(obj.listaDeCarros.get(i).fabricante + " " + obj.listaDeCarros.get(i).modelo);
			}
		}
		
		for (int i = 0; i <= carrosIndicados.size() - 1; i++) {
			lista += "\n - " + carrosIndicados.get(i) + "\n";
		}

		System.out.println(lista);
	}
}
