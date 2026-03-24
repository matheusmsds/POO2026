import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoas [] = new Pessoa[Funcoes.QuantidadePessoas(scanner)];
        Funcoes.RegistrarPessoas(pessoas, scanner);
        Funcoes.PrintarPessoas(pessoas);

        scanner.close();
        }

}