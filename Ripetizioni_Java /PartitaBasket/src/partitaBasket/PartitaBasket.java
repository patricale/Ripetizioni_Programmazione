package partitaBasket;

public class PartitaBasket {

	//Attributi
	private String nome_1;
	private String nome_2;
	private int punteggio_1;
	private int punteggio_2;
	private int stato_partita;
	
//----------------------------------------------------------
	
	//Metodi
	
	//Costruttore
	public PartitaBasket(String nome_1, String nome_2) {
		this.nome_1 = nome_1;
		this.nome_2 = nome_2;
		this.punteggio_1 = 0; 
		this.punteggio_2 = 0;
		this.stato_partita = 1; //Partita avviata (quindi in corso)
	}
	
	//Metodo che tiene traccia dei punti delle due squadre
	public void canestroSegnato(String squadra, int punti) {
		if (this.stato_partita == 1) 
			if (this.nome_1.equals(squadra) && punti > 0 && punti < 4)
				this.punteggio_1 += punti;
			else if (this.nome_2.equals(squadra) && punti > 0 && punti < 4) 
				this.punteggio_2 += punti;
			else
				System.out.println("Punteggio o squadra inserita non valida!");
	}
	
	//Metodo che tiene traccia delle informazioni relative alla partita
	public void stampaInfoPartita() {
		System.out.print(this.nome_1 + ": " + this.punteggio_1);
		System.out.print(" VS ");
		System.out.print(this.nome_2 + ": " + this.punteggio_2);
		System.out.println();
		if (this.punteggio_1 > this.punteggio_2)
			System.out.println(this.nome_1 + " stanno vincendo");
		else if (this.punteggio_1 < this.punteggio_2)
			System.out.println(this.nome_2 + " stanno vincendo");
		else 
			System.out.println("Le due squadre stanno pareggiando");
		System.out.println("-------------------------------------");
	}
	
	//Metodo che stampa le info della squadra vincitrice della partita (private perché non voglio far accedere
	// l'utente dall'esterno in questo metodo. Posso accederci solo quando richiamo il metodo "terminaPartita"
	private void stampaVincitorePartita() {
		if (this.punteggio_1 > this.punteggio_2)
			System.out.println(this.nome_1 + " hanno vinto contro " + this.nome_2 + " per " 
							+ this.punteggio_1 + " a " + this.punteggio_2);
		else if (this.punteggio_1 < this.punteggio_2)
			System.out.println(this.nome_2 + " hanno vinto contro " + this.nome_1 + " per " 
					+ this.punteggio_2 + " a " + this.punteggio_1);
		else
			System.out.println(this.nome_1 + " e " + this.nome_2 + " hanno pareggiato per " 
							+ this.punteggio_1 + " a " + this.punteggio_2);
	}
	
	//Metodo che imposta la partia come finita
	public void terminaPartita() {
		if (this.stato_partita == 1) {
			this.stato_partita = this.stato_partita - 1;
			stampaVincitorePartita();
		} else 
			System.out.print("La partita è già finita!");
	}
	
	//Metodo che restituisce il punteggio di una squadra
	public int getPunteggio(String nomeSquadra) {
		if (this.nome_1.equals(nomeSquadra)) {
			System.out.println(this.nome_1 + " ha " + this.punteggio_1 + " punti");
			return this.punteggio_1;
		} else if (this.nome_2.equals(nomeSquadra)) {
			System.out.println(this.nome_2 + " ha " + this.punteggio_2 + " punti");
			return this.punteggio_2;
		} else {
			System.out.println("La squadra di cui vuoi sapere il punteggio non esiste");
			return -1;
		}
	}
}


