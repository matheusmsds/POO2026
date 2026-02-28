import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  int numero;
        System.out.println("Digite um número para a tabuada: ");
        numero = scanner.nextInt();
        System.out.println("Tabauda do: " + numero);
        System.out.println("=============================================");
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + "x" + i + "=" + (i * numero));
        }
        System.out.println("=============================================");

    } // EXECUÇÃO DAS LINHAS DE EXECUÇÃO: 1,2,3,4,5,6,7,8,9,10,9,10,9,10,9,10,9,10,9,10,9,10,9,10,9,10,9,10,12
}
