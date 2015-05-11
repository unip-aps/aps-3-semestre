import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Console console = new Console();

		int opcao;

		//Criando menu
		console.ConsoleTitle("Bem vino ao Indicar!");
		System.out.println("Digite o número da opção que deseja executar.");

		System.out.println("1 - Saiba o carro idal para você.");
		System.out.println("2 - Faça o calculo de consumo do seu carro.");
		System.out.println("3 - Saiba algumas curiosidades.");

		opcao = ler.nextInt();

		//Chamando menu
		Menu menu = new Menu();
		menu.menu(opcao);


	}
}