import entities.RegistrazioneAudio;

public class Main {
    public static void main(String[] args) {

        RegistrazioneAudio registrazione = new RegistrazioneAudio("Canzone",5,3);
        registrazione.play();
        registrazione.alzaVolume();
        registrazione.play();


    }
}