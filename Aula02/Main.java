import  java.util.Scanner;
// versão IntelliJ IDEA Community Edition 2023.2.2
public class Main{
    public static  void main(String[] args){
        double real, dolar,convert_real, convert_dolar, convert;
        Scanner scanner =  new Scanner(System.in);

        dolar = 5.18;

        System.out.println("Informe o valor em reais: ");
        real = scanner.nextDouble();
        convert_dolar = real / dolar;
        convert_real = real * dolar;

        System.out.printf("Real para dolar: $%.2f%n", convert_dolar);
        System.out.printf("Dolar para real: R$%.2f%n", convert_real);
//        int nasc, ano, anos;
//        Scanner scanner =  new Scanner(System.in);
//        String nome;
//
//        ano = 2026;
//
//        System.out.println("Informe seu nome: ");
//        nome = scanner.nextLine();
//
//        scanner.nextLine();
//
//        System.out.println("Informe a sua data de nascimento: ");
//        nasc = scanner.nextInt();
//
//        scanner.close();
//
//        anos = ano - nasc;
//
//        System.out.println( nome + " você nasceu em " + nasc + " ou seja a " + anos + " anos.");
    }
}