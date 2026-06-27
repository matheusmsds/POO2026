
public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Jao", 18);
        Livro li = new Livro( "Bah");
        
        p.adquirirLivro(li);
        
        System.out.println(p);
    }
}
