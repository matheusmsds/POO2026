public class Carro implements VeiculoMotorizado {
    int km;
    int combustivel;
    public void deslocar(){
        System.out.println("Moto está se deslocando...");
        this.km++;
    }
    public double kilometragem(){
        return this.km;
    }
    public void abastecer(int valor){
        System.out.println("Carro está abastecendo na qtd de: " + valor);
        combustivel = combustivel + valor;

    }
    public void frear(){
        System.out.println("Carro freando...");

    }


}