package gameLoop;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baralho {
	static ArrayList<Carta> cartas;
	Scanner sc = new Scanner(System.in);
	//private static ArrayList<Carta> emJogo;
	
    public Baralho() {
    	
        cartas = new ArrayList<>();
        criarCartas();
      
    }
    


	private void criarCartas() {
		String nomes[] = {"O mago","A sarcedotisa", "A imperatriz","O Imperador", "O Hierofante", "Os enamorados", "O Carro de Guerra", "A Justiça", "O Eremita", "A roda da forturna", "A força", "O Enforcado", "A morte", "A Temperança", "O Diabo", "A torre fulminada", "A estrela", "A lua", "O sol", "O julgamento", "O mundo", "O louco"};
		
		for(int n = 0; n < 21; n++) {
				criaCarta(nomes[n], n+1);
			
		}
		criaCarta(nomes[21], 0);
		//System.out.println(cartas.toString());
		
		
		
	}
	
	private void criaCarta(String nome, int valor) {
		Carta nova = new Carta(nome, valor);
		cartas.add(nova);
	}
    
	public void embaralha() {
		//System.out.println(cartas.toString());
		Collections.shuffle(cartas);
		Collections.shuffle(cartas);
		Collections.shuffle(cartas);
		//emJogo = new ArrayList<>();
		//System.out.println(cartas.toString());
	}
	
	

	
	public Carta sacar() {
		//System.out.println("teste");
		Carta sacada = cartas.get(0);
		//Carta sacada = cartas.get(12);
		
		//System.out.println("Carta sacada: "+ cartas.get(0));
		cartas.remove(0);
		System.out.println(sacada.getNome() +" | "+ sacada.getValor());
		//System.out.println("Carta topo: "+ cartas.get(0));
		return(sacada);
		
	}
	
    
    
}
