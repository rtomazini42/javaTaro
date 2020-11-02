package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class telaFinalController extends telaMesaController{
	
	private boolean visivel = false;
	
	@FXML
	private void imaginizar() {
		//System.out.println(telaMesaController.interpretador.toString());
		carta1.setImage(new Image(interpretador.urlimages.get(0)));
		carta2.setImage(new Image(interpretador.urlimages.get(1)));
		carta3.setImage(new Image(interpretador.urlimages.get(2)));
	}
	
	
	
    @FXML
    private ImageView carta1;
    
    

    @FXML
    private ImageView carta2;

    @FXML
    private ImageView carta3;

    @FXML
    private Button retorno;
    
    @FXML
    private Button esconderMostrarBTN;

    @FXML
    private TextArea TextoInterpretacao;
    


    
    @FXML
    private void esconderMostrar(ActionEvent event) {
    	imaginizar();
    	TextoInterpretacao.setText(interpretador.lerMesa());
    	if(visivel == true) {
    		esconderMostrarBTN.setText("Mostrar");
    		TextoInterpretacao.setVisible(false);
    		visivel = false;
    	}else {
    		esconderMostrarBTN.setText("Esconder");
    		TextoInterpretacao.setVisible(true);
    		visivel = true;
    		
    	}
    	
    	
    }
    
    
    @FXML
    private void reinicio(ActionEvent event) {
    	
    	interpretador = new gameLoop.Interpretador();
    	NavegadorJanelas.navega(-1);
    	
    	
    }



	public void initialize(URL url, ResourceBundle rb){
		

	}
    

}
