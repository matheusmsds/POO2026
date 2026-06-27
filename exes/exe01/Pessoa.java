package exes.exe01;


public class Pessoa {
    String nome;
    int idade;
    
    public Pessoa(String n, int i){
        this.nome = n;
        this.idade = i;
     
    }

    @Override
    public String toString(){
        return this.nome + "," + this.idade + "\n";
    }
}
