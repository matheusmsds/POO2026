class MaiorValor{
    int retornarIndice(int vetor[]){
        int maiorValor = vetor[0];
        int indice = 0;
        for(int i = 1; i < vetor.length; i++){
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                indice = i;
                
            }
        }
        return indice;
    }
}

public class ExercicioEcontrarMaior {
    public static void main(String[] args) {
        int vetor [] = {2,5,1,9,3};
        MaiorValor valor = new MaiorValor();

        int indice = valor.retornarIndice(vetor);
        System.out.println("Maior indice do vetor: " + indice);

    }
}