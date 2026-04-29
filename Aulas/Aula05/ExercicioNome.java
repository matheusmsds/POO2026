import java.util.Scanner;

class Pessoas{
    public static void pegarIdade(int idades[]){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < idades.length; i++){
            System.out.println("Idade [" + i + "] :");
            idades[i] = scanner.nextInt();
        }
    }
    public static void pegarNome(String nomes[]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome [" + i + "] :");
            nomes[i] = scanner.nextLine();
        }
    }
    public static void pegarMaiorIdade(int idades[], String nomes[]){
        int maior = 0;
        int i = -1;
        for(int idx = 0; idx < nomes.length; idx++){
            if (idades[idx] > maior) {
                maior = idades[idx];
                i += 1;
            }
        }
        System.out.println("O " + nomes[i] + " tem a maior idade: " + idades[i]);
    }
}
public class ExercicioNome {
    public static void main(String[] args) {
        int [] idades = new int[5];
        String [] nomes = new String[5];
        Pessoas.pegarIdade(idades);
        Pessoas.pegarNome(nomes);
        Pessoas.pegarMaiorIdade(idades, nomes);
    }
}