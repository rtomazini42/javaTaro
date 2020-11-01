package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class gameLooper {
		public Stage start(Stage stage) throws Exception {
		     Parent root = FXMLLoader.load(getClass().getResource("gameTela.fxml"));
		    
		     Scene scene = new Scene(root);
		    
		     stage.setTitle("Outro");
		     stage.setScene(scene);
		     System.out.println("Aqui");
		     return stage;
		    

		 }
}
