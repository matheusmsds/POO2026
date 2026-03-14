import java.util.Arrays;
public class Aula {
    public static void main(String[] args) {
        int[] vet = {1,2,3,4,5,6,7,8,9,10};
        int[] idade = new int[10]; 
        idade[0] = 1;

        System.out.println(Arrays.toString(idade));
        int soma = 0;
        for(int i = 0; i < vet.length; i++){
            soma += vet[i];

        }
        System.out.println(soma);

    }
}