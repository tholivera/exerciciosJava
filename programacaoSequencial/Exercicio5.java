package programacaoSequencial;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String args[]) {
		float nota1, nota2, nota3, mediapond, peso1, peso2, peso3;

		peso1 = 2;
		peso2 = 3;
		peso3 = 5;

		System.out.println("Insira suas notas: ");

		Scanner leia = new Scanner(System.in);

		nota1 = leia.nextFloat();
		nota2 = leia.nextFloat();
		nota3 = leia.nextFloat();

		mediapond = ((nota1 / peso1) + (nota2 / peso2) + (nota3 / peso3)) / (peso1 + peso2 + peso3);

		System.out.println("\n Sua média final é: " + Math.round(mediapond));
	}
}
