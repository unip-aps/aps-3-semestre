import java.util.Scanner;
import java.util.*;

public class Menu{
	
	Indicacao opIndicacao = new Indicacao();
	Consumo opConsumo     = new Consumo();
	Curiosidade opCuriosidade = new Curiosidade();
		
	public void menu() {
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

		opcao = ler.nextInt();
		
		try{
			switch (opcao){
				case 1:
					opIndicacao.menuIndicacao();
					break;
					
				case 2:
					opConsumo.MenuConsumo();
					break;
					
				case 3:
					opCuriosidade.menuCuriosidades();
					break;
				case 4:
					System.exit(0);
					
				default:		
					System.out.print("Oops ! Opção invalida");
			}

		}
		catch (NumberFormatException e){
			System.out.println("-----> Please try entering a valid number(s) <-----");
		}
		catch (InputMismatchException e){
			System.out.println("-----> Please try entering a valid number(s) <-----");
		}
		catch (Exception e) {
			System.out.println ("Exceção:");
		}
	}
}