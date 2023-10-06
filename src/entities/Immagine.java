package entities;

public class Immagine implements Multimediale {

    private String titolo;
    private int luminosita;

    public Immagine(String titolo, int luminosita){
        this.titolo=titolo;
        this.luminosita=luminosita;
    }

    public String getTitolo() {

        return titolo;
    }

    public int diminuisciLuminosita(){

        if(luminosita>10){
            luminosita-=10;
        }
        return luminosita;
    }
    public int aumentaLuminosita(){
        int luminositaMax= 100;
        if(luminosita<luminositaMax){
            luminosita+=10;
        }
        return luminosita;
    }

    public void show() {

            System.out.println(titolo+ " *".repeat(luminosita));
        }

    }

