package aplicacao;

public class Carta {
	private int valor;
	private String nome;
	

    public Carta(String nome,int valor) {
        this.valor = valor;
        this.nome = nome;
    }


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public String getNome() {
		return nome;
	}


	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		//return "Carta: "+ getNome() + " " + getValor() + "";
		return " "+ getNome() + " ";
		//return "Carta: "+ getNome() + " " + getValor() + "";
	}
	
	
}
