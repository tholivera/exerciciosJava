package programacaoSequencial;

import java.util.Scanner;
import java.math.*;

public class Exercicio4 {
	public static void main (String args[])
	{
		Double A, B, C, R, S, D;
				 
		System.out.println("Entre com o n�mero da posi��o A: ");
		
		Scanner leia = new Scanner(System.in);

		A = leia.nextDouble();
		
		System.out.println("\n Entre com o n�mero da posi��o B: ");
		
		B = leia.nextDouble();

		System.out.println("\n Entre com o n�mero da posi��o C: ");
		C = leia.nextDouble();

				
		R = Math.pow (A + B, 2);
	
	 	S = Math.pow(B+C, 2); 

	 	System.out.println("\n R = " + R + "\n S = " + S + "\n D = " + (R + S)/2);

		 
	}
}
