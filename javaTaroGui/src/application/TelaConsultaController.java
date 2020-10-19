package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;







public class TelaConsultaController implements Initializable{
	String Nome = System.getProperty("user.name");
	



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
	
	
	NavegadorJanelas.navega(1);
	
	
	

}



@Override
public void initialize(URL url, ResourceBundle rb){

}
}
