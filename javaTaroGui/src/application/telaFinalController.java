package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class telaFinalController implements Initializable{
	private boolean visivel = true;
	
	
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
    	NavegadorJanelas.navega(-1);
    	
    	
    }


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//som.play();
		
		// TODO Auto-generated method stub
		
	}
    
    

}
