package poo;

import java.util.Scanner;

public class Poliformismo {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		int opcao, opcao1, opcao2, opcao3;
		
		
		Cachorro cachorrinho = new Cachorro("Robie", "Au Au", "Cachorro", "Correr", 5);
		Cavalo cavalinho = new Cavalo ("Magrelo", " Hiin in in", "Cavalo", "Correr", 10);
		Preguica preguicinha = new Preguica ("Soninho", "ZZZZzzzzZZZZ", "Preguiça", "Dormir", 7);
	
	
		do {
		System.out.println(" +---------------------------------------+");
		System.out.println(" |           Escolha um animal           |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |           MENU DE OPÇÕES              |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |     1- Cachorro                       |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |     2- Cavalo                         |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |     3- Preguiça                       |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |     0- Sair                           |");
		System.out.println(" +---------------------------------------+");
		
		opcao = leia.nextInt();
		
		switch (opcao) {
		
		
		case 1: 
			
			System.out.println(" +---------------------------------------+");
			System.out.println(" |         Você escolheu: Cachorro       |");
			System.out.println(" +---------------------------------------+\n\n");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |           MENU DE OPÇÕES              |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |     1- Emitir som                     |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |     2- Correr                         |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |     3- Saber a idade                  |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |     0- Sair                           |");
			System.out.println(" +---------------------------------------+");
			
			opcao1 = leia.nextInt();
			switch (opcao1) {
			
			case 1:
				
				cachorrinho.getSom();
				opcao1 = 0;
				opcao = 0;
				break;
				
			case 2:
				
				cachorrinho.getAcao();
				opcao1 = 0;
				opcao = 0;
				break;
				
			case 3: 
				
				cachorrinho.getIdade();
				opcao1 = 0;
				opcao = 0;
				break;
				
				default:
					if  (opcao1 == 0 ) {
						
						System.out.println(" +---------------------------------------+");
						System.out.println(" |          Programa finalizado          |");
						System.out.println(" +---------------------------------------+");	
						
					} else {
					System.out.println(" +---------------------------------------+");
					System.out.println(" |             Opção inválida            |");
					System.out.println(" +---------------------------------------+");
					break;
					}
			
			
			}while (opcao1 !=0);
		
			
		case 2:
			
			System.out.println(" +---------------------------------------+");
			System.out.println(" |         Você escolheu: Cachorro       |");
			System.out.println(" +---------------------------------------+\n\n");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |           MENU DE OPÇÕES              |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |     1- Emitir som                     |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |     2- Correr                         |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |     3- Saber a idade                  |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |     0- Sair                           |");
			System.out.println(" +---------------------------------------+");
			
			opcao2 = leia.nextInt();
			switch (opcao2) {
			
			case 1:
				
				cavalinho.getSom();
				opcao2 = 0;
				opcao = 0;
				break;
				
			case 2:
				
				cavalinho.getAcao();
				opcao2 = 0;
				opcao = 0;
				break;
				
			case 3: 
				
				cavalinho.getIdade();
				opcao2 = 0;
				opcao = 0;
				break;
				
				default:
					if  (opcao2 == 0 ) {
						
						System.out.println(" +---------------------------------------+");
						System.out.println(" |          Programa finalizado          |");
						System.out.println(" +---------------------------------------+");	
						
					} else {
					System.out.println(" +---------------------------------------+");
					System.out.println(" |             Opção inválida            |");
					System.out.println(" +---------------------------------------+");
					break;
					}
			
			} while (opcao2 !=0);
			break;
			
		case 3:
			System.out.println(" +---------------------------------------+");
			System.out.println(" |         Você escolheu: Preguiça       |");
			System.out.println(" +---------------------------------------+\n\n");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |           MENU DE OPÇÕES              |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |     1- Emitir som                     |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |     2- Dormir                         |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |     3- Saber a idade                  |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |     0- Sair                           |");
			System.out.println(" +---------------------------------------+");
			
			opcao3 = leia.nextInt();
			switch (opcao3) {
			
			case 1:
				
				preguicinha.getSom();
				opcao3 = 0;
				opcao = 0;
				break;
				
			case 2:
				
				preguicinha.getAcao();
				opcao3 = 0;
				opcao = 0;
				break;
				
			case 3: 
				
				preguicinha.getIdade();
				opcao3 = 0;
				opcao = 0;
				break;
				
				default:
					if  (opcao3 == 0 ) {
						
						System.out.println(" +---------------------------------------+");
						System.out.println(" |          Programa finalizado          |");
						System.out.println(" +---------------------------------------+");	
						
					} else {
					System.out.println(" +---------------------------------------+");
					System.out.println(" |             Opção inválida            |");
					System.out.println(" +---------------------------------------+");
					break;
					}
			
			} while (opcao3 !=0);
			break;
			
		 
		     default: 
			
			if  (opcao == 0 ) {
				
				System.out.println(" +---------------------------------------+");
				System.out.println(" |          Programa finalizado          |");
				System.out.println(" +---------------------------------------+");	
				
			} else {
			System.out.println(" +---------------------------------------+");
			System.out.println(" |             Opção inválida            |");
			System.out.println(" +---------------------------------------+");
			break;
		
		
			}
		} 
	
		}while(opcao != 0);
		

} 

}
