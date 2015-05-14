import java.util.*;

public class Menu{
	
	Indicacao opIndicacao = new Indicacao();
	Consumo opConsumo     = new Consumo();
	Curiosidade opCuriosidade = new Curiosidade();
		
	public void menu() throws InputMismatchException{
		Scanner ler = new Scanner(System.in);
		Console console = new Console();

		int opcao;

		// Criando menu
		console.ConsoleTitle("Bem vindo ao Indicar!");
		System.out.println("Digite o número da opção que deseja executar");

		System.out.println("1 - Saiba o carro ideal para você");
		System.out.println("2 - Faça o calculo de consumo do seu carro");
		System.out.println("3 - Saiba algumas curiosidades");
		System.out.println("4 - Sair do Programa");

		boolean continuar = true;
	
		do {
			try{
				opcao = ler.nextInt();
		
				switch (opcao){
					case 1:
						opIndicacao.menuIndicacao();
						continuar = false;
						break;
						
					case 2:
						opConsumo.MenuConsumo();
						continuar = false;
						break;
						
					case 3:
						opCuriosidade.menuCuriosidades();
						continuar = false;
						break;
					
					case 4:
						System.exit(0);
						
					default:		
						System.out.println("Você não digitou uma opção válida, tente novamente!");
						continuar = true;
				}
			}
			catch (InputMismatchException e){
				System.err.println("Você não digitou uma opção válida, tente novamente!");
				ler.nextLine();
			}
		}
		while(continuar);
	}
}