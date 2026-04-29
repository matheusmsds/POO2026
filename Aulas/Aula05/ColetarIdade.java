import java.util.Scanner;

class Auxiliar{
    public static void coletarIdades(int[] vet) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Informe a " + (i + 1) + "º idade: ");
            vet[i] = scanner.nextInt();

        }
        scanner.close();
    }

    public static int pegarMaior(int[] vet) {
        int maior = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }
        return maior;
    }

    public static void mostrarIdades(int[] vet) {
        for (int valor : vet) {
            System.out.println("Idade: " + valor);
        }
    }
    
}
public class ColetarIdade {
    public static void main(String[] args) {
        int idades[] = {0, 0, 0, 0};
        Auxiliar.coletarIdades(idades);
        int maior = Auxiliar.pegarMaior(idades);
        Auxiliar.mostrarIdades(idades);
        System.out.println("Maior idade: " + maior);
    }
}