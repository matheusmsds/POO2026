import java.util.Scanner;
public class Funcoes {
    public static void main(String [] args) {

        int inicial = PegarValor("Informe o valor inicial: ");
        int nfinal = PegarValor("Informe o valor final: ");
        int plim = PegarValor("Informe Plim: ");

        Plim(inicial, nfinal, plim);
    }
    public static int PegarValor(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);

        return scanner.nextInt();
    }
    public static void Plim(int inicial, int nfinal, int plim){
        for (int i = inicial; i <= nfinal; i++) {
            if (i % plim == 0) {
                System.out.print("x ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
    // EXECUÇÃO DAS LINHAS: 3, 4, 11, 12 ,13, 14, 5, 12 ,13, 14, 6, 12 ,13, 14, 9, 18, 19, 20, 18, 19, 20, 21, 22, 18, 19, 20,
    // 18, 19, 20, 21, 22, 18, 19, 20, 18, 19, 20, 21, 22, 18, 19, 20, 21, 22, 18, 19, 20, 21, 22, 18, 19, 20, 18, 19, 20, 21, 22, 18, 19, 20
}

