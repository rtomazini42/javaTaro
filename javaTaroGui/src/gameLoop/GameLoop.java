package gameLoop;

public class GameLoop {

	public static void iniciar() {
		String Nome = System.getProperty("user.name");
		System.out.println(Nome);
		Interpretador interpretador =  new Interpretador();
		//interpretador.Consultar();
	}

}
