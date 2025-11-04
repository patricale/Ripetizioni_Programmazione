package barcaMotore;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire capacità serbatoio: ");
		float c = input.nextFloat();
		System.out.print("Inserire quantità di carburante: ");
		float q = input.nextFloat();
		System.out.print("Inserire velocità massima: ");
		float vm = input.nextFloat();
		System.out.print("Inserire efficienza: ");
		float e = input.nextFloat();
		
		BarcaMotore b1 = new BarcaMotore(c, vm, e);
		
		b1.cambiaVelocita(20);
		
		b1.naviga(1);
		
		b1.riempiSerbatoio(10);
		
		System.out.print(b1.toString());
	}

}
