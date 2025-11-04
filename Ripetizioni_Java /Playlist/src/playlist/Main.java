package playlist;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Creo un array di titolo che assegnerò all'attributo "playlist" dell'oggetto di tipo Playlist
		String[] titoli = new String[10]; 
		
		//Creo oggetto p di tipo Playlist che inizialmente sarà vuoto (verrà riempito poi dal metodo "inserimento")
		Playlist p = new Playlist();
		
		for (int i = 0; i < 10; ++i) {
			System.out.print("Inserisci il titolo "+(i + 1)+": ");
			titoli[i] = input.nextLine();
		}
		
		//Inserisco nella playlist i titoli scelti dall'utente
		p.inserimento(titoli);
		
		//Stampo i titoli (Stampo l'array playlist)
		p.stampa();
		
		System.out.println("Digita il nome del titolo che vuoi cancellare nella playlist: ");
		String b = input.nextLine();
		
		p.cancella(b);
		
		//Stampo la playlist dopo aver cancellato il brano b (sempre se presente, altrimenti non faccio nulla)
		p.stampa();
		
		System.out.print("Digita il nome del titolo che vuoi cercare nella playlist: ");
		String c = input.nextLine();
		
		System.out.println("Il brano "+c+" è presente nella playlist? "+p.cerca(c));
	}

}