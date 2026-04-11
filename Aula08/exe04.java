// exercicio 11

class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    void exibirDados() {
        System.out.println("Nome: " + this.nome + " Preço: " + this.preco);
    }

    double calcularDesconto(double percentual) {
        double desconto = this.preco * (percentual / 100);

        return desconto;
    }

}

public class exe04 {
    public static void main(String[] args) {
        Produto vet [] = {new Produto("TV", 2500.0), new Produto("Celular", 1500.0), new Produto("Notebook", 3400.0)};
        String produto = maiorProduto(vet);
        System.out.println(produto);
    }

    public static String maiorProduto(Produto vet [] ){
        double maior = vet[0].preco;
        String produto = vet[0].nome;

        for(int i = 0; i < vet.length; i++){
            if (vet[i].preco > maior) {
                produto = vet[i].nome;
            }
        }
        return produto;
    }

}