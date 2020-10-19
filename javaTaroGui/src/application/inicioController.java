

package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;



public class inicioController implements Initializable{
	
	
	





@FXML
private void iniciar(ActionEvent event){
	gameLoop.GameLoop.iniciar();
	NavegadorJanelas.navega(0);
	
	
	

}
@FXML
private void saida(ActionEvent event){
	System.exit(0);
	
}


@Override
public void initialize(URL url, ResourceBundle rb){

}
}
