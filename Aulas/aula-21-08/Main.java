public class Main {
    public static void main(String[] args) {
        Calculavel[] figuras = new Calculavel[3];
        figuras[0] = new Retangulo(4.0, 3.0);
        figuras[1] = new Circulo(2.5);
        figuras[2] = new Retangulo(-5.0, 10.0);
        for (int i = 0; i < figuras.length; i++) {
            Calculavel figura = figuras[i];
            System.out.println("Area: " + figura.calcularArea());
            System.out.println("Perimetro: " + figura.calcularPerimetro());
        }
    }
}