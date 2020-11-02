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
			return("O Louco? Confie no acaso, mas aconselho prud�ncia. Ele representa o in�cio de uma jornada.");
		case 1:
			return("O Mago, voc� tem talentos escondidos que ainda n�o usou a seu favor.Precisa tomar uma atitude");
		case 2:
			return("Sacerdotisa. Intelig�ncia � uma de suas habilidades, voc� deve usar isso para si. Busque conhecimento.");
		case 3:
			return("A Imperatriz. Neste momento, as conquistas est�o favorecidas. � um momento de muita for�a e muita sorte. ");
		case 4:
			return("Imperador? O Imperador representa a lei, os limites e a ordem, no contexto de lideran�a e autoridade silenciosa.");
		case 5:
			return("Hierofante. Ele mostra que tudo ser� resolvido de maneira amig�vel, buscando encontrar sempre o acordo.");
		case 6:
			return("� um momento prop�cio para tomar decis�es. H� barreiras que devem ser ultrapassadas. Tome a decis�o com o cora��o. ");
		case 7:
			return("O Carro representa o momento em que o viajante passou pela encruzilhada, tomou um rumo firme e est� determinado a cumprir mais etapas evolutivas.");
		case 8:
			return("A Carta da Justi�a � pra lembrar: Reflita sempre antes de tomar decis�es. Elas devem ser justas.");
		case 9:
			return("Eremita! Dedique-se ao estudo, reflita, ele quer te lembrar disso.");
		case 10:
			return("Roda da Fortuna! A vida segue e a sorte nem sempre ser� ao seu favor, nem sempre ser� contra voc�.");
		case 11:
			return("For�a,esse � o momento em que o caminhante precisa aprender a dominar a sua for�a interior e exterior.");
		case 12:
			return("O Enforcado. � hora de sacrif�cios, deve-se dedicar para algo futuro, ent�o abandonar velhos h�bitos.");
		case 13:
			return("A Morte mostra que mudan�as involunt�rias ir�o ocorrer e que n�o se deve tentar impedi-las, pelo contr�rio, deve-se aceit�-las.");
		case 14:
			return("Temperan�a, necessidade de se equilibrar o uso da raz�o e da emo��o nas quest�es capitais ou de relev�ncia mais acentuada.");
		case 15:
			return("O Diabo, evite tenta��es e prazeres imediatos.");
		case 16:
			return("A Torre, mudan�a atrav�s da for�a da natureza � uma oportunidade de um novo come�o material sem rompimento propriamente com o espiritual.");
		case 17:
			return("A Estrela significa esperan�a, ajuda inesperada,  inspira��o e flexibilidade.");
		case 18:
			return("A Lua, � o momento de reavaliar a dire��o, repensar escolhas passadas que podem estar lhe afetando.");
		case 19:
			return("O Sol,� preciso aceitar a vida conforme ela � e para viver contente com as alegrias que percebe que tem no dia-a-dia.");
		case 20:
			return("O Julgamento. Este � um momento de separa��o entre o passado e o futuro, neste momento o consulente ir� colher os frutos do que plantou.");
		case 21:
			return("O mundo? fim de um ciclo e prepara��o para um novo come�o,suavidade e felicidade.");
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
