import java.util.Scanner;
class Vetorde5{
    public static void coletarNumeros(int vet[]){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < vet.length; i++){
            System.out.print("Informe o " + (i + 1) + "º numero: ");
            vet[i] = scanner.nextInt();
        }
        scanner.close();
    }
    public static int pegarMaior(int vet[]){
        int maior = vet[0];
        for(int i = 1; i < vet.length; i++){
            if (maior < vet[i]) {
                maior = vet[i];
            }
        }
        return maior;
    }    
}

public class Exercicio3 {
    public static void main(String[] args) {
        int [] vet = new int[5];
        Vetorde5.coletarNumeros(vet);
        int maior = Vetorde5.pegarMaior(vet);
        System.out.println("Maior número do vetor: " + maior);
    }
}