// mostrar o nome da pessoa com maior idade, usando classes.
// usar o vetor para guardar as pessoas, e fazer um algoritmo que calcula a maior idade.

class Pessoa2{
    String nome;
    int idade;

    Pessoa2(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}


public class NomePessoa {
    public static void main(String[] args) {
        Pessoa2 pessoas[] = new Pessoa2[3];
        pessoas[0] = new Pessoa2("Ana", 15);
        pessoas[1] = new Pessoa2("Bob", 18);
        pessoas[2] = new Pessoa2("Carl", 16);

        String result = maiorIdade(pessoas);
        System.out.println("Pessoa com maior idade: ");
        System.out.println(result);
    }
    public static String maiorIdade(Pessoa2 [] vetor){
        int maioridade = vetor[0].idade;
        String nome = vetor[0].nome;

        for(int i = 0; i < vetor.length; i++){
            if (vetor[i].idade > maioridade) {
                maioridade = vetor[i].idade;
                nome = vetor[i].nome;
            }
        }
        return nome;
    }
}