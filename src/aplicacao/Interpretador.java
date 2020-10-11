package aplicacao;

import java.util.Random;
import java.util.Scanner;

public class Interpretador {
	 int eixoX =0;
     int eixoY =0;
     Baralho bar =  new Baralho();
	
	Scanner sc = new Scanner(System.in);
		

	public Interpretador() {
		
		bar.embaralha();
		

    }
	
	public void pausaDramatica(int sec) {
		sec = sec * 1000;
		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void interpretaCarta(Carta carta){
		System.out.println("Vejamos, você tirou");
		System.out.println(carta.toString());
		pausaDramatica(3);
		if (carta.getValor() == 0) {
			System.out.println("Um, o Coringa, está sentindo algum distanciamento?");
			eixoX = eixoX -5;
			eixoY = eixoY +5;
			
		}
		if (carta.getValor() <= 7 ) {
			System.out.println("vejo que queres mudança.  " +  carta.toString()+ "representa isso!");
			eixoX = eixoX +1;
			
		}
		if (carta.getValor() <= 11 &&  carta.getValor() > 7) {
			System.out.println("vejo que és determinado.  " +  carta.toString()+ "representa isso!");
			eixoX = eixoX +1;
			eixoY = eixoY +1;
			
		}
		if (carta.getValor() <= 16 &&  carta.getValor() > 11) {
			System.out.println("Algumas coisas estão erradas, " +  carta.toString()+ "mostra isso!");
			eixoX = eixoX -1;
			eixoY = eixoY -1;
			
		}
		if (carta.getValor() == 17) {
			System.out.println("Bem, estou vendo algo bom proximo. " +  carta.toString()+ "representa isso!");
			eixoX = eixoX +2;
			eixoY = eixoY +2;
			
		}
		if (carta.getValor() == 18) {
			System.out.println("Vejo alguma presença feminina perto. " +  carta.toString()+ "representa isso!");
			eixoX = eixoX +3;
			eixoY = eixoY -2;
			
		}
		if (carta.getValor() == 19) {
			System.out.println("Vejo alguma presença masculina perto. " +  carta.toString()+ "representa isso!");
			eixoX = eixoX -1;
			eixoY = eixoY +3;
			
		}
		if (carta.getValor() == 20) {
			System.out.println("Precisa ser sincero, " +  carta.toString()+ "representa isso!");
			eixoX = eixoX -2;
			eixoY = eixoY -2;
			
		}
		if (carta.getValor() == 21) {
			System.out.println("Mudanças de rotinas proximas," +  carta.toString()+ "representa isso!");
			eixoX = eixoX -5;
			eixoY = eixoY -4;
			
		}
		pausaDramatica(10);
			
		
	}
	public void analisaValores(int eixoX,int eixoY) {
		System.out.println("Sua entropia é " + (eixoX+eixoY));
		System.out.println("Analisando o mapa das suas cartas, eu vejo:");
		if (eixoX > 0) {
			if (eixoY > 0) {
				System.out.println("O elemento é fogo. Vejo grande animação pro Futuro");
			}else {
				System.out.println("O elemento é vento. Precisa de mudanças para maior liberdade.");
			}
			
		}else {
			if (eixoY > 0) {
				System.out.println("O elemento é terra. Precisa esquecer o passado!");
			}else {
				System.out.println("O elemento é água. Melancolia está associada ao seu futuro, cuide-se.");
			}
			
		}
		Random rand = new Random();
		int int_random = rand.nextInt(100);
		System.out.println("Seu número da sorte é: "+ int_random);
		
		
	
	}
	public void Consultando() {
		System.out.println();
		System.out.println("Quantas cartas de 3 até 6 você quer que eu tire?");
		bar.embaralha();
		int qtd = sc.nextInt();
		if(qtd < 3 || qtd > 6) {
			System.out.println("Por favor, diga uma quantidade certa para que eu possa avaliar melhor");
			Consultando();
		}else {
			pausaDramatica(3);
			System.out.println("Para cada carta farei a interpretação");
			for(int i = 1; i <= qtd; i++) {
				System.out.println();
				pausaDramatica(3);
				interpretaCarta(bar.sacar());
				System.out.println();
			}
			analisaValores(eixoX, eixoY);
			
			System.out.println("Terminada a consulta,espero ter sido esclarecedor.");
			
			
			
		}
		
	}
	
	public void Consultar() {
		System.out.println("Olá,saiba que a responsabilidade de interpretação não cabe apenas á mim, concentre-se");
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a pergunta:");
		String pergunta = sc.nextLine();
		System.out.println();
    	System.out.println("Concentre-se na Pergunta: "+pergunta);
    	pausaDramatica(3);
    	System.out.println("aguarde, eu levo tempo interpreteando");
    	Consultando();

    	
	}
	
	

	

}
