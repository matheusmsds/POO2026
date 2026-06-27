package exes.exe02;

public class Veiculo {
    String nome;
    String tipo;

    public Veiculo(String n, String tipo){
        this.nome = n;
        this.tipo = tipo;
    }

	public void mover(){
       if(this.tipo == "Carro"){
        System.out.println(this + " anda pela estrada");
       }
       else if (this.tipo == "Aviao") {
        System.out.println(this + "voa pelos céus");
       }
       else if(this.tipo == "Barco"){
        System.out.println(this + "navega pelos mare");
       }else{
        System.out.print("Tipo de veiculo inválido");
       }
    }

    @Override
    public String toString(){
        return this.nome;
    }
}
