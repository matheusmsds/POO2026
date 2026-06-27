package exes.exe02;

// -- versao-1
public class Principal {

    public static void main(String[] args) {
        Veiculo v1, v2, v3;

        v1 = new Carro("Jetta", "Carro");
        v2 = new Aviao("F14", "Aviao");
        v3 = new Barco("Aysso ", "Barco");

        

        v1.mover();
        v2.mover();
        v3.mover();
    }
}

