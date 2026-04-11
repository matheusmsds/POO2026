// este arquivo abrange o exercicio 9 até o 10

class ContaBancaria{
    String titular;
    double saldo;

    ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar(double valor){
        this.saldo += valor;
    }

    void sacar(double valor){
        if (valor <= this.saldo) {
            this.saldo -= valor;
        }else{
            System.out.println("Valor não disponivel");
        }

    }

    void exibirSaldo(){
        System.out.println("Titular: " + this.titular + " Saldo disponivel: " + this.saldo);
    }
}


public class exe03 {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Matheus", 0.0);
        conta.depositar(100.00);
        conta.depositar(2.0);
        conta.depositar(101.00);
        conta.exibirSaldo();

        conta.sacar(40);
        conta.sacar(1);
        conta.exibirSaldo();
        
    }
}
