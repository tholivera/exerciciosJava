package lacosDeDecisao;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String[] args) {
		
		int n1, n2, n3, maior = 0;
				
		Scanner leia = new Scanner(System.in);
				
		System.out.println("Digite o 1� n�mero: ");
		n1 = leia.nextInt(); 
		System.out.println("Digite o 2� n�mero: ");
		n2 = leia.nextInt(); 
		System.out.println("Digite o 3� n�mero: ");
		n3 = leia.nextInt(); 
				
			
		if (n1 <= n2 && n2 <= n3) {
		 maior = n3;
		System.out.println("O maior n�mero digitado �: " + maior);
		}
		else if (n1 <= n3 && n3 <= n2) { 
		maior = n2; 
		 System.out.println("O maior n�mero digitado �: " + maior);
		} else if (n2 <= n3 && n3 <= n1) { 
		maior = n1; 
		System.out.println("O maior n�mero digitado �: " + maior);
		} else if (n2 <= n1 && n1 <= n3) { 
		maior = n3;
		System.out.println("O maior n�mero digitado �: " + maior);
		} else if (n3 <= n2 && n2 <= n1) { 
		maior = n1; 
		System.out.println("O maior n�mero digitado �: " + maior);
		} else { System.out.println("O maior n�mero digitado �: " + maior);
	
	
	}

	}
}
/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
*/
