package studente;

public class Studente {
	//Attributi
	private String nome;
	private String matricola;
	private int[] voti;
	
	//Metodi
	
	//Costruttore Standard
	public Studente(String nome, String matricola, int[] voti) {
		this.nome = nome;
		this.matricola = matricola;
		this.voti = new int[voti.length];
		for (int i = 0; i < voti.length; ++i)
			if (voti[i] > 0)
				this.voti[i] = voti[i];
	}
	
	//Costruttore di Copia
	public Studente(Studente other) {
		this.nome = other.nome;
		this.matricola = other.matricola;
		this.voti = new int[other.voti.length];
		for (int i = 0; i < other.voti.length; ++i)
			this.voti[i] = other.voti[i];
	}
	
	//Set e Get
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	public void setVoti(int[] voti) {
		for (int i = 0; i < voti.length; ++i)
			if (voti[i] > 0)
				this.voti[i] = voti[i];
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getMatricola() {
		return this.matricola;
	}
	
	public int[] getVoti() {
		return this.voti;
	}
	
	public float media() {
		float media = 0;
		for (int i = 0; i < this.voti.length; ++i)
			media += this.voti[i];
		return media / this.voti.length;
	}
	
	public int max() {
		int max = 0;
		for (int i = 0; i < this.voti.length; ++i)
			if (max < this.voti[i])
				max = this.voti[i];
		return max; 
	}
	
}
