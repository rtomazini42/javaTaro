package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;


public class NavegadorJanelas extends Application {
	private String mesa = getClass().getResource("/sounds/mesa.mp3").toString();
	private AudioClip audioMesa = new AudioClip(mesa);

	
	//String source = "file://sounds/inicio.mp3"; //pq não acha?
	//AudioClip som = new AudioClip(source);
	
	
	private static Scene inicioScene; 
	private static Scene consultaScene;
	private static Scene mesaScene;
	private static Scene finalScene;
	private static Stage primaryStage;
	@Override
	    public void start(Stage stage) throws Exception {
		audioMesa.play();
		//AudioClip clip = new AudioClip(audio);
	     
		
		////telas
	       	Parent inicio = FXMLLoader.load(getClass().getResource("/fxml/inicio.fxml"));
	       	Parent game = FXMLLoader.load(getClass().getResource("/fxml/telaConsulta.fxml"));
	       	Parent mesa = FXMLLoader.load(getClass().getResource("/fxml/telaMesa.fxml"));
	       	Parent fim = FXMLLoader.load(getClass().getResource("/fxml/telaFinal.fxml"));
			primaryStage = stage;
			
			
	        inicioScene = new Scene(inicio);
	        consultaScene = new Scene(game);
	        mesaScene = new Scene(mesa);
	        finalScene = new Scene(fim);
	        
	        stage.getIcons().add(new Image("/icon.png"));
	    
	        stage.setTitle("JavaTaro");
	        stage.setScene(inicioScene);
	        stage.show();


	        
			
		
	}
	        
	        
	       
	    
	
		public static void navega(int num) {
			switch(num){
			case -1:
				primaryStage.setScene(inicioScene);
				break;
			case 0:
				primaryStage.setScene(consultaScene);
				break;
			case 1:
				primaryStage.setScene(mesaScene);
				break;
			case 2:
				primaryStage.setScene(finalScene);
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
