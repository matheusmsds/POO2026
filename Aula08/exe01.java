// esse arquivo vai do exercicio 1 ao 3

class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    void exibirDados(){
        System.out.println("Nome: " + this.nome + " Preço: " + this.preco);
    }

    double calcularDesconto(double percentual){
        double desconto = this.preco * (percentual / 100);

        return desconto;
    }
    
}
public class exe01 {
    public static void main(String[] args) {
        Produto produto = new Produto("Tv", 1200.00);

        produto.exibirDados();
        double desconto = produto.calcularDesconto(50.00);

        System.out.println(desconto);
    }
    
}