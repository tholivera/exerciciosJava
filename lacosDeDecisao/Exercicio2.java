package lacosDeDecisao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int n1, n2, n3;

		System.out.println("Digite um n�mero: ");
		n1 = leia.nextInt();
		System.out.println("Digite um n�mero: ");
		n2 = leia.nextInt();
		System.out.println("Digite um n�mero: ");
		n3 = leia.nextInt();

		if (n1 <= n2 && n2 <= n3) {
			System.out.println("\nA ordem dos n�meros �: " + n1 + " - " + n2 + " - " + n3);
		} else if (n1 <= n3 && n3 <= n2) {
			System.out.println("\nA ordem dos n�meros �: " + n1 + " - " + n3 + " - " + n2);
		} else if (n2 <= n3 && n3 <= n1) {
			System.out.println("\nA ordem dos n�meros �: " + n2 + " - " + n3 + " - " + n1);
		} else if (n2 <= n1 && n1 <= n3) {
			System.out.println("\nA ordem dos n�meros �: " + n2 + " - " + n1 + " - " + n3);
		} else if (n3 <= n2 && n2 <= n1) {
			System.out.println("\nA ordem dos n�meros �: " + n3 + " - " + n2 + " - " + n1);
		} else {
			System.out.println("\nA ordem dos n�meros �: " + n3 + " - " + n2 + " - " + n1);
		}

	}

}