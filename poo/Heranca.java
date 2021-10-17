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
		
		System.out.println("\nO animal � um: " + getAnimal() +"\nO nome dele �: " + getNome() +"\nO som dele �: " + getSom() + "\nA idade �: " + getIdade() + " anos" + "\nA a��o dele �: " + getAcao());
		
		
	}
	
	public String getNome() {
		return nome;
	}
	public String getAcao() {
		System.out.print("O animal ");
		System.out.print(animal);
		System.out.print(" come�ou a ");
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
		System.out.print(" �: ");
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
