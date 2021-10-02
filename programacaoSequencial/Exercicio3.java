package programacaoSequencial;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String args[])
	{
		int segundos, horas, minutos;
			
		System.out.println("Qual foi a duração do evento em segundos? ");
		
		Scanner ler = new Scanner(System.in);
		segundos = ler.nextInt();

		horas = segundos/3600;
		minutos = (segundos - (horas * 3600)) / 60;
		segundos = segundos - (horas * 3600) - (minutos * 60);
		

		System.out.println("\nO evento durou " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos."); 
	}

}
