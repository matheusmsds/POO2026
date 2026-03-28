package exercicio01;

class Pessoa2 {
	String nome;
	int idade;
	
	Pessoa2(String n, int id ){
		this.nome = n;
		this.idade = id;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}