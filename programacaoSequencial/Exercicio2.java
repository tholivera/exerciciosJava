package programacaoSequencial;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String args[]) {
		int dias, anos, meses;

		System.out.println("Quantos dias de nascido você tem? ");
		Scanner ler = new Scanner(System.in);
		dias = ler.nextInt();

		anos = dias / 365;
		meses = (dias - (anos * 365)) / 30;
		dias = dias - (anos * 365) - (meses * 30);

		System.out.println("\nVocê tem " + anos + " anos, " + meses + " meses e " + dias + " dias.");
	}
}
