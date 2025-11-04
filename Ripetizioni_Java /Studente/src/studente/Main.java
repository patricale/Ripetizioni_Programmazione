package studente;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci nome: ");
		String nome = input.nextLine();
		System.out.print("Inserisci matricola: ");
		String matricola = input.nextLine();
		System.out.print("Quanti voti vuoi inserire? ");
		int n = input.nextInt();
		int[] voti = new int[n];
		for (int i = 0; i < n; ++i) {
			System.out.print("Inserisci voto "+i+": ");
			voti[i] = input.nextInt();
		}
		Studente s1 = new Studente(nome, matricola, voti);
		System.out.println("La media dei voti di "+s1.getNome()+" è "+s1.media());
		System.out.println("Il massimo voto di "+s1.getNome()+" è "+s1.max());
	}

}
