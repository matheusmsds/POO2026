class MaiorSoma{
        int maiorSoma(int vetor[]){
            int soma = 0;
            int maiorSoma = vetor[0] + vetor[1];
            int indice = 0;
            
            for(int i = 1; i < vetor.length; i++){
                soma = vetor[i] + vetor[i-1];
                if (soma > maiorSoma) {
                    maiorSoma = soma;
                    indice = i;
                }
            }
            return indice;
        }
}

public class MaiorSomaConsecutiva {
    public static void main(String[] args) {
        int vetor [] = {9,1,3,7,5,2};
        MaiorSoma valor = new MaiorSoma();

        int maior = valor.maiorSoma(vetor);
        System.out.println("Maior soma consecutiva: " + maior);

    }
}