import java.io.IOException;
import java.util.regex.*;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{

		Scanner ler = new Scanner(System.in);
		Console console = new Console();

		int opcao;

		// Criando menu
		console.ConsoleTitle("Bem vindo ao Indicar!");
		System.out.println("Digite o número da opção que deseja executar.");

		System.out.println("1 - Saiba o carro ideal para você.");
		System.out.println("2 - Faça o calculo de consumo do seu carro.");
		System.out.println("3 - Saiba algumas curiosidades.");

		opcao = ler.nextInt();

		//Chamando menu
		Menu menu = new Menu();
		menu.menu(opcao);

	}
}