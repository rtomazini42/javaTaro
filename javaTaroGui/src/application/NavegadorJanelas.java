package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class NavegadorJanelas extends Application {
//	public String mesa = getClass().getResource("/sounds/mesa.mp3").toString();
//	public  AudioClip audioMesa = new AudioClip(mesa);

	
	//String source = "file://sounds/inicio.mp3"; //pq não acha?
	//AudioClip som = new AudioClip(source);
	
	
	private static Scene inicioScene; 
	private static Scene consultaScene;
	private static Scene mesaScene;
	private static Scene finalScene;
	private static Stage primaryStage;
	@Override
	    public void start(Stage stage) throws Exception {
		////telas
		
	       	Parent inicio = FXMLLoader.load(getClass().getResource("/fxml/inicio.fxml"));
	       	Parent game = FXMLLoader.load(getClass().getResource("/fxml/telaConsulta.fxml"));
	       	Parent mesa = FXMLLoader.load(getClass().getResource("/fxml/telaMesa.fxml"));
	       	Parent fim = FXMLLoader.load(getClass().getResource("/fxml/telaFim.fxml"));
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
			//cartasTiradas tiradas = new cartasTiradas();
			ControleMusica player = new ControleMusica();
			switch(num){
			case -1:
				player.ligar(4);
				primaryStage.close();
				Platform.runLater( () -> {
					try {
						;
						new NavegadorJanelas().start( new Stage() );
					} catch (Exception e) {
						e.printStackTrace();
					}
				} );
				break;
			case 0:
				player.ligar(1);
				primaryStage.setScene(consultaScene);
				break;
			case 1:
				player.ligar(2);
				primaryStage.setScene(mesaScene);
				break;
			case 2:
				player.ligar(3);
				primaryStage.setScene(finalScene);
				break;
			
			}
			
			
		}
		
		//public static void run() {
			
           //final URL resource = getClass().getResource("/sound/inicio.mp3");
            //final Media media = new Media(resource.toString());
            //final MediaPlayer mediaPlayer = new MediaPlayer(media);
           // mediaPlayer.play();}

	
//	public static void main(String[] args) {
//		launch(args);
//	}
		
		public void main(String[] args) {

		launch(args);}
	

}
