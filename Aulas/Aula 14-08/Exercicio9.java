package poo1408;

class Conta {
	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) throws Exception {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		}else {
			throw new Exception("Valor inválido!");
		}
	}

	public double getSaldo() {
		return this.saldo;
	}
}

public class Exercicio9{
	public static void main(String[] args) {
		Conta conta = new Conta(200);
		
		try {
			conta.sacar(220);
			System.out.println(conta.getSaldo());
		} catch (Exception e) {
			GerenteExcessoes manager = new GerenteExcessoes();
			manager.tratar_excessao(e);
		}
	}
}
