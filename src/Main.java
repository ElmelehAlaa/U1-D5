import entities.RegistrazioneAudio;
import entities.Video;

public class Main {
    public static void main(String[] args) {

        RegistrazioneAudio registrazione = new RegistrazioneAudio("Canzone",5,3);
        registrazione.play();
        registrazione.alzaVolume();
        registrazione.play();

        Video video = new Video("video", 7,5,100);
        video.play();
        video.diminuisciLuminosita();
        video.play();
        video.diminuisciLuminosita();
        video.play();
        video.abbassaVolume();
        video.play();


    }
}