package lacosDeRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero, soma = 0, cont = 0;

		do {
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();

			if (numero % 3 == 0) {
				soma += numero;
				cont++;

			}

		} while (numero != 0);

		System.out.println("A m�dia dos n�meros m�ltiplo de 3 �: " + soma / (cont - 1));
	}
}
