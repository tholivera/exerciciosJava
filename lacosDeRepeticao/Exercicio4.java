package lacosDeRepeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade = 0, sexo = 0, humor = 0;
		int contPessoas = 0, contCalma = 0, contMulherNervosa = 0, contHomemAgressivo = 0, contOutroCalmo = 0,
				contNervo40 = 0, contCalm18 = 0;

		while (contPessoas < 3) {
			System.out.println("Qual a sua idade?");
			idade = leia.nextInt();

			System.out.println("\nQual o seu g�nero? Digite apenas n�mero\n1 - Feminino\n2 - Masculino\n3 - Outros");
			sexo = leia.nextInt();
			while (sexo < 1 || sexo > 3) {
				System.out.println("\nOp��o inv�lida.\nDigite apenas n�mero\n1 - Feminino\n2 - Masculino\n3 - Outros");
				sexo = leia.nextInt();
			}

			System.out.println(
					"\nQual das op��es mais se aproxima de suas caracter�sticas emocionais?\nDigite apenas o n�mero"
							+ "\n1 - Sou uma pessoa calma" + "\n2 - Sou uma pessoa nervosa"
							+ "\n3 - Sou uma pessoa agressiva");
			humor = leia.nextInt();
			while (humor < 1 || humor > 3) {
				System.out.println(
						"\nOp��o inv�lida.\nQual das op��es mais se aproxima de suas caracter�sticas emocionais?\nDigite apenas o n�mero"
								+ "\n1 - Sou uma pessoa calma" + "\n2 - Sou uma pessoa nervosa"
								+ "\n3 - Sou uma pessoa agressiva");
				humor = leia.nextInt();
			}
			contPessoas++;
		}

		while (contPessoas < 3) {
			if (humor == 1) {
				contCalma++;
			}
			if (sexo == 1 && humor == 2) {
				contMulherNervosa++;
			}
			if (sexo == 2 && humor == 3) {
				contHomemAgressivo++;
			}
			if (sexo == 3 && humor == 1) {
				contOutroCalmo++;
			}
			if (humor == 2 && idade > 40) {
				contNervo40++;
			}
			if (humor == 1 && idade < 18) {
				contCalm18++;
			}

			System.out.println("Qual a sua idade?");
			idade = leia.nextInt();

			System.out.println("\nQual o seu g�nero? Digite apenas n�mero\n1 - Feminino\n2 - Masculino\n3 - Outros");
			sexo = leia.nextInt();
			while (sexo < 1 || sexo > 3) {
				System.out.println("\nOp��o inv�lida.\nDigite apenas n�mero\n1 - Feminino\n2 - Masculino\n3 - Outros");
				sexo = leia.nextInt();
			}

			System.out.println(
					"\nQual das op��es mais se aproxima de suas caracter�sticas emocionais?\nDigite apenas o n�mero"
							+ "\n1 - Sou uma pessoa calma" + "\n2 - Sou uma pessoa nervosa"
							+ "\n3 - Sou uma pessoa agressiva");
			humor = leia.nextInt();
			while (humor < 1 || humor > 3) {
				System.out.println(
						"\nOp��o inv�lida\nQual das op��es mais se aproxima de suas caracter�sticas emocionais?\nDigite apenas o n�mero"
								+ "\n1 - Sou uma pessoa calma" + "\n2 - Sou uma pessoa nervosa"
								+ "\n3 - Sou uma pessoa agressiva");
				humor = leia.nextInt();
			}
			contPessoas++;
		}

		System.out.println("\n N�mero de pessoas calmas: " + contCalma);
		System.out.println(" N�mero de mulheres nervosas: " + contMulherNervosa);
		System.out.println(" N�mero de homens agressivos: " + contHomemAgressivo);
		System.out.println(" N�mero de outros calmos: " + contOutroCalmo);
		System.out.println(" N�mero de pessoas nervosas com mais de 40 anos: " + contNervo40);
		System.out.println(" N�mero de pessoas calmas com menos de 18 anos: " + contCalm18);

	}

}
