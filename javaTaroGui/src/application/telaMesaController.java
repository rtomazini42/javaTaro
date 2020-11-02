package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;

public class telaMesaController {
	private String flip = getClass().getResource("/sounds/flip.mp3").toString();
	private AudioClip audioFlip = new AudioClip(flip);
	static gameLoop.Interpretador interpretador = new gameLoop.Interpretador();
	boolean carta1Virada = false;
	boolean carta2Virada = false;
	boolean carta3Virada = false;
	int num1;
	int num2;
	int num3;
	
	
	
	
	
	
	
	
    @FXML
    private ImageView carta1;

    @FXML
    private ImageView carta2;

    @FXML
    private ImageView carta3;
    


    
    @FXML
    private Button analise;
	

    
    @FXML
    private void primeiraCarta(MouseEvent event){
    	if(carta1Virada == false) {
    		num1 = interpretador.pegarUma();
    		audioFlip.play();
    		String caminho = "/images/cartas/cartas-" + num1 + ".jpg";
    		interpretador.setUrlimages(caminho);
    		carta1.setImage(new Image(caminho));
    		carta1Virada = true;
    		//carta1.setVisible(true);
    	}
    	desocultarBotão();
    	
    	
    	
    }
    
    @FXML
    private void segundaCarta(MouseEvent event){
    	if(carta2Virada == false) {
    		audioFlip.play();
    		num2 = interpretador.pegarUma();
    		String caminho = "/images/cartas/cartas-" + num2 + ".jpg";
    		interpretador.setUrlimages(caminho);
    		carta2.setImage(new Image(caminho));
    		carta2Virada = true;
 
    	}
    	desocultarBotão();
    	
    	
    	
    }
    
    @FXML
    private void terceiraCarta(MouseEvent event){
    	if(carta3Virada == false) {
    		num3 = interpretador.pegarUma();
    		audioFlip.play();
    		String caminho = "/images/cartas/cartas-" + num3 + ".jpg";
    		interpretador.setUrlimages(caminho);
    		carta3.setImage(new Image(caminho));
    		//carta3.setImage(new Image("/images/cartas/cartas-" + num3 + ".jpg"));
    		carta3Virada = true;
    		
    		
    	}
    	desocultarBotão();
    	
    	
    	
    }
    
    @FXML
    private void consultar(ActionEvent event){
    	//interpretador.verMesa();
    	System.out.println(interpretador.toString());
    	
    	NavegadorJanelas.navega(2);
    	//System.out.println(interpretador.NaMesaO());
    }
    
    
    private void desocultarBotão() {
    	if(carta3Virada == true && carta2Virada == true && carta1Virada == true) {
    	analise.setVisible(true);
    	
    	//NavegadorJanelas.navega(2);
    	}

    	
    }
    




  



}
