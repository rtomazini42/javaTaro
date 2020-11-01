package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;

public class telaMesaController {
	private String flip = getClass().getResource("/sounds/flip.mp3").toString();
	private AudioClip audioFlip = new AudioClip(flip);
	gameLoop.Interpretador interpretador = new gameLoop.Interpretador();
	boolean carta1Virada = false;
	boolean carta2Virada = false;
	boolean carta3Virada = false;
	static int[] NaMesa = new int[3];
	
	
    @FXML
    private ImageView carta1;

    @FXML
    private ImageView carta2;

    @FXML
    private ImageView carta3;
    

    @FXML
    private TextArea carta1nome;

    @FXML
    private TextArea carta2nome;

    @FXML
    private TextArea carta3nome;
    
    @FXML
    private Button analise;

    
    @FXML
    private void primeiraCarta(MouseEvent event){
    	if(carta1Virada == false) {
    		int num1 = interpretador.pegarUma();
    		audioFlip.play();
    		String caminho = "/images/cartas/cartas-" + num1 + ".jpg";
    		carta1.setImage(new Image(caminho));
    		carta1Virada = true;
    		NaMesa[0]= num1;
    		//carta1.setVisible(true);
    	}
    	desocultarBotão();
    	
    	
    	
    }
    
    @FXML
    private void segundaCarta(MouseEvent event){
    	if(carta2Virada == false) {
    		int num2 = interpretador.pegarUma();
    		String caminho = "/images/cartas/cartas-" + num2 + ".jpg";
    		carta2.setImage(new Image(caminho));
    		carta2Virada = true;
    		NaMesa[1]= num2;
    	}
    	desocultarBotão();
    	
    	
    	
    }
    
    @FXML
    private void terceiraCarta(MouseEvent event){
    	if(carta3Virada == false) {
    		int num3 = interpretador.pegarUma();
    		audioFlip.play();
    		String caminho = "/images/cartas/cartas-" + num3 + ".jpg";
    		carta3.setImage(new Image(caminho));
    		//carta3.setImage(new Image("/images/cartas/cartas-" + num3 + ".jpg"));
    		carta3Virada = true;
    		NaMesa[2]= num3;
    		
    	}
    	desocultarBotão();
    	
    	
    	
    }
    
    
    private void desocultarBotão() {
    	if(carta3Virada == true && carta2Virada == true && carta1Virada == true) {
    	analise.setVisible(true);
    	NavegadorJanelas.navega(2);
    	}
    	
    }
    


    
    
    

}
