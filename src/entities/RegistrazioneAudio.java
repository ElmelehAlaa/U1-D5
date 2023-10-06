package entities;

public class RegistrazioneAudio implements Riproducibile {
    private int volume;
    private String titolo;
    private int durata;

    public RegistrazioneAudio(String titolo, int durata, int volume){
        this.titolo=titolo;
        this.durata=durata;
        this.volume=volume;
    }


    public void play() {
        for(int i=0; i<durata; i++){
            System.out.println(titolo+ "!".repeat(volume));
        }

    }


    public int getDurata() {
        return durata;
    }


    public int getVolume() {
        return volume;
    }


    public int abbassaVolume() {
        if (volume >0){
            volume--;
        };
        return volume;
    }


    public int alzaVolume() {
        int volumeMax =10;
        if (volume<volumeMax){
              volume++;

        }
        return volume;
    }
}
