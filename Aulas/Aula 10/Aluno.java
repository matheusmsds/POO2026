public class Aluno extends Pessoa {
    String matricula;
    char nota;

    public Aluno(String nome, int idade, String matricula, char nota){
        super(nome, idade);

        this.matricula = matricula;
        this.nota = nota;
    }

    void dadosdoaluno() {
        System.out.println("Matricula do aluno: " + "[" + this.matricula + "]" + "\n"+ "Nota: " + "[" + this.nota + "]");
    };
}