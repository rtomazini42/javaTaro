package application;
	
import java.io.File;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class NavegadorJanelas extends Application {
	//String source = "/sounds/inicio.mp3"; pq não acha?
	//AudioClip som = new AudioClip(source);
	
	
	private static Scene inicioScene; 
	private static Scene consultaScene;
	private static Scene mesaScene;
	private static Stage primaryStage;
	@Override
	    public void start(Stage stage) throws Exception {
		//som.play();
		
		////telas
	       	Parent inicio = FXMLLoader.load(getClass().getResource("/fxml/inicio.fxml"));
	       	Parent game = FXMLLoader.load(getClass().getResource("/fxml/telaConsulta.fxml"));
	       	Parent mesa = FXMLLoader.load(getClass().getResource("/fxml/telaMesa.fxml"));
			primaryStage = stage;
			
			
	        inicioScene = new Scene(inicio);
	        consultaScene = new Scene(game);
	        mesaScene = new Scene(mesa);
	        
	      
	    
	        stage.setTitle("Java");
	        stage.setScene(inicioScene);
	        stage.show();


	        
			
		
	}
	        
	        
	       
	    
	
		public static void navega(int num) {
			switch(num){
			case 0:
				primaryStage.setScene(consultaScene);
				break;
			case 1:
				primaryStage.setScene(mesaScene);
				break;
			
			}
			
			
		}
		
		//public static void run() {
			
           //final URL resource = getClass().getResource("/sound/inicio.mp3");
            //final Media media = new Media(resource.toString());
            //final MediaPlayer mediaPlayer = new MediaPlayer(media);
           // mediaPlayer.play();}

	
	public static void main(String[] args) {
		launch(args);
	}
	

}
