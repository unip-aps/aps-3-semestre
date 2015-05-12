public class Menu{
	
	Indicacao opIndicacao = new Indicacao();
	Consumo opConsumo     = new Consumo();
		
	public void menu(int op) {
	
		switch (op){
	    	case 1:
	    		System.out.println("Me Indique um carro");
	    		break;
	    		
	    	case 2:
	    		opConsumo.MenuConsumo();
	    		break;
	    		
	    	case 3:
	    		
	    		break;
	    		
	    	default:		
	    		System.out.print("Oops ! Opção invalida");
	
		}
	}
}
