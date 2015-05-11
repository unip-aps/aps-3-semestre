import java.util.Scanner;
import java.util.regex.Pattern;
import java.text.DecimalFormat;  

public class Consumo{
	
	String sAutonomia, sDistancia, opcaoMenu;
	double dAutonomia, dDistancia;

	Scanner ler = new Scanner(System.in);
	Console console = new Console();
	
	public Consumo(){}
	
	public void MenuConsumo() {

		opcaoMenu = "Calculo de Consumo";

		//Limpa o Console	
		console.ConsoleTitle(opcaoMenu);

		System.out.println("Para realizar calculo de consumo.");
		System.out.println("Informe a autonomia do seu veiculo (Em Km por litro).");
		sAutonomia = ler.next();

		console.ConsoleTitle(opcaoMenu);
		System.out.println("Agora, informe a distancia do percurso (Em Km)");
		sDistancia = ler.next();


		if (sAutonomia.matches("[0-9]*,*[0-9]*.*[0-9]") && sDistancia.matches("[0-9]*,*[0-9]*.*[0-9]")){

			//Convertendo para double
			dAutonomia = console.ConvertToDouble(sAutonomia);
			dDistancia = console.ConvertToDouble(sDistancia);

			//Calcula o consumo
			double consumo = CalcConsumo(dAutonomia, dDistancia);

			//Mostra para usuario
			console.ConsoleTitle(opcaoMenu);
			System.out.println("Para percorrer " + dDistancia + "Km com o seu carro, você vai gastar " + console.StringDecimal(consumo) + " litros de combustivel.");
				
		}else{

			
			console.ConsoleTitle(opcaoMenu);
			System.out.println("Oops! Parace que você colocou alguns valores que não são válidos.\nAperte enter para começar denovo");
			
			String readString = ler.nextLine();

			if (ler.hasNextLine()){

				MenuConsumo();

			}else{

	            readString = null;

			}

		}

	}

	public double CalcConsumo(double dAutonomia, double dDistancia){
		
		this.dAutonomia = dAutonomia;
		this.dDistancia = dDistancia;
		
		double consumo = dDistancia / dAutonomia;
		
		return consumo;
		
	}
	
}