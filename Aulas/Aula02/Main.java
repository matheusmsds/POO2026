import  java.util.Scanner;
// versão IntelliJ IDEA Community Edition 2023.2.2
public class Main{
    public static  void main(String[] args){
        double real, dolar,convert_real, convert_dolar;
        int escolha;
        Scanner scanner =  new Scanner(System.in);

        dolar = 5.17;
        
        System.out.println("Escolha uma opção para converter:\nReais para dolar(1)\nDolar para reais(2)\n ");
        escolha = scanner.nextInt();


        if(escolha == 1){
            System.out.println("Informe o valor em reais: ");
            real = scanner.nextDouble();
            convert_dolar = real / dolar;
            System.out.printf("Real para dolar: $%.2f%n", convert_dolar);
        }else if(escolha == 2){
            System.out.println("Informe o valor em dolar: ");
            real = scanner.nextDouble();
            convert_real = real * dolar;
            System.out.printf("Dolar para real: R$%.2f%n", convert_real);

        }
        scanner.close();
    }
}