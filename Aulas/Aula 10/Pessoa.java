public class Pessoa {
    int idade;
    String nome;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void mostrardados(){
        System.out.println("Dados gerais:\n[" + this.nome + "]" + "\n" + "[" + this.idade +"]");
    }

    @Override
    public String toString(){
        return "Nome: " + "[" + this.nome +"]" + " | Idade: " + "[" +this.idade + "]";
    }
}