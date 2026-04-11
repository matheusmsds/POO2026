
// este arquivo vai do exercico 12 até 14
import java.util.Scanner;

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class exe06 {
    public static void main(String[] args) {
        
        Pessoa[] vet = new Pessoa[3];

        preencherVetor(vet);
        logicaGeral(vet);

    }
    public static void preencherVetor(Pessoa vet []){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {

            String nome = scanner.nextLine();
            int idade = scanner.nextInt();

            scanner.nextLine();

            vet[i] = new Pessoa(nome, idade);
        }
    }
    public static void logicaGeral(Pessoa vet[]){
        int maiorIdade = vet[0].idade;
        String nomePessoa = vet[0].nome;

        String nomeMenorIdade = vet[0].nome;
        int soma = 0;
        int contador = 0;

        for (int i = 0; i < vet.length; i++) {
            if (maiorIdade < vet[i].idade) {
                nomePessoa = vet[i].nome;
            } else {
                nomeMenorIdade = vet[i].nome;
            }
            if (vet[i].idade > 18) {
                contador++;
            }
            soma += vet[i].idade;
        }

        double media = soma / vet.length;

        System.out.println("Nome da pessoa mais velha: " + nomePessoa);
        System.out.println("Nome da pessoa mais nova: " + nomeMenorIdade);
        System.out.println("Media das idades: " + media);
        System.out.println("Quantidade de pessoas com mais de 18 anos: " + contador);
    }
}
