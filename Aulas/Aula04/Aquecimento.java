import java.util.Scanner;
import java.util.Arrays;

public class Aquecimento{
    public static void main(String[] args) {
        int[] numeros = new int[5];
        AnalisarVetor(numeros);
        
        
    }
    public static double MediaVetor(int[] array){
        int soma = 0;
        double media = 0;

        for(int x = 0; x < array.length; x++){
            soma += array[x];
        }
        media = soma / array.length;

        return media;
    }
    public static int[] PreencherVetor(int[] array) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        return array;
    }
    public static void AnalisarVetor(int[] array){
        int maior = 0;
        int menor = 0;
        double media = 0;

        int[] vetor = PreencherVetor(array);

        for(int j = 0; j < array.length; j++){
            maior = vetor[0];
            menor = vetor[0];
            if (array[j] > maior) {
                maior = vetor[j];
            }
            if (array[j] < menor) {
                maior = vetor[j];
            }
        }
        media = MediaVetor(vetor);

        System.out.println(Arrays.toString(vetor));
        System.out.print("Maior numero: " + maior + "\n");
        System.out.print("Menor numero: " + menor + "\n");
        System.out.print("Media dos numeros: " + media);
    }
}   