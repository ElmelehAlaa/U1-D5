import entities.Elemento;
import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

Elemento[] elementi = new Elemento[5];
for(int i=0; i<5; i++){
        System.out.println("Inserisci il tipo dell'elemento (Immagine/Video/RegistrazioneAudio" );
        String tipo = input.nextLine();
        switch (tipo.toLowerCase()){
     case "immagine":
         System.out.println("Inserisci il titolo dell'immagine:");
         String titoloImmagine = input.nextLine();
         System.out.println("Inserisci luminosita immagine:");
         int luminositaImmagine = input.nextInt();
         input.nextLine();
         elementi[i]= new Immagine(titoloImmagine,luminositaImmagine);
         break;


            case "video":
                System.out.println("Inserisci il titolo del video:");
                String titoloVideo= input.nextLine();
                System.out.println("inserisci volume del video");
                int volumeVideo= input.nextInt();
                System.out.println("Inserisci Luminosita' del video:");
                int luminositaVideo= input.nextInt();
                System.out.println("Inserisci durata del video");
                int durataVideo= input.nextInt();
                input.nextLine();
                elementi[i]= new Video(titoloVideo,volumeVideo,luminositaVideo,durataVideo);
                break;


            case "registrazioneaudio":
                System.out.println("Inserisci il titolo della canzone");
                String titoloCanzone = input.nextLine();
                System.out.println("Inserisci il volume della canzone");
                int volumeCanzone=input.nextInt();
                System.out.println("Inserisci durata Canzone");
                int durataCanzone = input.nextInt();
                input.nextLine();
                elementi[i]= new RegistrazioneAudio(titoloCanzone,volumeCanzone,durataCanzone);
                break;


            default:System.out.println("Errore inserisci correttamente gli input");
            break;

 }}
 while (true){
     System.out.println("Inserisci un numero da 1 a 5 per eseguire l'elemento che vuoi, oppure inserisci 0 per chiudere");
     int numeroScelto = input.nextInt();
     if(numeroScelto == 0){
         break;
     }
     else if (numeroScelto>=1 && numeroScelto<=5) {
         Elemento elementoScelto = elementi[numeroScelto-1];
        elementoScelto.playGenerale();


     }
 }
     input.close();

//        RegistrazioneAudio registrazione = new RegistrazioneAudio("Canzone",5,3);
//        registrazione.play();
//        registrazione.alzaVolume();
//        registrazione.play();
//
//        Video video = new Video("video", 7,5,100);
//        video.play();
//        video.diminuisciLuminosita();
//        video.play();
//        video.diminuisciLuminosita();
//        video.play();
//        video.abbassaVolume();
//        video.play();
//
//        Immagine immagine = new Immagine("immagine",40);
//        immagine.show();
//        immagine.diminuisciLuminosita();



}}