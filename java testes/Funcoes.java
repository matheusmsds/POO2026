import java.util.Scanner;

public class Funcoes{
    public static void RegistrarPessoas(Pessoa pessoas [], Scanner scanner){
        
        System.out.println("Quantidade de pessoas a serem registradas: " + pessoas.length);
        
        for(int i = 0; i < pessoas.length; i++){
            pessoas[i] = new Pessoa();

            System.out.println("Informe a idade da " + (i + 1) + " º pessoa: ");
            int idade = scanner.nextInt();
            
            scanner.nextLine();
            
            System.out.println("Informe o nome da " + (i + 1) + " º pessoa: ");
            String nome = scanner.nextLine();

            pessoas[i].setNome(nome);
            pessoas[i].setIdade(idade);
            
        }
        
    }

    public static void PrintarPessoas(Pessoa pessoas []){
        System.out.println("\n--- Lista de Pessoas ---");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Nome: " + pessoas[i].getNome() + " | Idade: " + pessoas[i].getIdade());
        }
    }

    public static int QuantidadePessoas(Scanner scanner){
        System.out.println("Informe a quantidade de pessoas: ");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        return qtd;
    }
}
