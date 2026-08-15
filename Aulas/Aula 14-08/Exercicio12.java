package poo1408;

/**
 * 
• Avalie preco, percentual e preco - percentual dentro de aplicarDesconto().
• Qual deveria ser o preco apos um desconto de 10%?
• Explique a diferenca entre o ponto onde o erro e percebido e o ponto onde o estado incorreto e criado.
• Corrija a formula do desconto.
 */

class Produto {
	private double preco;

	public Produto(double preco) {
		this.preco = preco;
	}

	public void aplicarDesconto(double percentual) {
		this.preco = this.preco - (this.preco * percentual / 100.0);
	}

	public double getPreco() {
		return this.preco;
	}
}

public class Exercicio12 {
	public static void main(String[] args) {
		Produto produto = new Produto(1000);
		produto.aplicarDesconto(10);
		double precoFinal = produto.getPreco();
		System.out.println("Preco final: " + precoFinal);
	}
}