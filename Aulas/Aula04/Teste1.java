import java.util.Scanner;

class Interna{

    public void Programa() {
        Scanner teclado = new Scanner(System.in);
        int num, max, min, soma;
        max = min = soma = 0;
        System.out.println("digite na sequencia 5 numeros (inteiros, maior zero)...");
        for (int idx = 0; idx < 3; idx++) {
            num = teclado.nextInt();
            if (idx == 0) {
                max = min = soma = num;
                continue;
            }

            if (num > max)
                max = num;
            if (num < min)
                min = num;
            soma = soma + num;
        }
        teclado.close();
        
        float media = soma / 3;
        System.out.println("Maior numero: " + max);
        System.out.println("Menor numero: " + min);
        System.out.println("Media: " + media);
    }
}

public class Teste1{

    public static void main(String[] args){
        Interna codigo = new Interna();
        codigo.Programa();
        
    }
}
