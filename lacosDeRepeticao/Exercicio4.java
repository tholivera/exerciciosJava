package lacosDeRepeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade, sexo, humor;
		int cont = 0, contCalma = 0, contMuNe = 0, contHoA = 0, contOC = 0, contNe40 = 0,
				contCa18 = 0;

		System.out.println("Qual a sua idade?\n");
		idade = leia.nextInt();

		System.out.println("\nQual o seu gênero?\n1 - Feminino\n2 - Masculino\n3 - Outros\n");
		sexo = leia.nextInt();
		while (sexo <= 3 && sexo >= 1) {
			System.out.println("Dado inválido. Digite apenas o número: 1\n - Feminino\n2 - Masculino\n3 - Outros");
		}

		System.out.println(
				"\nDigite qual das opções mais se aproxima com suas características emocionais:\n1 - Sou uma pessoa calma\n2 - Sou uma pessoa nervosa\n3 - Sou uma pessoa agressiva");
		humor = leia.nextInt();
		while (humor == 1 || humor == 2 || humor == 3) {
			System.out.println("Dado inválido. Digite apenas o número: \n1 - Sou uma pessoa calma\n2 - Sou uma pessoa nervosa\n3 - Sou uma pessoa agressiva");
		}

	}}
