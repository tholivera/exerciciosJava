package lacosDeRepeticao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int x, numero, contPar = 0, contImpar = 0;

		for (x = 0; x < 10; x++) {
			System.out.println("Digite o " + (x + 1) + "� n�mero: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}

		}

		System.out.println("\nA quantidade de n�meros pares digitados foi de: " + contPar
				+ " n�meros.\nA quantidade de n�meros �mpares digitados foi de: " + contImpar + " n�meros.");

	}
}
