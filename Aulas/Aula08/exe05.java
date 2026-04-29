
// este arquivo vai do exercico 12 até 14
import java.util.Scanner;

class Aluno {
    String nome;
    double nota;

    Aluno(String nome, double notas) {
        this.nome = nome;
        this.nota = nota;
    }
}

public class exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] vet = new Aluno[3];

        for (int i = 0; i < vet.length; i++) {
            vet[i].nome = scanner.nextLine();
            vet[i].nota = scanner.nextDouble();
        }

        double maiorNota = vet[0].nota;
        String nomeAluno = vet[0].nome;

        for (int i = 0; i < vet.length; i++) {
            if (maiorNota < vet[i].nota) {
                nomeAluno = vet[i].nome;
            }
        }
        System.out.println(nomeAluno);
    }
}
