package lacosDeDecisao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String[] args) {
		
		float numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
		numero = leia.nextFloat();
		
		if (numero % 2 == 0) {
			System.out.printf("Este num�ro � par!\nSua ra�z quadrada �: %.2f", Math.sqrt(numero));
		} else System.out.printf("Este n�mero � �mpar!\nSeu quadrado �: %.2f", Math.pow(numero,2));
		
		
		
		
		
		
	}

}
