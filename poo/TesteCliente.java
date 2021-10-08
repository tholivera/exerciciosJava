package poo;

public class TesteCliente {
	public static void main (String[] args) {
	Cliente c1 = new Cliente();
	
	c1.primeirNome = "Thaís";
	c1.nomeDoMeio = "Oliveira da";
	c1.ultimoNome = "Silva";
	c1.altura = 1.70f;
	c1.cpf = 488584621;
	c1.idade = 22;
	c1.peso = 70;
	
	c1.nomeCompleto();
	c1.infoStatus();
		
		
		
	}

}
