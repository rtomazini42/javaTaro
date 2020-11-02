package gameLoop;

import java.util.ArrayList;
import java.util.Scanner;

public class Interpretador {
	 int eixoX =0;
     int eixoY =0;
     Baralho bar =  new Baralho();
     public ArrayList<String> urlimages = new ArrayList<String>();
     
	public void setUrlimages(String caminho){
		urlimages.add(caminho);
	}




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
	
	public String interpretaCarta(int valor){
		switch(valor){
		case 0:
			return("O Louco? Confie no acaso, mas aconselho prudência. Ele representa o início de uma jornada.");
		case 1:
			return("O Mago, você tem talentos escondidos que ainda não usou a seu favor.Precisa tomar uma atitude");
		case 2:
			return("Sacerdotisa. Inteligência é uma de suas habilidades, você deve usar isso para si. Busque conhecimento.");
		case 3:
			return("A Imperatriz. Neste momento, as conquistas estão favorecidas. É um momento de muita força e muita sorte. ");
		case 4:
			return("Imperador? O Imperador representa a lei, os limites e a ordem, no contexto de liderança e autoridade silenciosa.");
		case 5:
			return("Hierofante. Ele mostra que tudo será resolvido de maneira amigável, buscando encontrar sempre o acordo.");
		case 6:
			return("É um momento propício para tomar decisões. Há barreiras que devem ser ultrapassadas. Tome a decisão com o coração. ");
		case 7:
			return("O Carro representa o momento em que o viajante passou pela encruzilhada, tomou um rumo firme e está determinado a cumprir mais etapas evolutivas.");
		case 8:
			return("A Carta da Justiça é pra lembrar: Reflita sempre antes de tomar decisões. Elas devem ser justas.");
		case 9:
			return("Eremita! Dedique-se ao estudo, reflita, ele quer te lembrar disso.");
		case 10:
			return("Roda da Fortuna! A vida segue e a sorte nem sempre será ao seu favor, nem sempre será contra você.");
		case 11:
			return("Força,esse é o momento em que o caminhante precisa aprender a dominar a sua força interior e exterior.");
		case 12:
			return("O Enforcado. É hora de sacrifícios, deve-se dedicar para algo futuro, então abandonar velhos hábitos.");
		case 13:
			return("A Morte mostra que mudanças involuntárias irão ocorrer e que não se deve tentar impedi-las, pelo contrário, deve-se aceitá-las.");
		case 14:
			return("Temperança, necessidade de se equilibrar o uso da razão e da emoção nas questões capitais ou de relevância mais acentuada.");
		case 15:
			return("O Diabo, evite tentações e prazeres imediatos.");
		case 16:
			return("A Torre, mudança através da força da natureza é uma oportunidade de um novo começo material sem rompimento propriamente com o espiritual.");
		case 17:
			return("A Estrela significa esperança, ajuda inesperada,  inspiração e flexibilidade.");
		case 18:
			return("A Lua, é o momento de reavaliar a direção, repensar escolhas passadas que podem estar lhe afetando.");
		case 19:
			return("O Sol,é preciso aceitar a vida conforme ela é e para viver contente com as alegrias que percebe que tem no dia-a-dia.");
		case 20:
			return("O Julgamento. Este é um momento de separação entre o passado e o futuro, neste momento o consulente irá colher os frutos do que plantou.");
		case 21:
			return("O mundo? fim de um ciclo e preparação para um novo começo,suavidade e felicidade.");
		}
		return null;
		
		
	}
	
	
	


	
	public int pegarUma() {
		
		return bar.sacar();
	}
	
	
	
	

	
	public void verMesa() {
		for(int n = 0; n <3; n++) {
			bar.verMesa(n);
			System.out.println("Na mesa");
			
		}
		
	}
	
	public String lerMesa() {
		int valor1 = bar.emJogo[0];
		int valor2 = bar.emJogo[1];
		int valor3 = bar.emJogo[2];
		String resultado = interpretaCarta(valor1) +"\n" + interpretaCarta(valor2) +"\n" +interpretaCarta(valor3);
		return resultado;
		
	}

	

}
