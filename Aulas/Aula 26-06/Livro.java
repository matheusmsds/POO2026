
/**
 * Livro
 */
public class Livro {
    Pessoa poseDPessoa;
    String nome;

    Livro(String n){
        this.nome = n;
    }

    public void tenhoPosse(Pessoa p){
        this.poseDPessoa = p;
    }
}