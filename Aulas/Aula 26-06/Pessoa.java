
/**
 * Pessoa
 */
public class Pessoa {
    Livro possui;
    String nome;
    int idade;
    
     Pessoa(String n, int i){
        this.nome = n;
        this.idade = i;
    }

    public void adquirirLivro(Livro umLivro){
        this.possui = umLivro;
        umLivro.tenhoPosse(this);
    }

    @Override
    public String toString(){
        return "Livros de " + this.nome  + ": \n" + possui.nome;  
    }
}