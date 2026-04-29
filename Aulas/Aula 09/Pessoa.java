public class Pessoa {
    private int idade;
    private String cidade;
    
    public int getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "Idade: " + idade + ", Cidade: " + cidade;
    }
}
