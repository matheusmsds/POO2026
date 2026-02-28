import java.util.Scanner;
public class Plim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inicial: ");
        int inicial = scanner.nextInt();
        System.out.print("Informe o número final: ");
        int nfinal = scanner.nextInt();
        System.out.print("Informe o número plim: ");
        int plim = scanner.nextInt();

        for (int i = inicial; i <= nfinal; i++) {
            if (i % plim == 0) {
                System.out.print("x ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}