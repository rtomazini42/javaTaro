package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;







public class TelaConsultaController implements Initializable{
	String Nome = System.getProperty("user.name");
	private String selector = getClass().getResource("/sounds/selector.mp3").toString();
	private AudioClip audioSelector = new AudioClip(selector);
	



@FXML
private Text nomeUser;

@FXML
private void nomear() {
	nomeUser.setText(Nome.toUpperCase());
}

@FXML
private void consultar(ActionEvent event){
	//String Nome = System.getProperty("user.name");	
	//nomeUser.setText(Nome.toUpperCase());
	audioSelector.play();
	
	NavegadorJanelas.navega(-1);
	
	
	

}



@Override
public void initialize(URL url, ResourceBundle rb){

}
}
