package programacaoSequencial;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[]) {
		int anos, meses, dias;

		System.out.println("Quantos anos, meses e dias de nascido você tem?: ");
		Scanner ler = new Scanner(System.in);

		anos = ler.nextInt();
		meses = ler.nextInt();
		dias = ler.nextInt();

		System.out.println("Você tem " + ((anos * 365) + (meses * 30) + dias) + " dias de nascido");
	}
}