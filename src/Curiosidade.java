import java.util.Scanner;
public class Curiosidade{

	Console console = new Console();

	private String nome,tipo, vantagem, desvantagem,causa;
	
	public Curiosidade(){}
	
	public Curiosidade(String nome,String vantagem,String desvantagem,String causa){
		this.nome = nome;
		this.vantagem = vantagem;
		this.desvantagem = desvantagem;
		this.causa = causa;			
	}
	
	public void menuCuriosidades(){
		int op;
		Scanner ler = new Scanner(System.in);
    	console.ConsoleTitle("Curiosidades sobre carros");
    	System.out.println("Digite o número da opção que deseja executar");

    	System.out.println("1 - Compacto");
		System.out.println("2 - Pick-Up");
    	System.out.println("3 - Sedan");
    	System.out.println("4 - Suv");
    	System.out.println("5 - Esportivo");
    	
    	op = ler.nextInt();
    	Curiosidade Carros;
    	
    	switch(op){ 
    		
    		case 1: console.ConsoleTitle("Carro Compacto");
    			Carros = new Curiosidade("Compacto", " O carro é ideal para quem busca economia, comodidade e segurança. Eles também são bastante econômicos, consumindo menos combustível, e a grande maioria possui motor bicombustível.", "Contrapartida, os automóveis compactos não são indicados para famílias grandes ou para pessoas que transportam muitas coisas no bagageiro, pois seu espaço interno é pequeno. Além disso, a maioria dos exemplares não possui muitos acessórios de série e seus itens principais são simples, ou seja, eles não apresentam um acabamento bem elaborado.","Consome grande quantidade de energia para a produção;As culturas para produção de biocombustíveis consomem muitos fertilizantes nitrogenados, com liberação de óxidos de nitrogênio, que também são gases estufa"); 	
    				System.out.println(Carros.toString());
    		break; 
    		
    		case 2: console.ConsoleTitle("Carro Pick-Up");
    			Carros = new Curiosidade("Pick-Up","Carro pequeno, porem com caçamba que ajuda muito para transporte de cargas medias e pequenas. Por ser um carro pequeno, quando não tiver transportando carga, ela tem um baixo consumo de combustível.","Por ser um carro pequeno com caçamba, aonde vai a caçamba, é aonde iria os passageiros traseiros, ou seja, só transporta duas pessoas.","Metais pesados altamente nocivos fazem parte da composição do diesel, eles se acumulam no organismo humano e, depois de alguns anos, chegam a causar até mesmo males neurológicos. Estudos revelaram que as dioxinas presentes no diesel são responsáveis por provocar as fortes dores de cabeça, distúrbios hormonais e câncer no aparelho respiratório. A própria fuligem desse combustível serve como um facilitador para as alergias nas vias aéreas."); 
					System.out.println(Carros.toString());
    	    	break;
    		
    		case 3: console.ConsoleTitle("Carro Sedan");
    			Carros = new Curiosidade("Sedan","Carro de grande porte, com um porta malas grande, feito para familia grandes ou que carregam muitas bagagens", "Gasto de combustivel, valor do carro", "Por gastar mais combustível, a queima dele tem lançado um alto nível de monóxido e dióxido de carbono na atmosfera terrestre"); 
		    		System.out.println(Carros.toString());
    		break;
    		
    		case 4: console.ConsoleTitle("Carro Suv");
    			Carros = new Curiosidade("SUV","SUVs são carros entre um carro grande e uma caminhonete, com grande capacidade de carga interna e motores potentes. Outro diferencial dos SUVs seria a tração 4x4, mas alguns modelos atuais trazem apenas tração nas rodas dianteiras (4x2). São mais econômicos em relação aos projetos originais","Custo de alimentação de combustível.O grande tamanho de SUVs obrigá-la a queimar mais gás do que os carros normais, o que significa um aumento no custo quando alimentando.","Porque SUVs precisam de mais gás, o que leva muitos a se referir a eles como 'beberrões de gasolina', que têm um impacto ambiental negativo através do aumento da poluição e diminuição da sustentabilidade do recurso natural finito de petróleo"); 
    				System.out.println(Carros.toString());
    		break;
    		
    		case 5: console.ConsoleTitle("Carro Esportivo");
    			Carros = new Curiosidade("Esportivo","Modelo mais sofisticado, motor mais potente","Gasta mais combustível, polui mais e faz mais barulho. E alguns dos carros, são só para duas pessoas.","Por gastar mais combustível, a queima dele tem lançado um alto nível de monóxido e dióxido de carbono na atmosfera terrestre"); 
    		   		System.out.println(Carros.toString());
    		break;
    		
    		default:
    		   System.out.println("Opção invalida !");	
    	
    	}
	}
	
    
			public String toString(){
				String Curiosidade = "Nome : " + this.nome+ "\n\n";
				Curiosidade +="Vantagem : " + this.vantagem+ "\n\n";
				Curiosidade +="Desvantagem : " + this.desvantagem + "\n\n";
				Curiosidade +="Causa : " + this.causa + "\n\n";
				return Curiosidade;
			}	
			public void  setNome(String nome){
				this.nome = nome;
			}
			public String getNome(){
				return nome;
			}

			public void setCausa(String causa){
				this.causa = causa;
			}
			
			public String getCausa(){
				return causa;
			}
			
				public void setVantagem(String vantagem){
					this.vantagem = vantagem;
				}
				public String getVantagem(){
					return vantagem;
				}
			
			public void setDesvantagem(String desvantagem){
				this.desvantagem = desvantagem;
			}
			public String getDesvantagem(){
				return desvantagem;
			}

    
}