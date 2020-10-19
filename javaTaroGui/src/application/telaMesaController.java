package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class telaMesaController {
	gameLoop.Interpretador interpretador = new gameLoop.Interpretador();
	boolean carta1Virada = false;
	boolean carta2Virada = false;
	boolean carta3Virada = false;

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
    private void primeiraCarta(MouseEvent event){
    	if(carta1Virada == false) {
    		carta1nome.setText(interpretador.pegarUma());
    		carta1nome.setEditable(false);
    		carta1nome.setVisible(true);
    		carta1Virada = true;
    	}
    	System.out.println("Tô aque");
    	
    	
    	
    }
    
    @FXML
    private void segundaCarta(MouseEvent event){
    	if(carta2Virada == false) {
    		carta2nome.setText(interpretador.pegarUma());
    		carta2nome.setEditable(false);
    		carta2nome.setVisible(true);
    		carta2Virada = true;
    	}
    	System.out.println("Tô aque");
    	
    	
    	
    }
    
    @FXML
    private void terceiraCarta(MouseEvent event){
    	if(carta3Virada == false) {
    		carta3nome.setText(interpretador.pegarUma());
    		carta3nome.setEditable(false);
    		carta3nome.setVisible(true);
    		carta3Virada = true;
    	}
    	System.out.println("Tô aque");
    	
    	
    	
    }
    
    
    

}
