package lacosDeDecisao;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String[] args) {
		
		int n1, n2, n3, maior = 0;
				
		Scanner leia = new Scanner(System.in);
				
		System.out.println("Digite o 1° número: ");
		n1 = leia.nextInt(); 
		System.out.println("Digite o 2° número: ");
		n2 = leia.nextInt(); 
		System.out.println("Digite o 3° número: ");
		n3 = leia.nextInt(); 
				
			
		if (n1 <= n2 && n2 <= n3) {
		 maior = n3;
		System.out.println("O maior número digitado é: " + maior);
		}
		else if (n1 <= n3 && n3 <= n2) { 
		maior = n2; 
		 System.out.println("O maior número digitado é: " + maior);
		} else if (n2 <= n3 && n3 <= n1) { 
		maior = n1; 
		System.out.println("O maior número digitado é: " + maior);
		} else if (n2 <= n1 && n1 <= n3) { 
		maior = n3;
		System.out.println("O maior número digitado é: " + maior);
		} else if (n3 <= n2 && n2 <= n1) { 
		maior = n1; 
		System.out.println("O maior número digitado é: " + maior);
		} else { System.out.println("O maior número digitado é: " + maior);
	
	
	}

	}
}
/*Faça um programa que receba três inteiros e diga qual deles é o maior.
*/
