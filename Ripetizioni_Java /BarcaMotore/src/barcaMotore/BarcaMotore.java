package barcaMotore;

public class BarcaMotore {

	//Attributi
	private float capacità_serbatoio;
	private float quantita_carburante;
	private float velocita_max;
	private float velocita_corrente;
	private float efficienza;
	private float distanza;
	
	//Metodi
	
	//Costruttore Default
	public BarcaMotore() {
		this.capacità_serbatoio = 0;
		this.quantita_carburante = 0;
		this.velocita_max = 0;
		this.velocita_corrente = 0;
		this.efficienza = 0;
		this.distanza = 0;
	}
	
	//Costruttore
	public BarcaMotore(float c, float vm, float e) {
		this.capacità_serbatoio = c;
		this.quantita_carburante = 0;
		this.velocita_max = vm;
		this.velocita_corrente = 0; //Inizialmente la velocità corrente è 0
		this.efficienza = e;
		this.distanza = 0;  //Inizialmente la distanza percorsa è 0
	}
	
	//Costruttore di Copia
	public BarcaMotore(BarcaMotore other) {
		this.capacità_serbatoio = other.capacità_serbatoio;
		this.quantita_carburante = other.quantita_carburante;
		this.velocita_max = other.velocita_max;
		this.velocita_corrente = other.velocita_corrente;
		this.efficienza = other.efficienza;
		this.distanza = other.distanza;
	}
	
	//Setter e Getter
	public void setCapacita_serbatoio(float c) {
		this.capacità_serbatoio = c;
	}
	
	public void setQuantita_carburante(float q) {
		if (this.capacità_serbatoio >= q)
			this.quantita_carburante = q;
		else 
			this.quantita_carburante = 0;
	}
	
	public void setVelocita_max(float vm) {
		this.velocita_max = vm;
	}
	
	public void setVelocita_corrente(float vc) {
		if (this.velocita_max > vc) 
			this.velocita_corrente = vc;
		else 
			this.velocita_corrente = 0;
	}
	
	public void setEfficienza(float e) {
		this.efficienza = e;
	}
	
	public void setDistanza(float t) {
		this.distanza = this.velocita_corrente * t;
	}
	
	public float getCapacita_serbatoio() {
		return this.capacità_serbatoio;
	}
	
	public float getQuantita_carburante() {
		return this.quantita_carburante;
	}
	
	public float getVelocita_max() {
		return this.velocita_max;
	}
	
	public float getVelocita_corrente() {
		return this.velocita_corrente;
	}
	
	public float getEfficienza() {
		return this.efficienza;
	}
	
	public float getDistanza() {
		return this.distanza;
	}
	
	
	//ToString
	public String toString() {
		return "Info Barca:\n"
				+ "Capacità Serbatoio: "+this.capacità_serbatoio+" Litri.\n"
				+ "Quantità Carburante: "+this.quantita_carburante+" Litri.\n"
				+ "Velocità Massima: "+this.velocita_max+" km/h.\n"
				+ "Velocità Corrente: "+this.velocita_corrente+" km/h.\n"
				+ "Efficienza: "+this.efficienza+".\n"
				+ "Distanza Percorsa: "+this.distanza+" km.\n";
	}
	
	//Equals
	public boolean equals(BarcaMotore other) {
		if (this.capacità_serbatoio == other.capacità_serbatoio
				&& this.quantita_carburante == other.quantita_carburante
				&& this.velocita_max == other.velocita_max
				&& this.velocita_corrente == other.velocita_corrente
				&& this.efficienza == other.efficienza
				&& this.distanza == other.distanza)
			return true;
		return false;
	}
	
	//Cambia Velocità
	public void cambiaVelocita(float v) {
		if (this.velocita_max >= v) 
			this.velocita_corrente = v;
		else 
			System.out.println("La barca non può andare più veloce di "+this.velocita_max);
	}
	
	//Naviga per un certo tempo t
	public void naviga(float t) {
		this.distanza = this.velocita_corrente * t;
		
		float carburante_utilizzato = this.efficienza * this.velocita_corrente * this.velocita_corrente * t;
		if (carburante_utilizzato > this.quantita_carburante)
			System.out.println("Non puoi navigare in queste condizioni per questo tempo t, finiresti il carburante!");
		else 
			this.quantita_carburante = this.quantita_carburante - carburante_utilizzato;	
	}
	
	//Riempi Serbatoio
	public void riempiSerbatoio(float q) {
		if (this.capacità_serbatoio > q + this.quantita_carburante)
			this.quantita_carburante = this.quantita_carburante + q;
		else 
			System.out.println("Non puoi mettere questa quantità di carburante, supereresti la capacità massima");
	}
	
}
