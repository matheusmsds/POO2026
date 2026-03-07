
class Pessoa {
    String nome;
    int idade;

    public void CriarPessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void MostrarInfo(){
        System.out.println("Nome: " + this.nome + ", " + "Idade: " + this.idade);
    }
    
}

public class Aula {
    public static void main(String[] args) {
        Pessoa pessoa;

        pessoa = new Pessoa();
        pessoa.CriarPessoa("Matheus", 18);
        pessoa.MostrarInfo();

        pessoa = new Pessoa();
        pessoa.CriarPessoa("Marcelo", 35);
        pessoa.MostrarInfo();

        pessoa = new Pessoa();
        pessoa.CriarPessoa("Jao", 20);
        pessoa.MostrarInfo();
    }   
}