import java.util.regex.Pattern;
import java.text.DecimalFormat;

public class Console{
	
	String toDot;
	double toDouble;


	public Console(){}

	public void ClearConsole(){

		final String ANSI_CLS = "\u001b[2J";
		final String ANSI_HOME = "\u001b[H";
		System.out.print(ANSI_CLS + ANSI_HOME);
		System.out.flush();
	}

	public void ConsoleTitle(String texto){

		ClearConsole();
		System.out.println("=== " + texto + " ===");

	}

	public String ConvertToDot(String texto){

		toDot = texto.replaceAll(",", ".");
		return toDot;

	}

	public double ConvertToDouble(String texto){

		return Double.parseDouble(ConvertToDot(texto));

	}

	public String StringDecimal(double numero){
		return String.format("%.2f", numero);  
	}

	public boolean OnlyNumbers(String texto){

		if(texto.matches("[0-9]*,*[0-9]*.*[0-9]") && texto.length() > 1){

			return true;

		}else{

			return false;

		}

	}

}