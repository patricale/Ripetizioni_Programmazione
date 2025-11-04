package playlist;

import java.util.Scanner;

/*
Creare una classe Playlist con un array di 10 elementi che contiene i titoli di 10 canzoni.
La classe dovrà avere:
almeno un opportuno costruttore,
un metodo per aggiungere i titoli dei brani,
un metodo per stampare tutti i brani,
un metodo che permette di cancellare un brano dato il titolo (opzionale)
un metodo per cercare un brano dato il titolo.
Nel Main, testare la playlist con alcuni titoli inseriti manualmente.
*/

public class Playlist {
	//Attributi
	private String[] playlist;	//Dichiariamo il vettore come attributo
	
	//Metodi
	
	//Costruttore Default
	public Playlist() {	
		this.playlist = new String[10];	//Creiamo il vettore playlist, inizialmente vuoto, verrà riempito quando l'utente chiamerà il metodo "inserimento"
	}
	
	public void inserimento(String[] p) {	//Metodo per inserire tutti i titoli nel vettore "playlist" 
		for(int i = 0; i < playlist.length; ++i) 	//Inserisco gli elementi di "p" in "playlist" con un ciclo for
			this.playlist[i] = p[i];
	}
	
	public void stampa() {	//Metodo per stampare i titoli
		System.out.println("La playlist e' composta dai seguenti titoli: ");
		for(int i = 0; i < this.playlist.length; ++i)
			System.out.println(" - "+this.playlist[i]);
	}
	
	public boolean cerca(String titolo) {	//Metodo per cercare un titolo
		for(int i = 0; i < this.playlist.length; ++i)
			if(this.playlist[i].equals(titolo))
				return true; //Se il brano è presente ritorno true
		return false; //Se non trovo il brano ritorno false
	}
	
	public void cancella(String titolo) {	//Metodo per cancellare un titolo
		for(int i = 0; i < this.playlist.length; ++i)
			if(this.playlist[i].equals(titolo))
				this.playlist[i] = "vuoto"; //Se trovo il titolo nella mia playlist, lo cancello mettendo al suo posto "vuoto"
	}
}


