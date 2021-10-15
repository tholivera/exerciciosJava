package projetojava;

import java.util.Scanner;

public class Cadastro {
	
	private String nome;
	private String email;
	
	
	Scanner leia = new Scanner(System.in);
	
	public Cadastro(String nome, String email) {
		
		this.nome = nome;
		this.email = email;
	
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
		System.out.println(" +---------------------------------------+");
		System.out.println(" |      Por favor, insira seu nome:      |");
		System.out.println(" +---------------------------------------+");
		nome = leia.nextLine();
				
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
		System.out.println(" +---------------------------------------+");
		System.out.println(" |      Por favor, insira seu e-mail:    |");
		System.out.println(" +---------------------------------------+");
		email = leia.nextLine();
			
	
	
	
	
	
	}
	
	
	
	
	
	
/*	public String getCadastroUsuario() {
		String cadastroUsuario
	}
	
	*/
	
	
	
	
	
	
	
	

}
