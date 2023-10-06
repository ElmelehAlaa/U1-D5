package entities;

public class RegistrazioneAudio extends Elemento implements Riproducibile,Multimediale {
    private String titolo;
    private int volume;
    private int durata;


   public RegistrazioneAudio(String titolo, int volume,int durata){
       this.titolo=titolo;
       this.volume=volume;
       this.durata=durata;
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

    @Override
    public void playGenerale() {

        play();

    }
    public void play() {
        for(int i=0; i<durata; i++){
            System.out.println(titolo+ "!".repeat(volume));
        }

    }
    public int alzaVolume() {
        int volumeMax =10;
        if (volume<volumeMax){
              volume++;

        }
        return volume;
    }


    public String getTitolo() {
        return titolo;
    }
}
