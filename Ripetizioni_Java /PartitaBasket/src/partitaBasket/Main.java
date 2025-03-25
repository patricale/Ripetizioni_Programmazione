package partitaBasket;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome1, nome2;
		
		System.out.print("Inserisci il nome della prima squadra: ");
		nome1 = input.nextLine();
		
		System.out.print("Inserisci il nome della seconda squadra: ");
		nome2 = input.nextLine();
		
		PartitaBasket p1 = new PartitaBasket(nome1, nome2);
		
		int scegliSquadra;
		int puntiSegnati;
		int termina;
		do {
			System.out.print("Quale squadra ha segnato un canestro? (1 per la prima, 2 per la seconda): ");
			scegliSquadra = input.nextInt();
			
			System.out.print("Quanti punti ha segnato? (1 o 2 o 3): ");
			puntiSegnati = input.nextInt();
			
			if (scegliSquadra == 1)
				p1.canestroSegnato(nome1, puntiSegnati);
			else if (scegliSquadra == 2)
				p1.canestroSegnato(nome2, puntiSegnati);
			else 
				System.out.println("Errore!");
			
			p1.stampaInfoPartita();
			
			System.out.print("Vuoi terminare la partita? Premere 1 per SI: ");
			termina = input.nextInt();
			
			System.out.println();
			
		} while (termina != 1);
		p1.terminaPartita();
		
		p1.getPunteggio(nome1);
	}
	
}
