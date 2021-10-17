package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao;
		String produtoAdd, produtoRem, substituir, novoProduto; 
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		 
		do {
			System.out.println(" +---------------------------------------+");
			System.out.println(" |           Escolha uma opção           |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |           MENU DE OPÇÕES              |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |    1 - Adicionar produto ao estoque   |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |    2 - Remover produto do estoque     |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |    3 - Atualizar produtos do estoque  |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |    4 - Ver produtos em estoque        |");
			System.out.println(" +---------------------------------------+");
			System.out.println(" |    0 - Sair                           |");
			System.out.println(" +---------------------------------------+");
			System.out.print("\nDIGITE SUA OPÇÃO: "); 
			opcao = leia.nextInt();
						
			switch(opcao) {
			case 1:
				leia.nextLine();
				System.out.print("\nDigite o nome do produto para adicionar ao estoque: ");
				produtoAdd = leia.nextLine();
				estoque.add(produtoAdd);
				System.out.println("\nProduto adicionado com sucesso.");
				break;
				
			case 2:
				leia.nextLine();
				System.out.print("\nDigite o nome do produto que deseja remover do estoque: ");
				produtoRem = leia.nextLine();
				if(estoque.contains(produtoRem)) {
					estoque.remove(produtoRem);
					System.out.println("\nProduto removido com sucesso.");
				}
				else System.out.println(produtoRem + " não existe no estoque.");
				break;
				
			case 3: 
				leia.nextLine();
				System.out.print("\nDigite o nome do produto que deseja substituir no estoque: "); 
				substituir=leia.nextLine();
				if(estoque.contains(substituir)) {
					System.out.println("\nDigite o nome do produto que substituirá "+substituir+ ": ");
					novoProduto=leia.nextLine();
					estoque.remove(substituir);
					estoque.add(novoProduto);
					System.out.println("\nProduto substituído com sucesso.");
				}
				else System.out.println("Impossível alterar.\n" +substituir+" não existe no estoque.");
				break;
				
			case 4:
				leia.nextLine();
				System.out.print("\nPRODUTOS EM ESTOQUE: ");	
				System.out.println(estoque);
				
				break;
				
				default: System.out.print("\n-------------------------------------------------");
				
			}
		}while(opcao!=0);
	
	}

}