package poo;

public class Cliente {

	public String primeirNome;
	public String nomeDoMeio;
	public String ultimoNome;
	public float altura;
	public int cpf;
	public int idade;
	public int peso;
	
	public void nomeCompleto () {
		System.out.println(primeirNome + " " + nomeDoMeio + " " + ultimoNome);
	}
	
	public void infoStatus () {
		System.out.println("CPF n° " + this.cpf + "\nIdade: " + this.idade + " ano(s)" + "\nPeso: " + this.peso + " kg\nAltura: " + this.altura);
	}

	public String getPrimeirNome() {
		return primeirNome;
	}

	public void setPrimeirNome(String primeirNome) {
		this.primeirNome = primeirNome;
	}

	public String getNomeDoMeio() {
		return nomeDoMeio;
	}

	public void setNomeDoMeio(String nomeDoMeio) {
		this.nomeDoMeio = nomeDoMeio;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	

}

	
