package lacosDeDecisao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String[] args) {
		
		float numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		numero = leia.nextFloat();
		
		if (numero % 2 == 0) {
			System.out.printf("Este numéro é par!\nSua raíz quadrada é: %.2f", Math.sqrt(numero));
		} else System.out.printf("Este número é ímpar!\nSeu quadrado é: %.2f", Math.pow(numero,2));
		
		
		
		
		
		
	}

}
