

package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;



public class inicioController implements Initializable{
	public String inicioMus = getClass().getResource("/sounds/meio.mp3").toString();
	public  AudioClip audioInicio = new AudioClip(inicioMus);
	private String selector = getClass().getResource("/sounds/selector.mp3").toString();
	private AudioClip audioSelector = new AudioClip(selector);
	
	
	

@FXML
private ImageView card;

@FXML
private ImageView mago;


@FXML
private Text beta;

@FXML
private ImageView logo;








@FXML
private void iniciar(ActionEvent event){
	audioSelector.play();
	audioInicio.stop();
	gameLoop.GameLoop.iniciar();
	NavegadorJanelas.navega(0);
	
	
	

}
@FXML
private void saida(ActionEvent event){
	System.exit(0);
	
}

@FXML
void mostrar(MouseEvent event) {
	//beta.setVisible(true);
	mago.setVisible(true);
}


@Override
public void initialize(URL url, ResourceBundle rb){
	audioInicio.play();
}
}
