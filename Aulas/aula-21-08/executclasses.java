public class executclasses {
    public static void main(String[] args) {
        Carro peuget208 = new Carro(0, 0, "peugeot208");
        Carro byd = new Carro(0, 0, "byd");
        Carro vectra = new Carro(0, 0, "Vectra");

        Carro carros[] = {peuget208, byd, vectra};

        for(int i = 0; i < 3; i++){
            System.out.println(carros[i]);
            System.out.println();
        }
    }
}
