// este arquivo abrange o exercicio 4 até o 8

class Aluno{
    String nome;
    double nota;
    static int totalAprovados;

    Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    void verificarSituacao(){
        String situacao = "null";

        if (this.nota >= 7) {
            situacao = "Aprovado";
            totalAprovados++;

        }else if (this.nota >= 5 && this.nota < 7) {
            situacao = "Recuperação";

        }else {
            situacao = "Reprovado";
        }

        System.out.println("Nome: " + this.nome + " Nota: " + this.nota + " Situação: " + situacao);
    }

    static void exibirTotalAprovados() {
        System.out.println("Total de alunos aprovados: " + totalAprovados);
    }

}

public class exe02 {
    public static void main(String[] args) {
        Aluno [] vet = {new Aluno("Tadeu",5.0), new Aluno("Leo", 7.0), new Aluno("Ted", 7.0)};

        for(int i = 0; i < vet.length; i++){
            vet[i].verificarSituacao();
        }

        Aluno.exibirTotalAprovados();
        double medianotas = mediaNotas(vet);
        System.out.println(medianotas);
    }
    public static double mediaNotas(Aluno [] vet){
        int soma = 0;
        for(int i = 0; i < vet.length; i++){
            soma += vet[i].nota;
        }
        
        return soma / vet.length;
    }
}
