package entities;

public class Video implements Riproducibile,Multimediale {
private String titolo;
    private int volume;
    private int luminosita;
    private int durata;


    public Video(String titolo, int durata, int volume, int luminosita){
        this.titolo = titolo;
        this.durata = durata;
        this.volume= volume;
        this.luminosita=luminosita;
    }

    public void play() {
        for(int i=0; i<durata; i++){
            System.out.println(titolo+"!".repeat(volume)+ " *".repeat(luminosita));
        }

    }


    public int getDurata() {
        return 0;
    }


    public int getVolume() {
        return 0;
    }


    public int abbassaVolume() {
        if(volume >0){
            volume--;
        }
        return volume;
    }


    public int alzaVolume() {
        int volumeMax = 10;
        if(volume < volumeMax){
            volume++;
        }
        return volume;

    }


    public String getTitolo() {
      return titolo;
    }
    public int aumentaLuminosita(){
       int luminositaMax= 100;
        if(luminosita<luminositaMax){
           luminosita+=10;
        }
        return luminosita;
    }
    public int diminuisciLuminosita(){

        if(luminosita>10){
            luminosita-=10;
        }
        return luminosita;
    }
}
