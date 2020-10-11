package aplicacao;

import java.util.Scanner;

public class Testes {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("****BEM VINDO!****");
	    	System.out.println("1- Iniciar");
	    	System.out.println("0- sair");
	    	int escolha = sc.nextInt();
	    	if (escolha == 1){
	    		Interpretador interpretador =  new Interpretador();
	    		interpretador.Consultar();
	    	}
	    	if (escolha != 1){
	    		System.exit(0);
	    	}
		}

    	

	}

}
//131415