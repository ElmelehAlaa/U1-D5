package entities;

import interfaces.Multimediale;

public class Immagine extends Elemento implements Multimediale {

    private String titolo;
    private int luminosita;

    public Immagine(String titolo, int luminosita){
        this.titolo =titolo;
        this.luminosita=luminosita;
    }


    public String getTitolo() {

        return titolo;
    }

    @Override
    public void playGenerale() {

                show();

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

    protected void show() {

            System.out.println(titolo+ " *".repeat(luminosita));
        }

    }

