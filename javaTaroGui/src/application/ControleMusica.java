package application;

import javafx.scene.media.AudioClip;

public class ControleMusica {
	public String consulta = getClass().getResource("/sounds/pergunta.mp3").toString();
	public  AudioClip audioConsulta = new AudioClip(consulta);
	public String mesa = getClass().getResource("/sounds/mesa.mp3").toString();
	public  AudioClip audioMesa = new AudioClip(mesa);
	public String musicaFinal = getClass().getResource("/sounds/finalSound.mp3").toString();
	public  AudioClip audioFinal = new AudioClip(musicaFinal);
	
	



public void ligar(int selec) {
	switch(selec){
	case 1:
		audioConsulta.play();
		break;
	case 2:
		audioConsulta.stop();
		audioMesa.play();
		break;
	case 3:
		audioMesa.stop();
		audioFinal.play();
		break;
	case 4:
		audioFinal.stop();
		break;
	}
}

}