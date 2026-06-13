import java.util.Random;

class Animal {
    String nome;
    int idade;

     public void emitirSom() {

    }
}

class Cao extends Animal{
    public void emitirSom() {
        System.out.println( "Au Au!");
    }
}

class Gato extends Animal{

    public void emitirSom() {
        System.out.println("Miau Miau!");
    }
}
class Passaro extends Animal{
    public void emitirSom() {
        System.out.println("Som de passaro!");
    }
}


public class Main {
    public static void main(String[] args) {
        objetosAleatorios(10);
    }

    public static void jeitoquefunciona(){
        // Animal vetor[] = new Animal[3];

        // vetor[0] = new Gato("Gato", 2);
        // vetor[1] = new Cao("Cachorro", 2);
        // vetor[2] = new Passaro("Passaro", 1);

        // for(int i = 0; i < vetor.length; i++){
        //     vetor[i].emitirSom();
        // }
    }

    public static void objetosAleatorios(int tam){
        Animal vetor[] = new Animal[tam];
        Random random = new Random();

        for(int i = 0; i < vetor.length; i++){
            int tipo = random.nextInt(3);

            if(tipo == 0){
                vetor[i] = new Cao();
            }else if(tipo == 1){
                vetor[i] = new Gato();
            }else if(tipo == 2){
                vetor[i] = new Passaro();
            }
        }
        for(int i = 0; i < vetor.length; i++){
            vetor[i].emitirSom();
        }
    }
}
