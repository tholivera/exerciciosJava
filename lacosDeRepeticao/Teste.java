package lacosDeRepeticao;

import java.util.Scanner;

public class Teste {
	public static void main (String [] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, sexo, humor;
		
		System.out.println("Qual a sua idade?");
		idade = leia.nextInt();
		
		System.out.println("\nQual o seu g�nero? Digite apenas n�mero\n1 - Feminino\n2 - Masculino\n3 - Outros");
		sexo = leia.nextInt();
		while (sexo >= 1 & sexo <= 3);
		
		System.out.println("\nDigite qual das op��es mais se aproxima com suas caracter�sticas emocionais:"
				+ "\n1 - Sou uma pessoa calma"
				+ "\n2 - Sou uma pessoa nervosa"
				+ "\n3 - Sou uma pessoa agressiva");
		humor = leia.nextInt();
		while (humor >= 1 & humor <= 3);
		
	}

}
