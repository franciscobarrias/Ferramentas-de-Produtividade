package prog2.exercicios; // Certifica-te de que o nome do pacote está correto

public class Cilindro {
    private double raio;
    private double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularVolume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public static void main(String[] args) {
        Cilindro c = new Cilindro(5, 10);
        System.out.println("Volume do cilindro: " + c.calcularVolume());
    }
}
