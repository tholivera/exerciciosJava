package poo;

public class TesteAnimais extends Heranca {
	
	public TesteAnimais(String nome, String som, String animal, String acao, int idade) {
		super(nome, som, animal, acao, idade);
		// TODO Auto-generated constructor stub
	}

	public static void main (String[] args) {
		Heranca preguica = new Heranca("Soninho", "ZZZZzzzzZZZZ", "Preguiça", "Dormir", 7);
		
		preguica.status();
	
		
		Heranca cavalo = new Heranca("Magrelo", " Hiin in in", "Cavalo", "Correr", 10);
			
		cavalo.status();
		
		
			Heranca cachorro = new Heranca("Robie", "Au AU", "Cachorro", "Correr", 5);
			
			cachorro.status();
				
}
}