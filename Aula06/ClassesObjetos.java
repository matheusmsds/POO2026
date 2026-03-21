class Pessoa{
    //atributos
    String nome;
    String nasc;
   
    //construtor

    Pessoa(String nome){
        System.out.println("Criando: " + nome);
        this.nome = nome;
    }
    Pessoa(String nome, String nasc){
        this.nome = nome;
        this.nasc = nasc;
    }
    //metodos
    void andar(){
        System.out.println("Andando...");
    }
    void falar(){
        System.err.println("Olá, meu nome é: " + this.nome);
        System.err.println("Eu nasci em: " + this.nasc);
    }

    @Override
    public String toString(){
        String tmp = "pessoa" + this.nome;
        return tmp;
    }

}

public class ClassesObjetos {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Matheus");

        p.falar();
        p.andar();
    }
    
    
}