package array;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int A[] = {1, 0, 5, -2, -5, 7}, i;
		
		System.out.println("Valores: A[] = {"+A[0]+", "+A[1]+", "+A[2]+", "+A[3]+", "+A[4]+", "+A[5]+"}");
		
		System.out.println("\nA soma dos valores das linhas 0, 1 e 5 é: "+(A[0]+A[1]+A[4])+".\n");
		
		A[4] = 100;	
		
		for (i = 0; i < 6; i++) {
			System.out.println(" Valor do Vetor A["+i+"] é igual a: "+A[i]);
		}
		
	}
}