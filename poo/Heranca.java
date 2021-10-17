package poo;

public class Heranca {
	
	public String nome;
	public String som;
	public int idade;
	public String animal;
	public String acao;
	
	public Heranca(String nome, String som, String animal, String acao, int idade) {
		
		this.nome = nome;
		this.som = som;
		this.animal = animal;
		this.acao = acao;
		this.idade = idade;
		
		
	}
	
		public void status () {
		
		System.out.println("\nO animal é um: " + getAnimal() +"\nO nome dele é: " + getNome() +"\nO som dele é: " + getSom() + "\nA idade é: " + getIdade() + " anos" + "\nA ação dele é: " + getAcao());
		
		
	}
	
	public String getNome() {
		return nome;
	}
	public String getAcao() {
		System.out.print("O animal ");
		System.out.print(animal);
		System.out.print(" começou a ");
		System.out.print(acao);
		System.out.println(".");
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSom() {
		System.out.print("O som do animal ");
		System.out.print(animal);
		System.out.print(" é: ");
		System.out.print(som);
		System.out.println(".");
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public int getIdade() {
		System.out.print(idade);
		System.out.println(" ano(s).");
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
