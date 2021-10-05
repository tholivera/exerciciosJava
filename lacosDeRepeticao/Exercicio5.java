package lacosDeRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero, soma = 0;

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			soma += numero;

		} while (numero != 0);

		System.out.println("A soma dos números digitados é: " + soma);

	}

}