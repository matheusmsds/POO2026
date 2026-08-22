public class Circulo implements Calculavel{
    private double raio;
    private static final double PI = 3.14159;
    public Circulo(double raio) {
        this.raio = raio;
    }
    public double calcularArea() {
        return PI * raio * raio;
    }
    public double calcularPerimetro() {
        return PI * raio * raio;
    }
}