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
		
		System.out.println("\nO animal щ um: " + getAnimal() +"\nO nome dele щ: " + getNome() +"\nO som dele щ: " + getSom() + "\nA idade щ: " + getIdade() + " anos" + "\nA aчуo dele щ: " + getAcao());
		
		
	}
	
	public String getNome() {
		return nome;
	}
	public String getAcao() {
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
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
