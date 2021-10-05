package lacosDeRepeticao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, contMenor21 = 0, contMaior50 = 0;

		System.out.println("Para sair digite -99 a qualquer momento.");
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		while (idade != -99) {
			if (idade < 21) {
				contMenor21++;
			} else if (idade > 50) {
				contMaior50++;
			}
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();

		}

		System.out.println("Número de pessoas com menos de 21 anos: " + contMenor21
				+ "\nNúmero de pessoas com mais de 50 anos: " + contMaior50);

	}
}